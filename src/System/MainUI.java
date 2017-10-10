package System;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainUI extends JFrame {
	public MainUI(){
		JFrame f=new JFrame("Traffic Congestion Control");
		f.setLocation(350, 100);
		f.setSize(550, 600);
		f.setLayout(null);
		
		JLabel title=new JLabel("Traffic Congestion Control");
		Font ftitle=new Font("Serif", Font.BOLD, 20);
		title.setFont(ftitle);
		title.setBounds(130,15, 300, 30);
		
		JLabel label1=new JLabel("Road Size:");
		Font flabel1=new Font("Serif", Font.BOLD, 15);
		label1.setFont(flabel1);
		label1.setBounds(70,100, 100, 30);
		
		JLabel label2=new JLabel("Number Of Vehicles:");
		Font flabel2=new Font("Serif", Font.BOLD, 15);
		label2.setFont(flabel2);
		label2.setBounds(70,130, 200, 30);
		
		JLabel label3=new JLabel("Busy Hour:");
		Font flabel3=new Font("Serif", Font.BOLD, 15);
		label3.setFont(flabel3);
		label3.setBounds(70,160, 100, 30);
		
		JTextField tlabel1=new JTextField(100);
		tlabel1.setBounds(150, 105, 100, 20);
		
		JTextField tlabel2=new JTextField(100);
		tlabel2.setBounds(220, 135, 100, 20);
		
		JComboBox<String> tlabel3=new JComboBox<>();
		tlabel3.setBounds(150, 165, 100, 20);
		tlabel3.addItem("Yes");
		tlabel3.addItem("No");
		
		JButton enter=new JButton("Enter");
		enter.setBounds(250, 450, 80, 30);
		
		JButton blabel1=new JButton("Input Transformation");
		blabel1.setBounds(50,500, 130, 30);
		
		JButton blabel2=new JButton("Rule Activation");
		blabel2.setBounds(220, 500, 130, 30);
		
		JButton blabel3=new JButton("Belief Update");
		blabel3.setBounds(380, 500, 130, 30);
		
		f.add(title);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(tlabel1);
		f.add(tlabel2);
		f.add(tlabel3);
		f.add(enter);
		f.add(blabel1);
		f.add(blabel2);
		f.add(blabel3);
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainUI();
	}

}
