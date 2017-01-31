public class Segment
{
	private Point start;
	private Point end;
	// Data coudl get inconsistent if I did this. Dont make it so that length and start/end point differ
	// private double length;

	//Default Constructor because it has no args
	//Need to oerride the default constructor rewrites higher class function like object
	public Segment()
	{
		this.start = new Point();
		this.end = new Point();

		// Antoher way to do it
		// this(new Point(), new Point());


	}
	//belongs to Class Segment
	//Generally good to initialize these right away
	private static int numSegments = 0;
	


	public Segment(Point start, Point end)
	{
		//this segment you are currently constructing
		this.start = start;
		this.end = end;
	}

	public double slope()
	{
		double deltaX = start.getX() - end.getX();
		double deltaY = start.getY() - end.getY();

		return deltaY/deltaX;
	}

	public String name()
	{
		String firstPoint = start.toString();
		String secondPoint = end.toString();
		return firstPoint + secondPoint;
	}

	//method to write output to name
	// public String toString()
	// {
		
	// }


	public double length()
	{
		//TODO rewrite this method to use methods from the point class
		double deltaX = start.getX() - end.getX();
		double deltaY = start.getY() - end.getY();

		return Math.sqrt(Math.pow(deltaX, 2) + deltaY*deltaY);
	}
}