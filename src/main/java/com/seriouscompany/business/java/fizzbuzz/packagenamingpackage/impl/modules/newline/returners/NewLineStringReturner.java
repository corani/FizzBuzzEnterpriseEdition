package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.returners;

import java.util.ResourceBundle;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturner implements StringStringReturner {

	public NewLineStringReturner(ResourceBundle l10n) {
	}

	public String getReturnString() {
		final StringBuilder myStringBuilder = new StringBuilder("\n");
		final String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
