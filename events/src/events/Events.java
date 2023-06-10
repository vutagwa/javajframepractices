/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events {

    Events(){
        Frame f = new Frame();
        final Label label = new Label();
        label.setAlignment(label.CENTER);
        label.setSize(500,100);
        Button b = new Button();
        b.setBounds(200,150,80,30);
        final List l1 = new List(4 ,false);
        l1.setBounds(100,100,70,70);
        l1.add("c");
        l1.add("c++");
        l1.add("c#");
        l1.add("Java");
        final List l2 = new List(4 ,false);
        l1.setBounds(100,200,70,70);
        l1.add("summer");
        l1.add("winter");
        l1.add("autum");
        l1.add("spring");
        f.add(l2);
        f.add(l1);
        f.add(b);
        f.add(label);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "prog lang:" +l1.getItem(l1.getSelectedIndex());
                data += "framework selected";
                for (String frame : l2.getSelectedItems()){
                    data +=frame+"";
                }
            label.setText(data);
            }
        });
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Events();
    }
    
}
