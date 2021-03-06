package gui;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import listeners.MemberAdderCancelListener;
import manager.HoGYMmanager;
import member.MemberInput;

public class MemberViewer extends JPanel {
	
	WindowFrame frame;
	HoGYMmanager hoGYM;
	

	public HoGYMmanager getHoGYM() {
		return hoGYM;
	}

	public void setHoGYM(HoGYMmanager hoGYM) {
		this.hoGYM = hoGYM;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");	
		model.addColumn("Name");
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Bmi");
		model.addColumn("PhoneNumber");
		model.addColumn("ProgramName");
		model.addColumn("CONTACT Info");
		
		for(int i = 0; i < hoGYM.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = hoGYM.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getHeight());
			row.add(mi.getWeight());
			row.add(mi.getBmi());
			row.add(mi.getPhoneNumber());
			row.add(mi.getProgramName());
			model.addRow(row);
		}
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));

		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MemberViewer(WindowFrame frame, HoGYMmanager hoGYM){
		this.frame = frame;
		this.hoGYM = hoGYM;
		
		System.out.println("***" + hoGYM.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");	
		model.addColumn("Name");
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Bmi");
		model.addColumn("PhoneNumber");
		model.addColumn("ProgramName");
		model.addColumn("CONTACT Info");
		
		for(int i = 0; i < hoGYM.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = hoGYM.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getHeight());
			row.add(mi.getWeight());
			row.add(mi.getBmi());
			row.add(mi.getPhoneNumber());
			row.add(mi.getProgramName());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
