package com.archa.workspace.abstractclass;

public class RecipeRunner {

	public static void main(String[] args) {
		AbstractRecipe recipe1 = new Recipe1();
		recipe1.execute();

		AbstractRecipe recipewithWave = new RecipeWithMicroWave();
		recipewithWave.execute();

	}

}
