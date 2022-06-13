package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.MemberViewer;
import gui.WindowFrame;
import manager.HoGYMmanager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberViewer = frame.getMemberviewer();
		HoGYMmanager hoGYM = getObject("hoGYM.ser");
		memberViewer.setHoGYM(hoGYM);
		
		JButton b = (JButton) e.getSource();  
		frame.setupPanel(memberViewer);
	}
	
	public static HoGYMmanager getObject(String fileName) {
		HoGYMmanager hoGYM = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			hoGYM =(HoGYMmanager) in.readObject();
			
			in.close();
			file.close();
			
			 
		} catch (FileNotFoundException e) {
			return hoGYM;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hoGYM;
		
	}
}
