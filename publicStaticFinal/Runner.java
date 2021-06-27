package com.archa.workspace.publicStaticFinal;

public class Runner {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTE_IN_HOUR = 60;
	public static final int HOUR_IN_A_DAY = 24;
	public static final int SECONDS_IN_A_DAY = SECONDS_IN_MINUTE * MINUTE_IN_HOUR * HOUR_IN_A_DAY;


	public static void main(String[] args) {
		System.out.println(SECONDS_IN_A_DAY);

	}

}
