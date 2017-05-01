package compiler.parser.syn.classes;

import java.util.ArrayList;

import compiler.analyzer.lex.Lexime;
import compiler.parser.syn.MutableInt;

public class OpMultiply extends ExpressionRest {
	public OpMultiply(ArrayList<Lexime> leximes, MutableInt leximesIndex) {
		op = leximes.get(leximesIndex.getValue()).value;
		leximesIndex.increment();
		expression = Expression.getExpression(leximes, leximesIndex);
	}
}
