public class PointTester
{
  public static void main(String[] args)
  {
    Point A = new Point(3.2, 3.7);
    Point B = new Point(A);
    System.out.println(A.getX() + " should be 3.2");
    System.out.println(B.getY() + " should be 3.7");
  }
}
