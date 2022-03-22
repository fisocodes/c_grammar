// Generated from C.g4 by ANTLR 4.9.2
package c_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(CParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExp(CParser.MulDivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(CParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExp(CParser.AddSubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExp(CParser.ValueExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(CParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifNoBraces}
	 * labeled alternative in {@link CParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNoBraces(CParser.IfNoBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBraces}
	 * labeled alternative in {@link CParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBraces(CParser.IfBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseNoBraces}
	 * labeled alternative in {@link CParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseNoBraces(CParser.ElseNoBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseBraces}
	 * labeled alternative in {@link CParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBraces(CParser.ElseBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifNoBraces}
	 * labeled alternative in {@link CParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifNoBraces(CParser.ElseifNoBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifBraces}
	 * labeled alternative in {@link CParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBraces(CParser.ElseifBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueCond}
	 * labeled alternative in {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueCond(CParser.TrueCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseCond}
	 * labeled alternative in {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseCond(CParser.FalseCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCond}
	 * labeled alternative in {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCond(CParser.ExpCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condCond}
	 * labeled alternative in {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondCond(CParser.CondCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCond(CParser.ParenCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLo(CParser.LoContext ctx);
}