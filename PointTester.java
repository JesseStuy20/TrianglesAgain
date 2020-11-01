public class PointTester {
  public static void main(String[] args) {
    Point p1 = new Point(3.0,4.0) ;
    System.out.println(p1.getX()) ;
    System.out.println(p1.getY()) ;
    Point p2 = new Point(0.0,0.0) ;
    System.out.println(p1.distanceTo(p2)) ;
    Point p3 = new Point(0.0,0.0) ;
    System.out.println(p1.equals(p2)) ;
    System.out.println(p2.equals(p3)) ;
    Point p4 = new Point (3.0,0.0) ;
    Triangle t1 = new Triangle(p1,p2,p4) ;
    System.out.println(t1.getPerimeter()) ;
    System.out.println(t1.getArea()) ;
    System.out.println(t1.classify()) ;
    System.out.println(t1.toString()) ;
    Point p5 = new Point (-1.0,-1.0) ;
    t1.setVertex(1, p5) ;
    System.out.println(t1.getPerimeter()) ;
    System.out.println(t1.getArea()) ;
    System.out.println(t1.classify()) ;
    System.out.println(t1.toString()) ;
  }

}
