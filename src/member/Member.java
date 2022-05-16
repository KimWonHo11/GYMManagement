package member;

import java.util.Scanner;

import exception.PhoneNumberFormatException;

public abstract class Member implements MemberInput { //MemberInput클래스를 상속받고 회원정보를 함수와 변수로 선언 및 정의한 클래스
	protected MemberKind kind = MemberKind.Weight;
	protected int Id;
	protected String Name;
	protected double Height;
	protected double Weight;
	protected double Bmi;
	protected String PhoneNumber;
	protected String ProgramName;
	
	public Member() {
	}
	
	public Member(MemberKind kind) {
		this.kind = kind;
	}
	
	public Member(int Id, String Name, double Height, double Weight, double Bmi, String PhoneNumber, String ProgramName) {
		this.Id = Id;
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.Bmi = Bmi;
		this.PhoneNumber = PhoneNumber;
		this.ProgramName = ProgramName;
	}
	
	public Member(MemberKind kind, int Id, String Name, double Height, double Weight, double Bmi, String PhoneNumber, String ProgramName) {
		this.kind = kind;
		this.Id = Id;
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.Bmi = Bmi;
		this.PhoneNumber = PhoneNumber;
		this.ProgramName = ProgramName;
	}
	
	public MemberKind getKind() {
		return kind;
	}


	public void setKind(MemberKind kind) {
		this.kind = kind;
	}


	public int getId() {
		return Id;
	}


	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public double getHeight() {
		return Height;
	}


	public void setHeight(double height) {
		this.Height = height;
	}


	public double getWeight() {
		return Weight;
	}


	public void setWeight(double weight) {
		this.Weight = weight;
	}


	public double getBmi() {
		return Bmi;
	}


	public void setBmi(double bmi) {
		this.Bmi = bmi;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String PhoneNumber) throws PhoneNumberFormatException{
		if(!PhoneNumber.contains("-") && !PhoneNumber.equals("")) {
			throw new PhoneNumberFormatException();
		}
		this.PhoneNumber = PhoneNumber;
	}


	public String getProgramName() {
		return ProgramName;
	}


	public void setProgramName(String ProgramName) {
		this.ProgramName = ProgramName;
	}
	
	public abstract void print();
	
	public void setMemberId(Scanner input) {
		System.out.print("Member Id: ");
		int Id = input.nextInt();
		this.setId(Id);
	}
	
	public void setMemberName(Scanner input) {
		System.out.print("Member Name: ");
		String Name = input.next();
		this.setName(Name);
	}
	
	public void setMemberHeight(Scanner input) {
		System.out.print("Member Height: ");
		double Height = input.nextDouble();
		this.setHeight(Height);
	}
	
	public void setMemberWeight(Scanner input) {
		System.out.print("Member Weight: ");
		double Weight = input.nextDouble();
		this.setWeight(Weight);
	}
	
	public void setMemberBmi(Scanner input) {
		System.out.print("Member Bmi: ");
		double Bmi = input.nextDouble();
		this.setBmi(Bmi);
	}
	
	public void setMemberPhoneNumber(Scanner input) {
		String PhoneNumber= "";
		while(!PhoneNumber.contains("-")) {
			System.out.print("Member PhoneNumber: ");
			PhoneNumber= input.next();
			try {
				this.setPhoneNumber(PhoneNumber);
			}
			catch(PhoneNumberFormatException e) {
				System.out.println("Incorrect PhoneNumber Format. put the PhoneNumber that contains -");
			}
		}
	}
	
	public void setMemberProgramName(Scanner input) {
		System.out.print("Member ProgramName: ");
		String ProgramName= input.next();
		this.setProgramName(ProgramName);
	}
	
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Running:
			skind = "Running";
			break;
		case Weight:
			skind = "Weight";
			break;
		case Pilates:
			skind = "Pilates";
			break;
		case Jumping:
			skind = "Jumping";
			break;
		default:
		}
		return skind;
	}


}
