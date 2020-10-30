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
  public String classify()
  {
    double sideA = Math.round(this.v1.distanceTo(this.v2) * 10000.0) / 10000.0;
    double sideB = Math.round(this.v2.distanceTo(this.v3) * 10000.0) / 10000.0;
    double sideC = Math.round(this.v3.distanceTo(this.v1) * 10000.0) / 10000.0;
    if (sideA == sideB && sideB == sideC)
    {
      return "equilateral";
    }
    else if (sideA == sideB || sideA == sideC || sideB == sideC)
    {
      return "isosceles";
    }
    else
    {
      return "scalene";
    }
  }
  public String toString()
  {
    return "v1(" + this.v1.getX() + ", " + this.v1.getY() + ") v2(" + this.v2.getX() + ", " + this.v2.getY() + ") v3(" + this.v3.getX() + ", " + this.v3.getY() + ")";
  }
  public void setVertex(int index, Point newP)
  {
    if (index == 0)
    {
      v1 = newP;
    }
    else if (index == 1)
    {
      v2 = newP;
    }
    else if (index == 2)
    {
      v3 = newP;
    }
  }
}
