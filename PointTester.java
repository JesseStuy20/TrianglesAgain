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
  }

}
