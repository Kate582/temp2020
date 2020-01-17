package ru.stqa.pft.sndbx;

public class TestProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(3);
    System.out.println("Площадь для квадрата " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(1, 3.0);
    System.out.println("Площадь для " + r.a + " и " + r.b + " это " + r.area());

    Circle c = new Circle (2);
    System.out.println("Площадь для круга с радиусом" + c.r + " = " + area(c));

    Point p1 = new Point(1, 1);
    Point p2 = new Point(2, 2);
    System.out.println("Расстояние между " + "(" + p1.x + "," + p1.y + ")" + "и" + "(" + p2.x + "," + p2.y + ")" + " = " + p1.distance(p2));
  }

  public static void hello(String str) {
    System.out.println("Hello, " + str + "!");
  }

  public static double area(Circle c) {
    return 3.14 * c.r * c.r;
  }

//  public static double distance(Point p1, Point p2){
//    return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
//  }

}