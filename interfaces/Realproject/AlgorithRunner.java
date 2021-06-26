package com.archa.workspace.interfaces.Realproject;

public class AlgorithRunner {
	/*
	 * interface test { void method1();
	 * 
	 * default void method2() { System.out.println("default"); }
	 * 
	 * }
	 * 
	 * class class1 implements test {
	 * 
	 * @Override public void method1() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * }
	 * 
	 * class class2 implements test {
	 * 
	 * @Override public void method1() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		algorithm.Complex(10, 20);

	}

}
