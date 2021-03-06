package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.HoGYMmanager;

public class WindowFrame extends JFrame {
	HoGYMmanager hoGYM;
	MenuSelection menuselection;
	MemberAdder memberadder;
	MemberViewer memberviewer;

	
	public WindowFrame(HoGYMmanager hoGYM) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.hoGYM = hoGYM;
		this.menuselection = new MenuSelection(this);
		this.memberadder = new MemberAdder(this, this.hoGYM);
		this.memberviewer = new MemberViewer(this, this.hoGYM); 

		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MemberAdder getMemberadder() {
		return memberadder;
	}

	public void setMemberadder(MemberAdder memberadder) {
		this.memberadder = memberadder;
	}

	public MemberViewer getMemberviewer() {
		return memberviewer;
	}

	public void setMemberviewer(MemberViewer memberviewer) {
		this.memberviewer = memberviewer;
	}

}
