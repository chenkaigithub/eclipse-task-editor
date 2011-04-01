/*
* generated by Xtext
*/

package de.sebastianbenz.task.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QueryGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Query");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQueryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionOrExprParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		//Query:
		//	{Query} expression=OrExpr?;
		public ParserRule getRule() { return rule; }

		//{Query} expression=OrExpr?
		public Group getGroup() { return cGroup; }

		//{Query}
		public Action getQueryAction_0() { return cQueryAction_0; }

		//expression=OrExpr?
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//OrExpr
		public RuleCall getExpressionOrExprParserRuleCall_1_0() { return cExpressionOrExprParserRuleCall_1_0; }
	}

	public class OrExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Keyword cOrKeyword_1_1_0 = (Keyword)cAlternatives_1_1.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_1_1 = (Keyword)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrExpr returns Expression:
		//	AndExpr ({OrExpr.left=current} ("or" | "||") right=AndExpr)*;
		public ParserRule getRule() { return rule; }

		//AndExpr ({OrExpr.left=current} ("or" | "||") right=AndExpr)*
		public Group getGroup() { return cGroup; }

		//AndExpr
		public RuleCall getAndExprParserRuleCall_0() { return cAndExprParserRuleCall_0; }

		//({OrExpr.left=current} ("or" | "||") right=AndExpr)*
		public Group getGroup_1() { return cGroup_1; }

		//{OrExpr.left=current}
		public Action getOrExprLeftAction_1_0() { return cOrExprLeftAction_1_0; }

		//"or" | "||"
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }

		//"or"
		public Keyword getOrKeyword_1_1_0() { return cOrKeyword_1_1_0; }

		//"||"
		public Keyword getVerticalLineVerticalLineKeyword_1_1_1() { return cVerticalLineVerticalLineKeyword_1_1_1; }

		//right=AndExpr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//AndExpr
		public RuleCall getRightAndExprParserRuleCall_1_2_0() { return cRightAndExprParserRuleCall_1_2_0; }
	}

	public class AndExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCompEqExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Keyword cAndKeyword_1_1_0 = (Keyword)cAlternatives_1_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_1_1 = (Keyword)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightCompEqExprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndExpr returns Expression:
		//	CompEqExpr ({AndExpr.left=current} ("and" | "&&") right=CompEqExpr)*;
		public ParserRule getRule() { return rule; }

		//CompEqExpr ({AndExpr.left=current} ("and" | "&&") right=CompEqExpr)*
		public Group getGroup() { return cGroup; }

		//CompEqExpr
		public RuleCall getCompEqExprParserRuleCall_0() { return cCompEqExprParserRuleCall_0; }

		//({AndExpr.left=current} ("and" | "&&") right=CompEqExpr)*
		public Group getGroup_1() { return cGroup_1; }

		//{AndExpr.left=current}
		public Action getAndExprLeftAction_1_0() { return cAndExprLeftAction_1_0; }

		//"and" | "&&"
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }

		//"and"
		public Keyword getAndKeyword_1_1_0() { return cAndKeyword_1_1_0; }

		//"&&"
		public Keyword getAmpersandAmpersandKeyword_1_1_1() { return cAmpersandAmpersandKeyword_1_1_1; }

		//right=CompEqExpr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//CompEqExpr
		public RuleCall getRightCompEqExprParserRuleCall_1_2_0() { return cRightCompEqExprParserRuleCall_1_2_0; }
	}

	public class CompEqExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompEqExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCompExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCompEqExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOperatorCompEqOperatorEnumRuleCall_1_1_0 = (RuleCall)cOperatorAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightCompExprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//CompEqExpr returns Expression:
		//	CompExpr ({CompEqExpr.left=current} operator=CompEqOperator right=CompExpr)*;
		public ParserRule getRule() { return rule; }

		//CompExpr ({CompEqExpr.left=current} operator=CompEqOperator right=CompExpr)*
		public Group getGroup() { return cGroup; }

		//CompExpr
		public RuleCall getCompExprParserRuleCall_0() { return cCompExprParserRuleCall_0; }

		//({CompEqExpr.left=current} operator=CompEqOperator right=CompExpr)*
		public Group getGroup_1() { return cGroup_1; }

		//{CompEqExpr.left=current}
		public Action getCompEqExprLeftAction_1_0() { return cCompEqExprLeftAction_1_0; }

		//operator=CompEqOperator
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }

		//CompEqOperator
		public RuleCall getOperatorCompEqOperatorEnumRuleCall_1_1_0() { return cOperatorCompEqOperatorEnumRuleCall_1_1_0; }

		//right=CompExpr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//CompExpr
		public RuleCall getRightCompExprParserRuleCall_1_2_0() { return cRightCompExprParserRuleCall_1_2_0; }
	}

	public class CompExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCompExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOperatorCompOperatorEnumRuleCall_1_1_0 = (RuleCall)cOperatorAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightUnaryExprParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//CompExpr returns Expression:
		//	UnaryExpr ({CompExpr.left=current} operator=CompOperator right=UnaryExpr)*;
		public ParserRule getRule() { return rule; }

		//UnaryExpr ({CompExpr.left=current} operator=CompOperator right=UnaryExpr)*
		public Group getGroup() { return cGroup; }

		//UnaryExpr
		public RuleCall getUnaryExprParserRuleCall_0() { return cUnaryExprParserRuleCall_0; }

		//({CompExpr.left=current} operator=CompOperator right=UnaryExpr)*
		public Group getGroup_1() { return cGroup_1; }

		//{CompExpr.left=current}
		public Action getCompExprLeftAction_1_0() { return cCompExprLeftAction_1_0; }

		//operator=CompOperator
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }

		//CompOperator
		public RuleCall getOperatorCompOperatorEnumRuleCall_1_1_0() { return cOperatorCompOperatorEnumRuleCall_1_1_0; }

		//right=UnaryExpr
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//UnaryExpr
		public RuleCall getRightUnaryExprParserRuleCall_1_2_0() { return cRightUnaryExprParserRuleCall_1_2_0; }
	}

	public class UnaryExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnaryExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cUnaryExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Keyword cNotKeyword_1_1_0 = (Keyword)cAlternatives_1_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_1_1_1 = (Keyword)cAlternatives_1_1.eContents().get(1);
		private final Assignment cExprAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cExprUnaryExprParserRuleCall_1_2_0 = (RuleCall)cExprAssignment_1_2.eContents().get(0);
		
		//UnaryExpr returns Expression:
		//	Atom | {UnaryExpr} ("not" | "!") expr=UnaryExpr;
		public ParserRule getRule() { return rule; }

		//Atom | {UnaryExpr} ("not" | "!") expr=UnaryExpr
		public Alternatives getAlternatives() { return cAlternatives; }

		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }

		//{UnaryExpr} ("not" | "!") expr=UnaryExpr
		public Group getGroup_1() { return cGroup_1; }

		//{UnaryExpr}
		public Action getUnaryExprAction_1_0() { return cUnaryExprAction_1_0; }

		//"not" | "!"
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }

		//"not"
		public Keyword getNotKeyword_1_1_0() { return cNotKeyword_1_1_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_1_1_1() { return cExclamationMarkKeyword_1_1_1; }

		//expr=UnaryExpr
		public Assignment getExprAssignment_1_2() { return cExprAssignment_1_2; }

		//UnaryExpr
		public RuleCall getExprUnaryExprParserRuleCall_1_2_0() { return cExprUnaryExprParserRuleCall_1_2_0; }
	}

	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Atom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWordsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenExprParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Atom:
		//	Value | Words | ParenExpr;
		public ParserRule getRule() { return rule; }

		//Value | Words | ParenExpr
		public Alternatives getAlternatives() { return cAlternatives; }

		//Value
		public RuleCall getValueParserRuleCall_0() { return cValueParserRuleCall_0; }

		//Words
		public RuleCall getWordsParserRuleCall_1() { return cWordsParserRuleCall_1; }

		//ParenExpr
		public RuleCall getParenExprParserRuleCall_2() { return cParenExprParserRuleCall_2; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProjectReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWordParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPhraseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTagReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTextReferenceParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cTaskReferenceParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value:
		//	ProjectReference | Word | Phrase | TagReference | TextReference | TaskReference;
		public ParserRule getRule() { return rule; }

		//ProjectReference | Word | Phrase | TagReference | TextReference | TaskReference
		public Alternatives getAlternatives() { return cAlternatives; }

		//ProjectReference
		public RuleCall getProjectReferenceParserRuleCall_0() { return cProjectReferenceParserRuleCall_0; }

		//Word
		public RuleCall getWordParserRuleCall_1() { return cWordParserRuleCall_1; }

		//Phrase
		public RuleCall getPhraseParserRuleCall_2() { return cPhraseParserRuleCall_2; }

		//TagReference
		public RuleCall getTagReferenceParserRuleCall_3() { return cTagReferenceParserRuleCall_3; }

		//TextReference
		public RuleCall getTextReferenceParserRuleCall_4() { return cTextReferenceParserRuleCall_4; }

		//TaskReference
		public RuleCall getTaskReferenceParserRuleCall_5() { return cTaskReferenceParserRuleCall_5; }
	}

	public class ParenExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ParenExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cParenExprAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprOrExprParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ParenExpr:
		//	"(" {ParenExpr} expr=OrExpr ")";
		public ParserRule getRule() { return rule; }

		//"(" {ParenExpr} expr=OrExpr ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//{ParenExpr}
		public Action getParenExprAction_1() { return cParenExprAction_1; }

		//expr=OrExpr
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }

		//OrExpr
		public RuleCall getExprOrExprParserRuleCall_2_0() { return cExprOrExprParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class ProjectReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ProjectReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_2_0_0 = (RuleCall)cValueAssignment_2_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//ProjectReference:
		//	"project" ":" (value=ID | value=STRING);
		public ParserRule getRule() { return rule; }

		//"project" ":" (value=ID | value=STRING)
		public Group getGroup() { return cGroup; }

		//"project"
		public Keyword getProjectKeyword_0() { return cProjectKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=ID | value=STRING
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//value=ID
		public Assignment getValueAssignment_2_0() { return cValueAssignment_2_0; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0_0() { return cValueIDTerminalRuleCall_2_0_0; }

		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}

	public class TaskReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaskReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_2_0_0 = (RuleCall)cValueAssignment_2_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//TaskReference:
		//	"task" ":" (value=ID | value=STRING);
		public ParserRule getRule() { return rule; }

		//"task" ":" (value=ID | value=STRING)
		public Group getGroup() { return cGroup; }

		//"task"
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=ID | value=STRING
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//value=ID
		public Assignment getValueAssignment_2_0() { return cValueAssignment_2_0; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0_0() { return cValueIDTerminalRuleCall_2_0_0; }

		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}

	public class TextReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TextReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_2_0_0 = (RuleCall)cValueAssignment_2_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//TextReference:
		//	"text" ":" (value=ID | value=STRING);
		public ParserRule getRule() { return rule; }

		//"text" ":" (value=ID | value=STRING)
		public Group getGroup() { return cGroup; }

		//"text"
		public Keyword getTextKeyword_0() { return cTextKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=ID | value=STRING
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//value=ID
		public Assignment getValueAssignment_2_0() { return cValueAssignment_2_0; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0_0() { return cValueIDTerminalRuleCall_2_0_0; }

		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}

	public class WordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Words");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValuesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValuesIDTerminalRuleCall_0_0 = (RuleCall)cValuesAssignment_0.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesIDTerminalRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		
		//Words:
		//	values+=ID values+=ID+;
		public ParserRule getRule() { return rule; }

		//values+=ID values+=ID+
		public Group getGroup() { return cGroup; }

		//values+=ID
		public Assignment getValuesAssignment_0() { return cValuesAssignment_0; }

		//ID
		public RuleCall getValuesIDTerminalRuleCall_0_0() { return cValuesIDTerminalRuleCall_0_0; }

		//values+=ID+
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }

		//ID
		public RuleCall getValuesIDTerminalRuleCall_1_0() { return cValuesIDTerminalRuleCall_1_0; }
	}

	public class WordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Word");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Word:
		//	value=ID;
		public ParserRule getRule() { return rule; }

		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}

	public class PhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Phrase");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Phrase:
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}

	public class TagReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TagReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//TagReference:
		//	"@" value=ID;
		public ParserRule getRule() { return rule; }

		//"@" value=ID
		public Group getGroup() { return cGroup; }

		//"@"
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//value=ID
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_1_0() { return cValueIDTerminalRuleCall_1_0; }
	}
	
	
	public class CompEqOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "CompEqOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQUALEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQUALEqualsSignKeyword_0_0 = (Keyword)cEQUALEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNOT_EQUALEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNOT_EQUALExclamationMarkEqualsSignKeyword_1_0 = (Keyword)cNOT_EQUALEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum CompEqOperator:
		//	EQUAL="=" | NOT_EQUAL="!=";
		public EnumRule getRule() { return rule; }

		//EQUAL="=" | NOT_EQUAL="!="
		public Alternatives getAlternatives() { return cAlternatives; }

		//EQUAL="="
		public EnumLiteralDeclaration getEQUALEnumLiteralDeclaration_0() { return cEQUALEnumLiteralDeclaration_0; }

		//"="
		public Keyword getEQUALEqualsSignKeyword_0_0() { return cEQUALEqualsSignKeyword_0_0; }

		//NOT_EQUAL="!="
		public EnumLiteralDeclaration getNOT_EQUALEnumLiteralDeclaration_1() { return cNOT_EQUALEnumLiteralDeclaration_1; }

		//"!="
		public Keyword getNOT_EQUALExclamationMarkEqualsSignKeyword_1_0() { return cNOT_EQUALExclamationMarkEqualsSignKeyword_1_0; }
	}

	public class CompOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "CompOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLESS_EQUALEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLESS_EQUALLessThanSignEqualsSignKeyword_0_0 = (Keyword)cLESS_EQUALEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLESSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLESSLessThanSignKeyword_1_0 = (Keyword)cLESSEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGREATER_EQUALEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGREATER_EQUALGreaterThanSignEqualsSignKeyword_2_0 = (Keyword)cGREATER_EQUALEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGREATEREnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGREATERGreaterThanSignKeyword_3_0 = (Keyword)cGREATEREnumLiteralDeclaration_3.eContents().get(0);
		
		//enum CompOperator:
		//	LESS_EQUAL="<=" | LESS="<" | GREATER_EQUAL=">=" | GREATER=">";
		public EnumRule getRule() { return rule; }

		//LESS_EQUAL="<=" | LESS="<" | GREATER_EQUAL=">=" | GREATER=">"
		public Alternatives getAlternatives() { return cAlternatives; }

		//LESS_EQUAL="<="
		public EnumLiteralDeclaration getLESS_EQUALEnumLiteralDeclaration_0() { return cLESS_EQUALEnumLiteralDeclaration_0; }

		//"<="
		public Keyword getLESS_EQUALLessThanSignEqualsSignKeyword_0_0() { return cLESS_EQUALLessThanSignEqualsSignKeyword_0_0; }

		//LESS="<"
		public EnumLiteralDeclaration getLESSEnumLiteralDeclaration_1() { return cLESSEnumLiteralDeclaration_1; }

		//"<"
		public Keyword getLESSLessThanSignKeyword_1_0() { return cLESSLessThanSignKeyword_1_0; }

		//GREATER_EQUAL=">="
		public EnumLiteralDeclaration getGREATER_EQUALEnumLiteralDeclaration_2() { return cGREATER_EQUALEnumLiteralDeclaration_2; }

		//">="
		public Keyword getGREATER_EQUALGreaterThanSignEqualsSignKeyword_2_0() { return cGREATER_EQUALGreaterThanSignEqualsSignKeyword_2_0; }

		//GREATER=">"
		public EnumLiteralDeclaration getGREATEREnumLiteralDeclaration_3() { return cGREATEREnumLiteralDeclaration_3; }

		//">"
		public Keyword getGREATERGreaterThanSignKeyword_3_0() { return cGREATERGreaterThanSignKeyword_3_0; }
	}
	
	private QueryElements pQuery;
	private OrExprElements pOrExpr;
	private AndExprElements pAndExpr;
	private CompEqExprElements pCompEqExpr;
	private CompExprElements pCompExpr;
	private UnaryExprElements pUnaryExpr;
	private AtomElements pAtom;
	private ValueElements pValue;
	private ParenExprElements pParenExpr;
	private ProjectReferenceElements pProjectReference;
	private TaskReferenceElements pTaskReference;
	private TextReferenceElements pTextReference;
	private WordsElements pWords;
	private WordElements pWord;
	private PhraseElements pPhrase;
	private TagReferenceElements pTagReference;
	private CompEqOperatorElements unknownRuleCompEqOperator;
	private CompOperatorElements unknownRuleCompOperator;
	private TerminalRule tID;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public QueryGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Query:
	//	{Query} expression=OrExpr?;
	public QueryElements getQueryAccess() {
		return (pQuery != null) ? pQuery : (pQuery = new QueryElements());
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}

	//OrExpr returns Expression:
	//	AndExpr ({OrExpr.left=current} ("or" | "||") right=AndExpr)*;
	public OrExprElements getOrExprAccess() {
		return (pOrExpr != null) ? pOrExpr : (pOrExpr = new OrExprElements());
	}
	
	public ParserRule getOrExprRule() {
		return getOrExprAccess().getRule();
	}

	//AndExpr returns Expression:
	//	CompEqExpr ({AndExpr.left=current} ("and" | "&&") right=CompEqExpr)*;
	public AndExprElements getAndExprAccess() {
		return (pAndExpr != null) ? pAndExpr : (pAndExpr = new AndExprElements());
	}
	
	public ParserRule getAndExprRule() {
		return getAndExprAccess().getRule();
	}

	//CompEqExpr returns Expression:
	//	CompExpr ({CompEqExpr.left=current} operator=CompEqOperator right=CompExpr)*;
	public CompEqExprElements getCompEqExprAccess() {
		return (pCompEqExpr != null) ? pCompEqExpr : (pCompEqExpr = new CompEqExprElements());
	}
	
	public ParserRule getCompEqExprRule() {
		return getCompEqExprAccess().getRule();
	}

	//CompExpr returns Expression:
	//	UnaryExpr ({CompExpr.left=current} operator=CompOperator right=UnaryExpr)*;
	public CompExprElements getCompExprAccess() {
		return (pCompExpr != null) ? pCompExpr : (pCompExpr = new CompExprElements());
	}
	
	public ParserRule getCompExprRule() {
		return getCompExprAccess().getRule();
	}

	//UnaryExpr returns Expression:
	//	Atom | {UnaryExpr} ("not" | "!") expr=UnaryExpr;
	public UnaryExprElements getUnaryExprAccess() {
		return (pUnaryExpr != null) ? pUnaryExpr : (pUnaryExpr = new UnaryExprElements());
	}
	
	public ParserRule getUnaryExprRule() {
		return getUnaryExprAccess().getRule();
	}

	//Atom:
	//	Value | Words | ParenExpr;
	public AtomElements getAtomAccess() {
		return (pAtom != null) ? pAtom : (pAtom = new AtomElements());
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}

	//Value:
	//	ProjectReference | Word | Phrase | TagReference | TextReference | TaskReference;
	public ValueElements getValueAccess() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//ParenExpr:
	//	"(" {ParenExpr} expr=OrExpr ")";
	public ParenExprElements getParenExprAccess() {
		return (pParenExpr != null) ? pParenExpr : (pParenExpr = new ParenExprElements());
	}
	
	public ParserRule getParenExprRule() {
		return getParenExprAccess().getRule();
	}

	//ProjectReference:
	//	"project" ":" (value=ID | value=STRING);
	public ProjectReferenceElements getProjectReferenceAccess() {
		return (pProjectReference != null) ? pProjectReference : (pProjectReference = new ProjectReferenceElements());
	}
	
	public ParserRule getProjectReferenceRule() {
		return getProjectReferenceAccess().getRule();
	}

	//TaskReference:
	//	"task" ":" (value=ID | value=STRING);
	public TaskReferenceElements getTaskReferenceAccess() {
		return (pTaskReference != null) ? pTaskReference : (pTaskReference = new TaskReferenceElements());
	}
	
	public ParserRule getTaskReferenceRule() {
		return getTaskReferenceAccess().getRule();
	}

	//TextReference:
	//	"text" ":" (value=ID | value=STRING);
	public TextReferenceElements getTextReferenceAccess() {
		return (pTextReference != null) ? pTextReference : (pTextReference = new TextReferenceElements());
	}
	
	public ParserRule getTextReferenceRule() {
		return getTextReferenceAccess().getRule();
	}

	//Words:
	//	values+=ID values+=ID+;
	public WordsElements getWordsAccess() {
		return (pWords != null) ? pWords : (pWords = new WordsElements());
	}
	
	public ParserRule getWordsRule() {
		return getWordsAccess().getRule();
	}

	//Word:
	//	value=ID;
	public WordElements getWordAccess() {
		return (pWord != null) ? pWord : (pWord = new WordElements());
	}
	
	public ParserRule getWordRule() {
		return getWordAccess().getRule();
	}

	//Phrase:
	//	value=STRING;
	public PhraseElements getPhraseAccess() {
		return (pPhrase != null) ? pPhrase : (pPhrase = new PhraseElements());
	}
	
	public ParserRule getPhraseRule() {
		return getPhraseAccess().getRule();
	}

	//TagReference:
	//	"@" value=ID;
	public TagReferenceElements getTagReferenceAccess() {
		return (pTagReference != null) ? pTagReference : (pTagReference = new TagReferenceElements());
	}
	
	public ParserRule getTagReferenceRule() {
		return getTagReferenceAccess().getRule();
	}

	//enum CompEqOperator:
	//	EQUAL="=" | NOT_EQUAL="!=";
	public CompEqOperatorElements getCompEqOperatorAccess() {
		return (unknownRuleCompEqOperator != null) ? unknownRuleCompEqOperator : (unknownRuleCompEqOperator = new CompEqOperatorElements());
	}
	
	public EnumRule getCompEqOperatorRule() {
		return getCompEqOperatorAccess().getRule();
	}

	//enum CompOperator:
	//	LESS_EQUAL="<=" | LESS="<" | GREATER_EQUAL=">=" | GREATER=">";
	public CompOperatorElements getCompOperatorAccess() {
		return (unknownRuleCompOperator != null) ? unknownRuleCompOperator : (unknownRuleCompOperator = new CompOperatorElements());
	}
	
	public EnumRule getCompOperatorRule() {
		return getCompOperatorAccess().getRule();
	}

	//terminal ID:
	//	!("@" | "=" | "<" | ">" | "!" | "(" | ")" | ":" | " " | "\t" | "\r" | "\n" | "\"" | "\'" | "&" | "|") !(" " | "\t" |
	//	"\r" | "\n" | ":")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
