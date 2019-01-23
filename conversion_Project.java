/**
 * 
 * @author Jugat Singh
 *
 */
public class conversion_Project 
{

	public static void main(String[] args) 
	{

	}
	public static int Feet_to_Inches(int feet)
	{
		int inch= feet*12;
		return inch;
	}
	public static int Miles_to_Feet(int miles)
	{
		int feet= 5280*miles;
		return feet;
	}
	public static double Yards_to_Meters(int yards)
	{
		double meters= yards/1.094;
		return meters;
	}
	public static double Pounds_to_Kilograms(int pounds)
	{
		double kilograms= pounds/2.205;
		return kilograms;
	}
}
