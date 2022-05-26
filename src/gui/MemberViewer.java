package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberViewer extends JFrame {

	MemberViewer(){
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");	
		model.addColumn("Name");
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Bmi");
		model.addColumn("PhoneNumber");
		model.addColumn("ProgramName");
		model.addColumn("CONTACT Info");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
