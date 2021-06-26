package com.archa.workspace.abstractclass;

public class RecipeWithMicroWave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on The microwave");

	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the microwave");

	}

	@Override
	void cleanUp() {
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off The microwave");

	}

}
