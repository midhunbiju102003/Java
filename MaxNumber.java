import java.awt.*; 
import java.awt.event.*; 

public class MaxNumber extends Frame { 
    private TextField num1Field, num2Field, num3Field, resultField; 
    private Button calculateButton; 

    public MaxNumber() {  // Added missing opening brace
        setTitle("Maximum of Three Numbers"); 
        setSize(300, 200); 
        setLayout(new FlowLayout());  

        num1Field = new TextField(10); 
        num2Field = new TextField(10); 
        num3Field = new TextField(10);  // Added missing semicolon
        resultField = new TextField(20); 
        resultField.setEditable(false); 
        calculateButton = new Button("Calculate Maximum"); 

        add(new Label("Enter three numbers: ")); 
        add(num1Field); 
        add(num2Field); 
        add(num3Field); 
        add(calculateButton); 
        add(new Label("Maximum: ")); 
        add(resultField); 

        calculateButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                calculateMaximum(); 
            } 
        }); 

        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                System.exit(0); 
            } 
        }); 
    } 

    private void calculateMaximum() { 
        try { 
            double num1 = Double.parseDouble(num1Field.getText()); 
            double num2 = Double.parseDouble(num2Field.getText()); 
            double num3 = Double.parseDouble(num3Field.getText()); 
            double maximum = Math.max(Math.max(num1, num2), num3); 
            resultField.setText(Double.toString(maximum)); 
        } catch (NumberFormatException ex) { 
            resultField.setText("Invalid input. Enter numbers."); 
        } 
    } 

    public static void main(String[] args) { 
        MaxNumber maxApp = new MaxNumber(); 
        maxApp.setVisible(true); 
    } 
}