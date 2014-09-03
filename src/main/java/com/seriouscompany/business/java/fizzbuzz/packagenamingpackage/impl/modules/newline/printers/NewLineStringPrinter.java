package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules.newline.factories.NewLineStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

public class NewLineStringPrinter implements StringPrinter {

	private final FizzBuzzOutputStrategy outputStrategy;

	public NewLineStringPrinter() {
		FizzBuzzOutputStrategyFactory factory = new SystemOutFizzBuzzOutputStrategyFactory();
		this.outputStrategy = factory.createOutputStrategy();
	}

	public void print() {
		final StringStringReturnerFactory myNewLineStringReturnerFactory = new NewLineStringReturnerFactory();
		final StringStringReturner myNewLineStringReturner = myNewLineStringReturnerFactory
				.createStringStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(outputStrategy);

		myOutputAdapter.output(myNewLineStringReturner.getReturnString());
	}

	@Override
	public void printValue(Object value) {
		print();
	}
}