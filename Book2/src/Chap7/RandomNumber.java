/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap7;

/**
 *
 * @author dylla
 */
public class RandomNumber {
    public static void main(String[] args)
 {
 int number = getRandomNumber();
 System.out.println("The number is " + number);
 }
 public static int getRandomNumber()
 {
 int num = (int)(Math.random() * 10) + 1;
 return num;
 }
}
