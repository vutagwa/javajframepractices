/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dropdown;

import java.awt.*;
import java.awt.Event.*;
public class Dropdown {

    Dropdown(){
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(200,200,90,90);
        c.add("Marion");
        c.add("Edgah");
        c.add("Elvin");
        c.add("Benedict");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Dropdown();
    }
    
}
