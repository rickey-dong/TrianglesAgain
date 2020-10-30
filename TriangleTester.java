public class TriangleTester
{
  public static void main(String[] args)
  {
    Point A = new Point(0.0,0.0);
    Point B = new Point(0.0,3.0);
    Point C = new Point(4.0,0.0);
    Triangle t1 = new Triangle(A, B, C);
    System.out.println(t1.getPerimeter() + " should be 12.0");
    System.out.println(t1.getArea() + " should be 6.0");
  }
}
