package member;

import java.util.Scanner;

import exception.PhoneNumberFormatException;

public interface MemberInput { //운동종류에 따른 회원의 신상정보를 각각 입력하기 위해 추상적으로 구현한 클래스
	
	public void getUserInput(Scanner input);
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public double getHeight();
	
	public MemberKind getKind();
	
	public double getBmi();
	
	public String getPhoneNumber();
	
	public String getProgramName();
	
	public double getWeight();
	
	public void setName(String Name); 
	
	public void setHeight(double height);
	
	public void setWeight(double weight);
	
	public void setBmi(double bmi);
	
	public void setPhoneNumber(String phonenumber) throws PhoneNumberFormatException;
	
	public void setProgramName(String programname);
	
	public void print();
	
	public void setMemberId(Scanner input);
	
	public void setMemberName(Scanner input);
	
	public void setMemberHeight(Scanner input);
	
	public void setMemberWeight(Scanner input);
	
	public void setMemberBmi(Scanner input);
	
	public void setMemberPhoneNumber(Scanner input);
	
	public void setMemberProgramName(Scanner input);

}
