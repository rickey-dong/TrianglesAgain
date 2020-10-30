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
    System.out.println(t1.classify() + " should be scalene");
    System.out.println(t1 + " should be v1(0.0, 0.0) v2(0.0, 3.0) v3(4.0, 0.0)");
  }
}
