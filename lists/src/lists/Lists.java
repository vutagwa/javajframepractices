/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.awt.*;
import javax.swing.JFrame;

public class Lists {
    
    Lists(){
        Frame f = new Frame();
        List l1 = new List(5);
        l1.setBounds(100,100,80,80);
        l1.add("Mokeira");
        l1.add("Cyndi");
        l1.add("Mwikali");
        l1.add("Marion");
        l1.add("benedict");
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Lists();
        
    }
    
}
