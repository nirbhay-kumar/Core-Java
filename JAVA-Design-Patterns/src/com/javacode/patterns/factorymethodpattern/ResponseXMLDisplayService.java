package com.javacode.patterns.factorymethodpattern;

public class ResponseXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new ResponseXMLParser();
	}

}
