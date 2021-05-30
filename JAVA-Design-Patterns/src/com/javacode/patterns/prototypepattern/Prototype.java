package com.javacode.patterns.prototypepattern;

public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
