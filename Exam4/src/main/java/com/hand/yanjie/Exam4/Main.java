package com.hand.yanjie.Exam4;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.event.ListSelectionEvent;

public class Main {
	public static void main(String[] args) {
		List<Integer> List = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<50;i++)
		{
			Random r = new Random();
			List.add(new Integer(r.nextInt(100)));
			map.put(List.get(i)/10, List.get(i));
		};
	}
}
