package com.javacode.patterns.visitorpattern;

public interface Element {
	
	public void accept(Visitor visitor);
}
