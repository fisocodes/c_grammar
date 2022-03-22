import java.util.HashMap;

import c_grammar.CBaseVisitor;
import c_grammar.CParser;

public class MyVisitor extends CBaseVisitor<Object>{
    private String code = "";
    private int tabs = 0;
    private HashMap<String, Integer> memory = new HashMap<String, Integer>();

    private String printTabs(){
        String tabsString = "";

        for(int t = 0; t < tabs; t++){
            tabsString += "\t";
        }

        return tabsString;
    }

    @Override public String visitMain(CParser.MainContext ctx) {

        tabs++;
        code += "main\n{\n";

        for (CParser.StatementContext statement : ctx.statement()) {
            code += printTabs() + visit(statement.getChild(0));
        }

        tabs--;
        return code + "\n}";
    }

    @Override public String visitStatement(CParser.StatementContext ctx) {
        return visit(ctx.getChild(0)).toString();
    }

    @Override public String visitDeclaration(CParser.DeclarationContext ctx) {

        try{
            if(!memory.containsKey(ctx.ID().getText()))
            {
                memory.put(ctx.ID().getText(), 0);
                return "var " + ctx.ID().getText() + "\n";
            }else{
                throw new Exception("ERROR: Variable '" + ctx.ID().getText() + "' declared already.");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        return null;
    }

    @Override public String visitAssignment(CParser.AssignmentContext ctx) { 

        try{
            if(memory.containsKey(ctx.ID().getText()))
            {
                visit(ctx.expression());
                return ctx.ID().getText() + " = " + visit(ctx.expression()) + "\n";
            }else{
                throw new Exception("ERROR: Variable '" + ctx.ID().getText() + "' is not declared.");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return "";
    }

    @Override public String visitParenExp(CParser.ParenExpContext ctx){ 
        return "(" + visit(ctx.expression()) + ")";
    }

    @Override public String visitMulDivExp(CParser.MulDivExpContext ctx) {
        return visit(ctx.expression(0)) + " " + ctx.op.getText() + " " + visit(ctx.expression(1));
    }

    @Override public String visitAddSubExp(CParser.AddSubExpContext ctx) {
        return visit(ctx.expression(0)) + " " + ctx.op.getText() + " " + visit(ctx.expression(1));
    }

    @Override public String visitValueExp(CParser.ValueExpContext ctx) { 
        return ctx.VALUE().getText();
    }

    @Override public String visitIdExp(CParser.IdExpContext ctx) {
        try{
            if(memory.containsKey(ctx.ID().getText()))
            {
                return ctx.ID().getText();
            }else{
                throw new Exception("ERROR: Variable '" + ctx.ID().getText() + "' is not declared.");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        return "";
    }

    @Override public String visitPrint(CParser.PrintContext ctx) { 
        visit(ctx.expression());
        return "print " + visit(ctx.expression()) + "\n";
    }

    @Override public String visitIfelse(CParser.IfelseContext ctx) {
        String ifElseString = "";
        ifElseString = visit(ctx.getChild(0)).toString();

        if(ctx.children.size() > 1)
            for (int c = 1; c < ctx.children.size(); c++) {
                ifElseString += printTabs() + visit(ctx.getChild(c)).toString();
            }
        
        return ifElseString;
    }

    @Override public String visitIfNoBraces(CParser.IfNoBracesContext ctx) {
        tabs++;
        String ifStatement = "";
        ifStatement = "if " + visit(ctx.condition()) + "\n" + (ctx.statement() != null ? printTabs() + visit(ctx.statement()) : "");
        tabs--;  
        return ifStatement; 
    }

    @Override public String visitIfBraces(CParser.IfBracesContext ctx) {
        String ifStatement = "";
        ifStatement = "if " + visit(ctx.condition()) + "\n" + printTabs() + "{\n";
        tabs++;

        for (CParser.StatementContext statement : ctx.statement()) {
            if(statement != null){
                ifStatement += printTabs() + visit(statement);
            }
        }

        tabs--;
        return ifStatement + printTabs() + "}\n";
    }

    @Override public String visitElseNoBraces(CParser.ElseNoBracesContext ctx) {
        tabs++;
        String elseStatement = "";
        elseStatement = "else\n" + (ctx.statement() != null ? printTabs() + visit(ctx.statement()) : "");
        tabs--;  
        return elseStatement;
    }

    @Override public String visitElseBraces(CParser.ElseBracesContext ctx) {

        String elseStatement = "";
        elseStatement = "else\n" + printTabs() + "{\n";
        tabs++;

        for (CParser.StatementContext statement : ctx.statement()) {
            if(statement != null){
                elseStatement += printTabs() + visit(statement);
            }
        }

        tabs--;
        return elseStatement + printTabs() + "}\n";
    }

    @Override public String visitElseifNoBraces(CParser.ElseifNoBracesContext ctx) {
        tabs++;
        String elseifStatement = "";
        elseifStatement = "else if " + visit(ctx.condition()) + "\n" + (ctx.statement() != null ? printTabs() + visit(ctx.statement()) : "");
        tabs--;  
        return elseifStatement;
    }

    @Override public String visitElseifBraces(CParser.ElseifBracesContext ctx) {
        String elseifStatement = "";
        elseifStatement = "else if " + visit(ctx.condition()) + "\n" + printTabs() + "{\n";
        tabs++;

        for (CParser.StatementContext statement : ctx.statement()) {
            if(statement != null){
                elseifStatement += printTabs() + visit(statement);
            }
        }

        tabs--;
        return elseifStatement + printTabs() + "}\n";
    }

    @Override public String visitExpCond(CParser.ExpCondContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        return ctx.expression(0).getText() + " " + ctx.lo().getText() + " " + ctx.expression(1).getText();
    }

    @Override public String visitParenCond(CParser.ParenCondContext ctx) {
        return "(" + visit(ctx.condition()) + ")";
    }

    @Override public String visitCondCond(CParser.CondCondContext ctx) {
        return visit(ctx.condition(0)) + " " + ctx.lo().getText() + " " +visit(ctx.condition(1));
    }

    @Override public String visitTrueCond(CParser.TrueCondContext ctx) {
        return ctx.TRUE().getText();
    }

    @Override public String visitFalseCond(CParser.FalseCondContext ctx) {
        return ctx.FALSE().getText();
    }
}
