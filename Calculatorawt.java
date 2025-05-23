import java.awt.*; 
import java.awt.event.*; 

class Calculatorawt implements ActionListener { 
    Frame f = new Frame(); 
    Label l1 = new Label("First Number"); 
    Label l2 = new Label("Second Number"); 
    Label l3 = new Label("Result"); 
    TextField t1 = new TextField(); 
    TextField t2 = new TextField(); 
    TextField t3 = new TextField(); 
    Button b1 = new Button("Add"); 
    Button b2 = new Button("Sub"); 
    Button b3 = new Button("Mul"); 
    Button b4 = new Button("Div"); 
    Button b5 = new Button("Cancel"); 

    Calculatorawt() { 
        l1.setBounds(50, 100, 100, 20); 
        l2.setBounds(50, 140, 100, 20); 
        l3.setBounds(50, 180, 100, 20); 
        t1.setBounds(200, 100, 100, 20); 
        t2.setBounds(200, 140, 100, 20); 
        t3.setBounds(200, 180, 100, 20); 
        b1.setBounds(50, 250, 50, 20); 
        b2.setBounds(110, 250, 50, 20); 
        b3.setBounds(170, 250, 50, 20); 
        b4.setBounds(230, 250, 50, 20); 
        b5.setBounds(290, 250, 50, 20); 

        f.add(l1); f.add(t1); 
        f.add(l2); f.add(t2); 
        f.add(l3); f.add(t3); 
        f.add(b1); f.add(b2); 
        f.add(b3); f.add(b4); f.add(b5); 

        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 

        f.setLayout(null); 
        f.setSize(400, 350); 
        f.setLocation(500, 200); 
        f.setVisible(true); 
    } 

    public void actionPerformed(ActionEvent e) { 
        try {
            int n1 = Integer.parseInt(t1.getText()); 
            int n2 = Integer.parseInt(t2.getText()); 

            if (e.getSource() == b1) { 
                t3.setText(String.valueOf(n1 + n2)); 
            } else if (e.getSource() == b2) { 
                t3.setText(String.valueOf(n1 - n2)); 
            } else if (e.getSource() == b3) { 
                t3.setText(String.valueOf(n1 * n2)); 
            } else if (e.getSource() == b4) { 
                if (n2 != 0) {
                    t3.setText(String.valueOf(n1 / n2)); 
                } else {
                    t3.setText("Cannot divide by zero");
                }
            } else if (e.getSource() == b5) { 
                System.exit(0); 
            }
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    } 

    public static void main(String[] args) { 
        new Calculatorawt(); 
    } 
}