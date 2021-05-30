package com.javacode.patterns.strategypattern;

public class ArialTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[ArialTextFormatter]: "+text);
	}

}
