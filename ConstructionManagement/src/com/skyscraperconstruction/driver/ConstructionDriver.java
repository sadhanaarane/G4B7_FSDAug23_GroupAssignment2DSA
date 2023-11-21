package com.skyscraperconstruction.driver;

import java.util.ArrayList;
import java.util.Scanner;

import com.skyscraperconstruction.service.SkyscraperConstruction;

public class ConstructionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building");
		int noOfFloors = sc.nextInt();

		if (noOfFloors <= 0) {
			System.out.println("No floors to construct. Exiting the program.");
			sc.close();
			return;
		}

		ArrayList<Integer> floorSizes = new ArrayList<Integer>();
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1) + ":");
			int newFloor = sc.nextInt();
			if (floorSizes.contains(newFloor)) {
				System.out.println("Enter other value this floor already exists:");
				newFloor = sc.nextInt();
			}
			if (newFloor <= 0 || newFloor > noOfFloors) {
				System.out.println("Enter valid floor size:");
				newFloor = sc.nextInt();
			}
			floorSizes.add(newFloor);
		}

		SkyscraperConstruction objConstruct = new SkyscraperConstruction();
		objConstruct.constructSkyscraper(noOfFloors, floorSizes);

		sc.close();
	}
}