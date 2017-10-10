package System;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainUI extends JFrame implements ActionListener{
	Input i;
	public JTextField tlabel1;
	public JTextField tlabel2;
	public JComboBox<String> tlabel3;
	JButton enter;
	JButton blabel1;
	JButton blabel2;
	JButton blabel3;
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
		
		tlabel1=new JTextField(100);
		tlabel1.setBounds(150, 105, 100, 20);
		
		tlabel2=new JTextField(100);
		tlabel2.setBounds(220, 135, 100, 20);
		
		tlabel3=new JComboBox<>();
		tlabel3.setBounds(150, 165, 100, 20);
		tlabel3.addItem("Yes");
		tlabel3.addItem("No");
		
		enter=new JButton("Enter");
		enter.setBounds(250, 450, 80, 30);
		
		blabel1=new JButton("Input Transformation");
		blabel1.setBounds(30,500, 170, 30);
		
		blabel2=new JButton("Rule Activation");
		blabel2.setBounds(220, 500, 130, 30);
		
		blabel3=new JButton("Belief Update");
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
		
		blabel1.addActionListener(this);
		enter.addActionListener(this);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==enter){
			i=new Input(Integer.parseInt(tlabel1.getText()),Integer.parseInt(tlabel2.getText()),tlabel3.getSelectedItem().toString());
			JOptionPane.showMessageDialog(null, "Data Inserted Succesfully");
		}
		if(e.getSource()==blabel1){
			new TransformationUI(i);
		}
	}

}
