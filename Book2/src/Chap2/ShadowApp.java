/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap2;

/**
 *
 * @author dylla
 */
public class ShadowApp {
    static int x; 
 public static void main(String[] args)
 {
 x = 5; 
 System.out.println("x = " + x); 
 int x;
 x = 10; 
 System.out.println("x = " + x); 
 System.out.println("ShadowApp.x = " +
 ShadowApp.x); 
 }
}
