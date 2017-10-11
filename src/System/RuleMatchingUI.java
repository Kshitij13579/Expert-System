package System;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class RuleMatchingUI extends JFrame {
	JLabel title;
	JFrame f;
	JLabel subtitle;
	JLabel att1;
	JLabel att2;
	JLabel att3;
	JLabel vatt1;
	JLabel vatt2;
	JLabel vatt3;
	
	JLabel message;
	JLabel red;
	JLabel yellow;
	JLabel green;
	
	JLabel vred;
	JLabel vyellow;
	JLabel vgreen;
	public RuleMatchingUI(Input inp){
		Transformation t=new Transformation(inp);
		inp=t.transformInput();
		RuleBase rule=new RuleBase();
		ArrayList signal=rule.match(inp);
		
		f=new JFrame("Rule Matching");
		f.setLayout(null);
		f.setLocation(350,200);
		f.setSize(600, 400);
		
		title=new JLabel("Rule Matching");
		Font ftitle=new Font("Serif", Font.BOLD, 24);
		title.setFont(ftitle);
		title.setBounds(200, 20,300, 30);
		
		subtitle=new JLabel("Attribute");
		Font subftitle=new Font("Serif", Font.BOLD, 20);
		subtitle.setFont(subftitle);
		subtitle.setBounds(240, 60,300, 30);
		
		subftitle=new Font("Serif", Font.BOLD, 16);
		att1=new JLabel("Road Size");	
		att1.setFont(subftitle);
		att1.setBounds(70, 100,100, 30);

		att2=new JLabel("Number Of Vehicle");
		att2.setFont(subftitle);
		att2.setBounds(200, 100,150, 30);
		
		att3=new JLabel("Busy Hour");
		att3.setFont(subftitle);
		att3.setBounds(390, 100,100, 30);
		
		vatt1=new JLabel(inp.ref_value[0]);	
		vatt1.setFont(subftitle);
		vatt1.setBounds(80, 130,100, 30);

		vatt2=new JLabel(inp.ref_value[1]);
		vatt2.setFont(subftitle);
		vatt2.setBounds(240, 130,150, 30);
		
		vatt3=new JLabel(inp.ref_value[2]);
		vatt3.setFont(subftitle);
		vatt3.setBounds(420, 130,100, 30);
		
		message=new JLabel("The updated signal values inferred from rules are:");
		message.setFont(subftitle);
		message.setBounds(50, 170,400, 30);
		
		red=new JLabel("Red:");
		red.setFont(subftitle);
		red.setBounds(110, 200,400, 30);
		
		yellow=new JLabel("Yellow:");
		yellow.setFont(subftitle);
		yellow.setBounds(100, 230,400, 30);
		
		green=new JLabel("Green:");
		green.setFont(subftitle);
		green.setBounds(100, 260,400, 30);
		
		//calculate percentage
		float r=(float) signal.get(0)*100;
		float y=(float) signal.get(1)*100;
		float g=(float) signal.get(2)*100;
		
		vred=new JLabel(r+"%");
		vred.setFont(subftitle);
		vred.setBounds(170, 200,400, 30);
		
		vyellow=new JLabel(y+"%");
		vyellow.setFont(subftitle);
		vyellow.setBounds(170, 230,400, 30);
		
		vgreen=new JLabel(g+"%");
		vgreen.setFont(subftitle);
		vgreen.setBounds(170, 260,400, 30);
		
		f.add(red);
		f.add(yellow);
		f.add(green);
		f.add(vred);
		f.add(vyellow);
		f.add(vgreen);
		f.add(message);
		f.add(vatt1);
		f.add(vatt2);
		f.add(vatt3);
		f.add(att1);
		f.add(att2);
		f.add(att3);
		f.add(subtitle);
		f.add(title);
		f.setVisible(true);
	}
	
	public static void main(String[] args){
		Input i=new Input(50,60,"Yes");
		new RuleMatchingUI(i);
	}
}
