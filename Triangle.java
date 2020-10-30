public class Triangle
{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c)
  {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
  {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public double getPerimeter()
  {
    return this.v1.distanceTo(this.v2) + this.v2.distanceTo(this.v3) + this.v3.distanceTo(this.v1);
  }
  public double getArea()
  {
    double semiperimeter = this.getPerimeter() / 2;
    double sideA = this.v1.distanceTo(this.v2);
    double sideB = this.v2.distanceTo(this.v3);
    double sideC = this.v3.distanceTo(this.v1);
    return Math.sqrt( (semiperimeter) * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC) );
  }
}
