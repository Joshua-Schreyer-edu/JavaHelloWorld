/**
 * The HelloWorld class demonstrates a simple Java program 
 * that prints "Hello, World!" to the console.
 *  
 * @author J. Cihlar
 * @version 1.0
 * @since 2024-08-18
 */

import java.util.Scanner;

public class HelloWorld {

    // this is where every Java program starts
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    sc.close();

    System.out.println("Hello, " + name + "!");
  }
}
