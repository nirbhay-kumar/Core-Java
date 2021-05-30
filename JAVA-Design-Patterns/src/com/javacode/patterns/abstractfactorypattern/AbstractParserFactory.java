package com.javacode.patterns.abstractfactorypattern;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
