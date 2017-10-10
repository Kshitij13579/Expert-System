package System;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;


public class TransformationUI extends JFrame {
	Transformation transform;
	public TransformationUI(Input i){
		JFrame f=new JFrame("Input Transformation");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setLocation(250,200);
		f.setSize(900, 300);
		
		JLabel title=new JLabel("Input Transformation");
		Font ftitle=new Font("Serif", Font.BOLD, 24);
		title.setFont(ftitle);
		title.setBounds(250, 20,300, 30);
		//transform data
		transform=new Transformation(i);
		i=transform.transformInput();
		//populating data
		String[] column=new String[]{"Serial No","Antecedent","Antecedent Value","High","Medium","Low","Yes","No","Max Priority"};
		String[][] data=new String[3][9];
		for(int k=0;k<3;k++){
			data[k][0]=(k+1)+"";
			data[k][1]=i.attribute[k];
			data[k][2]=i.attribute_value[k];
			data[k][3]=i.refdata[k][0];
			data[k][4]=i.refdata[k][1];
			data[k][5]=i.refdata[k][2];
			data[k][6]=i.refdata[k][3];
			data[k][7]=i.refdata[k][4];
			data[k][8]=i.ref_value[k];
		}
		JTable table=new JTable(data,column);
		table.setBounds(30, 90,800,100);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		JTableHeader h=table.getTableHeader();
		JPanel jp=new JPanel();
		jp.setBounds(10, 90,800, 100);
		jp.add(h);
		jp.add(table);
		
		
		f.add(title);
		f.add(jp);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input i1=new Input(80,50,"Yes");
		new TransformationUI(i1);
	}

}
