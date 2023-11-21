package com.skyscraperconstruction.service;

import java.util.ArrayList;
import java.util.Stack;

public class SkyscraperConstruction {

	public void constructSkyscraper(int noOfFloors, ArrayList<Integer> floorSizes) {
		Stack<Integer> stack = new Stack<Integer>();
		int expectedFloor = noOfFloors;
		System.out.println("The order of construction is as follows: ");
		System.out.println();
		for (int i = 0; i < floorSizes.size(); i++) {
			System.out.println("Day " + (i + 1) + ":");
			if (floorSizes.get(i) <= expectedFloor) {
				stack.push(floorSizes.get(i));
			}

			if (!stack.isEmpty()) {
				while (!stack.isEmpty() && (stack.peek() <= noOfFloors && stack.peek() >= expectedFloor)) {
					System.out.print(stack.pop() + " ");
					expectedFloor--;
				}
			}

			System.out.println();
		}
	}
}