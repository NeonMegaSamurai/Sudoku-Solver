import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class GUI {

        public void createGUI(){
                JFrame win = new JFrame("Test name");
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                win.setPreferredSize(new Dimension(500, 700));

                win.pack();
                win.setVisible(true);
        }

}


