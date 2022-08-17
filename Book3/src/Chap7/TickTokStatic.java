/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap7;

/**
 *
 * @author dylla
 */
import java.awt.event.*;
import javax.swing.*;

public class TickTokStatic {

    private static String tickMessage = "Tick...";
    private static String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    static class Ticker implements ActionListener {

        private boolean tick = true;

        public void actionPerformed(
                ActionEvent event) 
            if (tick)
 {
 System.out.println(tickMessage);
        }

        
            else
 {
 System.out.println(tockMessage);
        }
        tick  = !tick;
    }
}
}
