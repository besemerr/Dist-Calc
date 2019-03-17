//------------------------------------------------------------------------------
//   Assignment: Practice Week 1
//    File Name: OutboundShippingCalc.java
//       Author: Ryan Besemer
//   Student ID: 1214230614
//        Topic: Interactivity/Expressions/Equations
//  Description: Compute total gross weight of bottled juice being loaded onto
//               a truck.
//------------------------------------------------------------------------------

package com.besemerr.distribution_calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OutboundShippingCalc {

	// ----------------------------------------------------------------------------
	// defining the main method
	// ----------------------------------------------------------------------------
	public static void main(String[] args) {

		// defining data variables
		final int PALLET_WEIGHT = 33; // lbs
		int elevenOz, fifteenOz, thirty2Oz, fifty9Oz, palletQty;
		double elevenOzTotal, fifteenOzTotal, thirty2OzTotal, fifty9OzTotal, totalGW, totalPalletWeight;
		boolean runProgram = true;

		do {
			// fetching user data and printing minimal results
			Scanner input;
			try {
				// print greeting
				System.out.println();
				System.out.println("=======================================================");
				System.out.println("\t     Outbound Shipping Calculator");
				System.out.println("=======================================================");

				input = new Scanner(System.in);

				// 11oz user data and weight output
				System.out.print("\nEnter Quantity   (11oz 6-Pack): ");
				elevenOz = input.nextInt();
				elevenOzTotal = elevenOz * 6.0 * .840; // lbs
				System.out.println("The Total Weight of (" + String.format("%,d", elevenOz) + " 11oz 6-Pack's)" + ": "
						+ String.format("%,.2f", elevenOzTotal) + " lbs");

				// 15oz user data and weight output
				System.out.print("\nEnter Quantity   (15oz 6-Pack): ");
				fifteenOz = input.nextInt();
				fifteenOzTotal = fifteenOz * 6.0 * 1.138; // lbs
				System.out.println("The Total Weight of (" + String.format("%,d", fifteenOz) + " 15oz 6-Pack's)" + ": "
						+ String.format("%,.2f", fifteenOzTotal) + " lbs");

				// 32oz user data and weight output
				System.out.print("\nEnter Quantity   (32oz 6-Pack): ");
				thirty2Oz = input.nextInt();
				thirty2OzTotal = thirty2Oz * 6.0 * 2.354; // lbs
				System.out.println("The Total Weight of (" + String.format("%,d", thirty2Oz) + " 32oz 6-Pack's)" + ": "
						+ String.format("%,.2f", thirty2OzTotal) + " lbs");

				// 59oz user data and weight output
				System.out.print("\nEnter Quantity   (59oz 4-Pack): ");
				fifty9Oz = input.nextInt();
				fifty9OzTotal = fifty9Oz * 4.0 * 4.138; // lbs
				System.out.println("The Total Weight of (" + String.format("%,d", fifty9Oz) + " 59oz 4-Pack's)" + ": "
						+ String.format("%,.2f", fifty9OzTotal) + " lbs");

				// pallet count user data and weight output
				System.out.print("\nEnter Quantity       (Pallets): ");
				palletQty = input.nextInt();
				totalPalletWeight = palletQty * PALLET_WEIGHT;
				System.out.println("The Total Weight of (" + palletQty + " Pallets): "
						+ String.format("%,.2f", totalPalletWeight) + " lbs\n");
				System.out.println("=======================================================");

				// print results
				totalGW = elevenOzTotal + fifteenOzTotal + thirty2OzTotal + fifty9OzTotal + totalPalletWeight;
				System.out.println("\nTotal Gross Weight: " + String.format("%,.2f", totalGW) + " lbs\n");
				System.out.println("=======================================================\n");

				runProgram = false;

			} catch (InputMismatchException e) {

				System.out.println("\n-Invalid Input-\n--Please enter number's only.\n");

			}

			while (runProgram == false) {
				Scanner scan = new Scanner(System.in);

				System.out.print("Would you like to calculate another weight total? [Y/N]");
				String again = scan.nextLine();

				if (again.equalsIgnoreCase("Y")) {

					runProgram = true;

				} else if (again.equalsIgnoreCase("N")) {

					// print credits/goodbye
					System.out.println("\n=======================================================");
					System.out.println("\t\tCreated by: Ryan Besemer");
					System.out.println("=======================================================");
					System.exit(0);

				} else {

					System.out.println("\n-Invalid Input-\n");

				}
			}
		} while (runProgram == true);
	}
}
