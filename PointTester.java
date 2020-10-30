public class PointTester
{
  public static void main(String[] args)
  {
    Point A = new Point(3.2, 3.7);
    Point B = new Point(A);
    Point C = new Point(5.7, 8.3);
    System.out.println(A.getX() + " should be 3.2");
    System.out.println(B.getY() + " should be 3.7");
    System.out.println(A.distanceTo(C) + " should be near 5.23545604508");
    System.out.println(A.distanceTo(B) + " should be 0.0");
    System.out.println(A.equals(B) + " should be true");
    System.out.println(A.equals(C) + " should be false");
  }
}
