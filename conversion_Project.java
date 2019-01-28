/**
 * 
 * @author Jugat Singh
 *
 */
public class conversion_Project 
{

	public static void main(String[] args) 
	{
		System.out.println(feetToInches(1));
		System.out.println(milesToFeet(1));
		System.out.println(yardsToMeters(1.094));
		System.out.println(poundsToKilograms(2.205));
	}
	public static double feetToInches(double feet)
	{
		double inch= feet*12;
		return inch;
	}
	public static double milesToFeet(double miles)
	{
		double feet= 5280*miles;
		return feet;
	}
	public static double yardsToMeters(double yards)
	{
		double meters= yards/1.094;
		return meters;
	}
	public static double poundsToKilograms(double pounds)
	{
		double kilograms= pounds/2.205;
		return kilograms;
	}
}