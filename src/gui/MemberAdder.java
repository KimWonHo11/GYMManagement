package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MemberAdder extends JPanel {
	
	WindowFrame frame;
	
	public MemberAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: " , JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: " , JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelHeight = new JLabel("Height: " , JLabel.TRAILING);
		JTextField fieldHeight = new JTextField(10);
		labelHeight.setLabelFor(fieldHeight);
		panel.add(labelHeight);
		panel.add(fieldHeight);
		
		JLabel labelWeight = new JLabel("Weight: " , JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelBmi = new JLabel("Bmi: " , JLabel.TRAILING);
		JTextField fieldBmi = new JTextField(10);
		labelBmi.setLabelFor(fieldBmi);
		panel.add(labelBmi);
		panel.add(fieldBmi);
		
		JLabel labelPhoneNumber = new JLabel("PhoneNumber: " , JLabel.TRAILING);
		JTextField fieldPhoneNumber = new JTextField(10);
		labelPhoneNumber.setLabelFor(fieldPhoneNumber);
		panel.add(labelPhoneNumber);
		panel.add(fieldPhoneNumber);
		
		JLabel labelProgramName = new JLabel("ProgramName: " , JLabel.TRAILING);
		JTextField fieldProgramName = new JTextField(10);
		labelProgramName.setLabelFor(fieldProgramName);
		panel.add(labelProgramName);
		panel.add(fieldProgramName);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtillities.makeCompactGrid(panel, 8, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
