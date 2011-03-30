/*
* generated by Xtext
*/
grammar InternalQuery;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.sebastianbenz.task.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.sebastianbenz.task.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.sebastianbenz.task.services.QueryGrammarAccess;

}

@parser::members {
 
 	private QueryGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(QueryGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleQuery
entryRuleQuery 
:
{ before(grammarAccess.getQueryRule()); }
	 ruleQuery
{ after(grammarAccess.getQueryRule()); } 
	 EOF 
;

// Rule Query
ruleQuery
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQueryAccess().getGroup()); }
(rule__Query__Group__0)
{ after(grammarAccess.getQueryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOrExpr
entryRuleOrExpr 
:
{ before(grammarAccess.getOrExprRule()); }
	 ruleOrExpr
{ after(grammarAccess.getOrExprRule()); } 
	 EOF 
;

// Rule OrExpr
ruleOrExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOrExprAccess().getGroup()); }
(rule__OrExpr__Group__0)
{ after(grammarAccess.getOrExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAndExpr
entryRuleAndExpr 
:
{ before(grammarAccess.getAndExprRule()); }
	 ruleAndExpr
{ after(grammarAccess.getAndExprRule()); } 
	 EOF 
;

// Rule AndExpr
ruleAndExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAndExprAccess().getGroup()); }
(rule__AndExpr__Group__0)
{ after(grammarAccess.getAndExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCompEqExpr
entryRuleCompEqExpr 
:
{ before(grammarAccess.getCompEqExprRule()); }
	 ruleCompEqExpr
{ after(grammarAccess.getCompEqExprRule()); } 
	 EOF 
;

// Rule CompEqExpr
ruleCompEqExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCompEqExprAccess().getGroup()); }
(rule__CompEqExpr__Group__0)
{ after(grammarAccess.getCompEqExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCompExpr
entryRuleCompExpr 
:
{ before(grammarAccess.getCompExprRule()); }
	 ruleCompExpr
{ after(grammarAccess.getCompExprRule()); } 
	 EOF 
;

// Rule CompExpr
ruleCompExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCompExprAccess().getGroup()); }
(rule__CompExpr__Group__0)
{ after(grammarAccess.getCompExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUnaryExpr
entryRuleUnaryExpr 
:
{ before(grammarAccess.getUnaryExprRule()); }
	 ruleUnaryExpr
{ after(grammarAccess.getUnaryExprRule()); } 
	 EOF 
;

// Rule UnaryExpr
ruleUnaryExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUnaryExprAccess().getAlternatives()); }
(rule__UnaryExpr__Alternatives)
{ after(grammarAccess.getUnaryExprAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAtom
entryRuleAtom 
:
{ before(grammarAccess.getAtomRule()); }
	 ruleAtom
{ after(grammarAccess.getAtomRule()); } 
	 EOF 
;

// Rule Atom
ruleAtom
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAtomAccess().getAlternatives()); }
(rule__Atom__Alternatives)
{ after(grammarAccess.getAtomAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleValue
entryRuleValue 
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueAccess().getAlternatives()); }
(rule__Value__Alternatives)
{ after(grammarAccess.getValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParenExpr
entryRuleParenExpr 
:
{ before(grammarAccess.getParenExprRule()); }
	 ruleParenExpr
{ after(grammarAccess.getParenExprRule()); } 
	 EOF 
;

// Rule ParenExpr
ruleParenExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParenExprAccess().getGroup()); }
(rule__ParenExpr__Group__0)
{ after(grammarAccess.getParenExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProjectReference
entryRuleProjectReference 
:
{ before(grammarAccess.getProjectReferenceRule()); }
	 ruleProjectReference
{ after(grammarAccess.getProjectReferenceRule()); } 
	 EOF 
;

// Rule ProjectReference
ruleProjectReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProjectReferenceAccess().getGroup()); }
(rule__ProjectReference__Group__0)
{ after(grammarAccess.getProjectReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTaskReference
entryRuleTaskReference 
:
{ before(grammarAccess.getTaskReferenceRule()); }
	 ruleTaskReference
{ after(grammarAccess.getTaskReferenceRule()); } 
	 EOF 
;

// Rule TaskReference
ruleTaskReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTaskReferenceAccess().getGroup()); }
(rule__TaskReference__Group__0)
{ after(grammarAccess.getTaskReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTextReference
entryRuleTextReference 
:
{ before(grammarAccess.getTextReferenceRule()); }
	 ruleTextReference
{ after(grammarAccess.getTextReferenceRule()); } 
	 EOF 
;

// Rule TextReference
ruleTextReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTextReferenceAccess().getGroup()); }
(rule__TextReference__Group__0)
{ after(grammarAccess.getTextReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWords
entryRuleWords 
:
{ before(grammarAccess.getWordsRule()); }
	 ruleWords
{ after(grammarAccess.getWordsRule()); } 
	 EOF 
;

// Rule Words
ruleWords
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWordsAccess().getGroup()); }
(rule__Words__Group__0)
{ after(grammarAccess.getWordsAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWord
entryRuleWord 
:
{ before(grammarAccess.getWordRule()); }
	 ruleWord
{ after(grammarAccess.getWordRule()); } 
	 EOF 
;

// Rule Word
ruleWord
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWordAccess().getValueAssignment()); }
(rule__Word__ValueAssignment)
{ after(grammarAccess.getWordAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePhrase
entryRulePhrase 
:
{ before(grammarAccess.getPhraseRule()); }
	 rulePhrase
{ after(grammarAccess.getPhraseRule()); } 
	 EOF 
;

// Rule Phrase
rulePhrase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPhraseAccess().getValueAssignment()); }
(rule__Phrase__ValueAssignment)
{ after(grammarAccess.getPhraseAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTagReference
entryRuleTagReference 
:
{ before(grammarAccess.getTagReferenceRule()); }
	 ruleTagReference
{ after(grammarAccess.getTagReferenceRule()); } 
	 EOF 
;

// Rule TagReference
ruleTagReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTagReferenceAccess().getGroup()); }
(rule__TagReference__Group__0)
{ after(grammarAccess.getTagReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule CompEqOperator
ruleCompEqOperator
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqOperatorAccess().getAlternatives()); }
(rule__CompEqOperator__Alternatives)
{ after(grammarAccess.getCompEqOperatorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule CompOperator
ruleCompOperator
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompOperatorAccess().getAlternatives()); }
(rule__CompOperator__Alternatives)
{ after(grammarAccess.getCompOperatorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__UnaryExpr__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); }
	ruleAtom
{ after(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getUnaryExprAccess().getGroup_1()); }
(rule__UnaryExpr__Group_1__0)
{ after(grammarAccess.getUnaryExprAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); }
	ruleValue
{ after(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); }
	ruleWords
{ after(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); }
	ruleParenExpr
{ after(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); }
	ruleProjectReference
{ after(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getValueAccess().getWordParserRuleCall_1()); }
	ruleWord
{ after(grammarAccess.getValueAccess().getWordParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); }
	rulePhrase
{ after(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); }
	ruleTagReference
{ after(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); }
	ruleTextReference
{ after(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); }
	ruleTaskReference
{ after(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqOperator__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); }
(	'=' 
)
{ after(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); }
(	'!=' 
)
{ after(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompOperator__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); }
(	'<=' 
)
{ after(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); }
(	'<' 
)
{ after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); }
(	'>=' 
)
{ after(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); }
(	'>' 
)
{ after(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Query__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group__0__Impl
	rule__Query__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getQueryAction_0()); }
(

)
{ after(grammarAccess.getQueryAccess().getQueryAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Query__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getExpressionAssignment_1()); }
(rule__Query__ExpressionAssignment_1)?
{ after(grammarAccess.getQueryAccess().getExpressionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpr__Group__0__Impl
	rule__OrExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); }
	ruleAndExpr
{ after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getGroup_1()); }
(rule__OrExpr__Group_1__0)*
{ after(grammarAccess.getOrExprAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrExpr__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpr__Group_1__0__Impl
	rule__OrExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); }
(

)
{ after(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpr__Group_1__1__Impl
	rule__OrExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); }

	'or' 

{ after(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); }
(rule__OrExpr__RightAssignment_1_2)
{ after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__AndExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpr__Group__0__Impl
	rule__AndExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); }
	ruleCompEqExpr
{ after(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getGroup_1()); }
(rule__AndExpr__Group_1__0)*
{ after(grammarAccess.getAndExprAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AndExpr__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpr__Group_1__0__Impl
	rule__AndExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); }
(

)
{ after(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpr__Group_1__1__Impl
	rule__AndExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); }

	'and' 

{ after(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AndExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); }
(rule__AndExpr__RightAssignment_1_2)
{ after(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__CompEqExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompEqExpr__Group__0__Impl
	rule__CompEqExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); }
	ruleCompExpr
{ after(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompEqExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompEqExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getGroup_1()); }
(rule__CompEqExpr__Group_1__0)*
{ after(grammarAccess.getCompEqExprAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__CompEqExpr__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompEqExpr__Group_1__0__Impl
	rule__CompEqExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); }
(

)
{ after(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompEqExpr__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompEqExpr__Group_1__1__Impl
	rule__CompEqExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); }
(rule__CompEqExpr__OperatorAssignment_1_1)
{ after(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompEqExpr__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompEqExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); }
(rule__CompEqExpr__RightAssignment_1_2)
{ after(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__CompExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompExpr__Group__0__Impl
	rule__CompExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); }
	ruleUnaryExpr
{ after(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getGroup_1()); }
(rule__CompExpr__Group_1__0)*
{ after(grammarAccess.getCompExprAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__CompExpr__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompExpr__Group_1__0__Impl
	rule__CompExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); }
(

)
{ after(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompExpr__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompExpr__Group_1__1__Impl
	rule__CompExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); }
(rule__CompExpr__OperatorAssignment_1_1)
{ after(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CompExpr__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CompExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); }
(rule__CompExpr__RightAssignment_1_2)
{ after(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__UnaryExpr__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnaryExpr__Group_1__0__Impl
	rule__UnaryExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpr__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); }
(

)
{ after(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnaryExpr__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnaryExpr__Group_1__1__Impl
	rule__UnaryExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpr__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1()); }

	'not' 

{ after(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnaryExpr__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnaryExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpr__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); }
(rule__UnaryExpr__ExprAssignment_1_2)
{ after(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ParenExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenExpr__Group__0__Impl
	rule__ParenExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); }

	'(' 

{ after(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParenExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenExpr__Group__1__Impl
	rule__ParenExpr__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenExprAccess().getParenExprAction_1()); }
(

)
{ after(grammarAccess.getParenExprAccess().getParenExprAction_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParenExpr__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenExpr__Group__2__Impl
	rule__ParenExpr__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenExpr__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenExprAccess().getExprAssignment_2()); }
(rule__ParenExpr__ExprAssignment_2)
{ after(grammarAccess.getParenExprAccess().getExprAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParenExpr__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenExpr__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenExpr__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ProjectReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProjectReference__Group__0__Impl
	rule__ProjectReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProjectReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); }

	'project' 

{ after(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProjectReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProjectReference__Group__1__Impl
	rule__ProjectReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProjectReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ProjectReference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ProjectReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProjectReference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2()); }
(rule__ProjectReference__ValueAssignment_2)
{ after(grammarAccess.getProjectReferenceAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__TaskReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TaskReference__Group__0__Impl
	rule__TaskReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); }

	'task' 

{ after(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TaskReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TaskReference__Group__1__Impl
	rule__TaskReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TaskReference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TaskReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskReference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2()); }
(rule__TaskReference__ValueAssignment_2)
{ after(grammarAccess.getTaskReferenceAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__TextReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TextReference__Group__0__Impl
	rule__TextReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TextReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); }

	'text' 

{ after(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TextReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TextReference__Group__1__Impl
	rule__TextReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TextReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TextReference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TextReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TextReference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextReferenceAccess().getValueAssignment_2()); }
(rule__TextReference__ValueAssignment_2)
{ after(grammarAccess.getTextReferenceAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Words__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Words__Group__0__Impl
	rule__Words__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Words__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWordsAccess().getValuesAssignment_0()); }
(rule__Words__ValuesAssignment_0)
{ after(grammarAccess.getWordsAccess().getValuesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Words__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Words__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Words__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getWordsAccess().getValuesAssignment_1()); }
(rule__Words__ValuesAssignment_1)
{ after(grammarAccess.getWordsAccess().getValuesAssignment_1()); }
)
(
{ before(grammarAccess.getWordsAccess().getValuesAssignment_1()); }
(rule__Words__ValuesAssignment_1)*
{ after(grammarAccess.getWordsAccess().getValuesAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__TagReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TagReference__Group__0__Impl
	rule__TagReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TagReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); }

	'@' 

{ after(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TagReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TagReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TagReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); }
(rule__TagReference__ValueAssignment_1)
{ after(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Query__ExpressionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); }
	ruleOrExpr{ after(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); }
	ruleAndExpr{ after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); }
	ruleCompEqExpr{ after(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__OperatorAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); }
	ruleCompEqOperator{ after(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompEqExpr__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); }
	ruleCompExpr{ after(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__OperatorAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); }
	ruleCompOperator{ after(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CompExpr__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); }
	ruleUnaryExpr{ after(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpr__ExprAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); }
	ruleUnaryExpr{ after(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParenExpr__ExprAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); }
	ruleOrExpr{ after(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ProjectReference__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TaskReference__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TextReference__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Words__ValuesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Words__ValuesAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Word__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TagReference__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : ~(('@'|'='|'<'|'>'|'!'|'('|')'|':'|' '|'\t'|'\r'|'\n'|'"'|'\'')) ~((' '|'\t'|'\r'|'\n'|':'))*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

