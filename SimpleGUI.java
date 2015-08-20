 	
package task;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
 static String someString;
 static String answer;
 static String clear;
 int b =0;
 
	ButtonEventListener listener=new ButtonEventListener ();

	private JButton button = new JButton("count up");
	private JTextField input = new JTextField("");
	private JLabel label = new JLabel("Input:");
	private JLabel Answer= new JLabel("Output:");
	private JLabel output = new JLabel("");
	private JButton clearing = new  JButton("clearing");
	

	public SimpleGUI() {
		super("Simple calculator");
	    this.setBounds(150,150,300,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,2,2,2));
	    container.add(label);
	    container.add(input);
	    container.add(Answer);
	    container.add(output);
	    container.add(clearing);
	    button.addActionListener(new ButtonEventListener());
	    clearing.addActionListener(new ButtonEventListener());
	    container.add(clearing);
	     container.add(button);
	 	   
	}

	 class ButtonEventListener implements ActionListener {		
		public void actionPerformed(ActionEvent e) {
			try{
			if(e.getSource()==button){
				someString =input.getText();
					b=Ñalculator.eval(someString);
			answer=("You'r answer is=" +b);
			output.setText(answer);
							}
			if(e.getSource()==clearing){
	             output.setText(null);
				input.setText(null);
					}
					}catch(Exception ex){ JOptionPane.showMessageDialog(null,"Please enter correct type");
	}
	}
	}
}

	

