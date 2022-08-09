/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap3;

/**
 *
 * @author dylla
 */
 class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass()
 {
 }
 public static SingletonClass getInstance()
 {
 if (instance == null)
 instance = new SingletonClass();
 return instance;
 }
}
