/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap8;

/**
 *
 * @author dylla
 */
public class DivideByZero {
 public static void main(String[] args)
 {
 int a = 5;
 int b = 0; // you know this won't work
 try
     {
 int c = a / b; // but you try it anyway
 }
 catch (ArithmeticException e)
 {
 System.out.println("Oops, you can't "
 + "divide by zero.");
 }
 }
}
