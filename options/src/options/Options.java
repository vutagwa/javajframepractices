/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package options;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Options {

    Options(){
        Frame f = new Frame();
        final Label label = new Label();
        label.setSize(500,500);
        label.setAlignment(label.CENTER);
        Button b = new Button();
        b.setBounds(200,100,50,20);
        final Choice c = new Choice();
        c.setBounds(200,100,75,75);
        c.add("python");
        c.add("kotlin");
        c.add("php");
        c.add("ruby");
        f.add(c);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "lang:" +c.getItem(c.getSelectedIndex());
                label.setText(data);
            }
        });
        
    }
    public static void main(String[] args) {
        new Options();
    }
    
}
