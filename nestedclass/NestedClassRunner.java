package com.archa.workspace.nestedclass;

public class NestedClassRunner {
	class Innerclass {

	}

	static class staticNestedClass {

	}
	public static void main(String[] args) {
		staticNestedClass nestedclass = new staticNestedClass();
		// innerclass exist only with an instance of nestedclassrunner(enclosing class)
		NestedClassRunner runner = new NestedClassRunner();
		Innerclass innerclass = runner.new Innerclass();

	}

}
