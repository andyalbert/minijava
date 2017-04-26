package compiler.parser.syn.classes;

import compiler.parser.syn.visitor.SyntaxRule;
import compiler.parser.syn.visitor.Visitor;

public abstract class Expression implements SyntaxRule {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
