package ru.stqa.pft.sndbx;

/**
 * Created by Екатерина on 1/17/2020.
 */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }

}
