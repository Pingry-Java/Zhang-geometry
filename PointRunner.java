public class PointRunner
{
	public static void main(String[] args)
	{
		Point p = new Point(3,4);
		Point q = new Point (4,5);
		System.out.println(p.getX());
		System.out.println(p.distanceFromOrigin());
		System.out.println(p.distance(p, q));
		System.out.println(p.nonStaticDistance(q));

		Segment a = new Segment(p, q);
		new Segment();
		System.out.println(a.slope());


		Circle c = new Circle(1);
		System.out.println(c.diameter());
	}

}