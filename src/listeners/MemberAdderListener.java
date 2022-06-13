package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PhoneNumberFormatException;
import manager.HoGYMmanager;
import member.MemberInput;
import member.MemberKind;
import member.WeightMember;

public class MemberAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldHeight;
	JTextField fieldWeight;
	JTextField fieldBmi;
	JTextField fieldPhoneNumber;
	JTextField fieldProgramName;
	
	HoGYMmanager hoGYM;
	
	public MemberAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldHeight, JTextField fieldWeight,
			JTextField fieldBmi, JTextField fieldPhoneNumber, JTextField fieldProgramName, HoGYMmanager hoGYM) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldHeight = fieldHeight;
		this.fieldWeight = fieldWeight;
		this.fieldBmi = fieldBmi;
		this.fieldPhoneNumber = fieldPhoneNumber;
		this.fieldProgramName = fieldProgramName;
		this.hoGYM = hoGYM;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberInput member = new WeightMember(MemberKind.Weight);
		member.setId(Integer.parseInt(fieldID.getText()));
		member.setName(fieldName.getText());
		member.setHeight(Integer.parseInt(fieldHeight.getText()));
		member.setWeight(Integer.parseInt(fieldWeight.getText()));
		member.setBmi(Integer.parseInt(fieldBmi.getText()));
		try {
			member.setPhoneNumber(fieldPhoneNumber.getText());
		} catch (PhoneNumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		member.setProgramName(fieldProgramName.getText());
		hoGYM.Addm(member);
		putObject(hoGYM, "hoGYM.ser");
		member.print();
	}
	
	public static void putObject(HoGYMmanager hoGYM, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(hoGYM);
			
			out.close();
			file.close();
			
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
