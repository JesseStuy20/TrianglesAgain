public class Triangle {
  private Point v1,v2,v3 ;

  public Triangle(Point a, Point b, Point c) {
    v1 = a ;
    v2 = b ;
    v3 = c ;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1,y1) ;
    v2 = new Point(x2,y2) ;
    v3 = new Point(x3,y3) ;
  }

  public double getPerimeter() {
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3)) ;
  }

  public double getArea() {
    double semiPerm = (getPerimeter() / 2) ;
    return (Math.sqrt(semiPerm *
                    (semiPerm - v1.distanceTo(v2)) *
                    (semiPerm - v2.distanceTo(v3)) *
                    (semiPerm - v1.distanceTo(v3)))) ;
  }

  public String classify() {
    String result = "" ;
    if (((Math.round(v1.distanceTo(v2) * 10000) / 10000)
      == (Math.round(v2.distanceTo(v3) * 10000) / 10000))
      && ((Math.round(v2.distanceTo(v3) * 10000) / 10000)
      == (Math.round(v1.distanceTo(v3) * 10000) / 10000)))
        result = "Equilateral" ;

    if (
      (((Math.round(v1.distanceTo(v2) * 10000) / 10000)
      == (Math.round(v2.distanceTo(v3) * 10000) / 10000))
      && ((Math.round(v2.distanceTo(v3) * 10000) / 10000)
      != (Math.round(v1.distanceTo(v3) * 10000) / 10000)))

      || (((Math.round(v2.distanceTo(v3) * 10000) / 10000)
      == (Math.round(v1.distanceTo(v3) * 10000) / 10000))
      && ((Math.round(v2.distanceTo(v3) * 10000) / 10000)
      != (Math.round(v1.distanceTo(v2) * 10000) / 10000)))

      || (((Math.round(v1.distanceTo(v2) * 10000) / 10000)
      == (Math.round(v1.distanceTo(v3) * 10000) / 10000))
      && ((Math.round(v1.distanceTo(v2) * 10000) / 10000)
      != (Math.round(v2.distanceTo(v3) * 10000) / 10000)))
        )
        result = "Isosceles" ;

    else result = "Scalene" ;
    return result ;
  }

  public String toString() {
    return ("v1("+v1.getX()+","+v1.getY()+") "
    +"v2("+v2.getX()+","+v2.getY()+") "
    +"v3("+v3.getX()+","+v3.getY()+")") ;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {v1 = newP ;}
    if (index == 1) {v2 = newP ;}
    if (index == 2) {v3 = newP ;}
  }

}
