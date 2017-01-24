
//*****************************************************************************/
//*****************************************************************************/
//
//
//      file: Schenck_Geometry.java
//      author: E. Schenck
//      class: CS 141 Intro to Programming 
//
//      assignment: Program 2
//      date last modified: 1/22/2017
//
//      purpose: Write a program with the following methods:
//		- A static method that accepts radius of a circle and returns area 
//      of the circle.
//		Hint: use Area formula: Area = (Math.PI)(radius)
//		- A static method that accepts length and width of a rectangle and 
//		returns area of rectangle. 
//		Hint: Use Area formula: Area = Length x Width
//		- A static method that accepts the length of a triangle's base and 
//		triangles height, then returns the area of the triangle. 
//      Hint: Use Area formula: Base x Height x 0.5
//		
//		Note: the methods should display an error message if negative 
//      values are used for circles radius, rectangles length or width 
//		or triangles base or height.
//
//*****************************************************************************/
//*****************************************************************************/

public class Schenck_Geometry
{
	
	/**
	* Returns area of a circle using Area = (Math.PI)(radius)
	* displays error message if negative values are used
	*
	* @param radius 
	* @return 
	*/
	public static double areaOfCircle(int radius)
	{
		if(checkValue(radius))
			return (Math.PI * radius);
		else
		{
			printError();
			return 0;
		}
	}
	
	/**
	* Returns area of a rectangle using Area = Length x Width
	* displays error message if negative values are used
	*
	* @param length
	* @param width
	* @return 
	*/
	public static double areaOfRectangle(int length, int width)
	{
		if(checkValue(length,width))
			return (length * width);
		else
		{
			printError();
			return 0;
		}
	}
	
	/**
	* Returns area of a triangle using Area = (0.5)x(Base x Height)
	* displays error message if negative values are used
	*
	* @param base
	* @param height
	* @return 
	*/
	public static double areaOfTriangle(int base, int height)
	{
		if(checkValue(base,height))
			return (0.5 * base * height);
		else
		{
			printError();
			return 0;
		}
	}
	
	/**
	* Returns true if passed value is greater or equal to 0.
	* purpose: to make sure given value is non-negative.
	*
	* @param value
	* @return
	*/
	public static boolean checkValue(int value)
	{
		if(value >= 0)
			return true;
		else 
			return false;
	}
	
	/**
	* Returns true if passed values are both >= 0
	* purpose: to make sure given values are non-negative
	* overloaded method
	*
	* @param value1
	* @param value2
	* @return
	*/
	public static boolean checkValue(int value1, int value2)
	{
		if(value1 >= 0 && value2 >= 0)
			return true;
		else
			return false;
	}
	
	/** 
	* Prints Error message.
	*/
	public static void printError()
	{
		System.out.println("Error: Negative value(s) were entered. Please try again...");
	}
	
}