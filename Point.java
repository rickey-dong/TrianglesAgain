public class Point
{
  private double x,y;
  public Point(double X, double Y)
  {
    x = X;
    y = Y;
  }
  public Point(Point p)
  {
    x = p.x;
    y = p.y;
  }
  public double getX()
  {
    return x;
  }
  public double getY()
  {
    return y;
  }
  public double distanceTo(Point other)
  {
    return Math.sqrt( ((other.x - this.x) * (other.x - this.x)) + ((other.y - this.y) * (other.y - this.y)) );
  }
  public boolean equals(Point other)
  {
    return other != null && this.x == other.x && this.y == other.y;
  }
}
