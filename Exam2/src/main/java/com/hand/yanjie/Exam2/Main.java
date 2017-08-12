package com.hand.yanjie.Exam2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("请输工资：");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		//如果向使用外国的调用方式 请使用getComputerForeign()
		Level level = new Factory().getComputerNative(salary);
		Level leve2 = new Factory().getComputerFroign(salary);
		//目前实现了应纳税所得额为0-4500范围的计算
		sc.close();
		System.out.println("本国所需要缴纳的税费为："+level.getResult(salary,3000));
		System.out.println("外国所需要缴纳的税费为："+leve2.getResult(salary,4800));
	}
}