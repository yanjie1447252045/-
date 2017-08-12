package com.hand.yanjie.Exam2;

public class Level2 implements Level {

	public double getResult(double salary, int startpoint) {
		salary-=startpoint;
		return salary*0.03;
	}
}
