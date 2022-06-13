package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MemberAdder;
import gui.MenuSelection;
import gui.WindowFrame;

public class MemberAdderCancelListener implements ActionListener {
	WindowFrame frame;

	public MemberAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();  
		MenuSelection select = frame.getMenuselection();
		frame.setupPanel(select);
	}
}
