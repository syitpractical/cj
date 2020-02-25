import java.util.*;
import java.awt.*;
import java.awt.event.*;

class AWTFactorial extends Frame implements ActionListener {
    Button b;
    TextField t;
    Label l1, l2;

    AWTFactorial() {
        setTitle("Factorial");
        setVisible(true);
        setSize(200, 200);
        setLayout(new FlowLayout());
        l1 = new Label("Enter A Number: ");
        l2 = new Label("");
        t = new TextField(10);
        b = new Button("Factorial");
        b.addActionListener(this);
        add(l1);
        add(t);
        add(b);
        add(l2);
    }

    public void actionPerformed(ActionEvent AE) {
        if (AE.getSource() == b) {
            int fact = 1;
            String n = t.getText();
            int number = Integer.valueOf(n);
            for (int i = number; i >= 1; i--) {
                fact = fact * i;
            }
            String n2 = String.valueOf(fact);
            l2.setText(n2);
        }
    }

    public static void main(String args[]) {
        AWTFactorial f = new AWTFactorial();
    }
}