package com.driver;

public class Main {
  public static void main(String[] args) {
    Products ans = new Products();
    System.out.println(ans.product(5, 6));
    System.out.println(ans.product(5, 6));
    System.out.println(ans.product(4, 8, 3));
  }

}

class Products {
  Products() {

  }

  public int product(int a, int b) {
    return a * b;
  }

  public int product(int a, int b, int c) {
    return a * b * c;
  }

  public double product(double a, double b) {
    return a * b;
  }
}