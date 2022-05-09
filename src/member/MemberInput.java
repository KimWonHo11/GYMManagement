package member;

import java.util.Scanner;

public interface MemberInput {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String name);
	
	public void setHeight(double height);
	
	public void setWeight(double weight);
	
	public void setBmi(double bmi);
	
	public void setNumber(String number);
	
	public void setProgram(String program);
	
	public void print();
}
