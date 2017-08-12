package com.hand.yanjie.Exam2;

public class Level3 implements Level{

	public double getResult(double salary, int startpoint) {
		salary-=startpoint;
		salary-=1500;
		return 1500*0.03+salary*0.1;
	}

}
