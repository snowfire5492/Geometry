//*****************************************************************************/
//*****************************************************************************/
//
//
//      file: Schenck_Driver.java
//      author: E. Schenck
//      class: CS 141 Intro to Programming 
//
//      assignment: Program 2
//      date last modified: 1/23/2017
//
//      purpose: Write a driver program to test geometry class.
//
//
//
//*****************************************************************************/
//*****************************************************************************/

import java.util.Scanner;


public class Schenck_Driver
{
	public static void main(String[] args)
	{
		// declaring variables needed for program
		int calculateChoice, radius, length, width, base, height;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true)
		{
			// printing out option menu for user
			System.out.println("\nGeometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit\n");
			System.out.print("Enter your choice (1-4): ");
		
			calculateChoice = keyboard.nextInt();
		
			// switch statement to handle users choice 
			switch(calculateChoice)
			{
				case 1: // Area of Circle 
					System.out.print("\nEnter the radius of the Circle: ");
					radius = keyboard.nextInt();
					double areaC = Schenck_Geometry.areaOfCircle(radius);
					if(areaC == 0.0)
						break;
					else
						System.out.printf("\nThe Area of the Circle is: %.2f \n\n", areaC);
					break; 
				
				case 2: // Area of Rectangle 
					System.out.print("\nEnter the length of the Rectangle: ");
					length = keyboard.nextInt();
					System.out.print("\nEnter the width of the Rectangle: ");
					width = keyboard.nextInt();
					double areaR = Schenck_Geometry.areaOfRectangle(length,width);
					if(areaR == 0.0)
						break;
					else
						System.out.printf("\nThe Area of the Rectangle is: %.2f \n\n", areaR); 
					break;
			
				case 3: // Area of Triangle
					System.out.print("\nEnter the base length of Triangle: ");
					base = keyboard.nextInt();
					System.out.print("\nEnter the height of Triangle: ");
					height = keyboard.nextInt();
					double areaT = Schenck_Geometry.areaOfTriangle(base,height);
					if(areaT == 0.0)
						break;
					else
						System.out.printf("\nThe Area of the Triangle is: %.2f \n\n", areaT); 
					break;
				
				case 4: // Quit
					System.exit(0); 	
					break;

				default: 
					System.out.println("Error");
					break;
			}
			
		}
		
	}
}




