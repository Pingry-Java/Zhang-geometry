public class Point
{
	// Declare some instance fields 
	private double x;
	private double y;
	public String name;

	//Declare a constructor to make a new instance for the class
	public Point() 
	{
		x = 0;
		y = 0;
		name = "No Name Given";
	}

	public Point(double x, double y)
	{
		this.x=x;
		this.y=y;

		name = "A";

	}

	public Point(int x, int y, String n)
	{
		this.x=x;
		this.y=y;

		name = n;
	}

	//Write some accessor methods
	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	//Write modifier methods
	public void setX(double a)
	{
		if (a >= 0)
			x = a;
	}

	//Declares some useful methods
	/**
	 * Calculates and returns this point's distance from the origin (0,0)
	 * @return The distance from (0,0) as a real number.
	 */
	public double distanceFromOrigin()
	{
		return Math.sqrt(x * x + y * y);
	}

	public static double distance(Point a, Point b)
	{
		return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	}

	public double nonStaticDistance(Point a)
	{
		double deltaX = this.x - x;
		double deltaY = this.y - y;
		return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
	}

	public String toString()
	{
		return name + ":(" + x + ", " + y + ")";
	}



}