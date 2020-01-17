package ru.stqa.pft.sndbx;

public class TestProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    double l = 5;
    System.out.println("Площадь для квадрата " + l + " = " + area(l));

    double a = 2;
    double b = 3;
    System.out.println("Площадь = " + area(a, b));
  }

  public static void hello(String str) {
    System.out.println("Hello, " + str + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}