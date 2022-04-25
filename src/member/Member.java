package member;

import java.util.Scanner;

public class Member {
	protected ProgramKind kind = ProgramKind.Weight;
	protected String Name;
	protected double Height;
	protected double Weight;
	protected double Bmi;
	protected String Number;
	protected String Program;
	
	public Member() {
	}
	
	
	public Member(String Name, double Height, double Weight, double Bmi, String Number, String Program) {
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.Bmi = Bmi;
		this.Number = Number;
		this.Program = Program;
	}
	
	public ProgramKind getKind() {
		return kind;
	}


	public void setKind(ProgramKind kind) {
		this.kind = kind;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
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


	public String getNumber() {
		return Number;
	}


	public void setNumber(String number) {
		this.Number = number;
	}


	public String getProgram() {
		return Program;
	}


	public void setProgram(String program) {
		this.Program = program;
	}
	
	public void print() {
		System.out.println("Name: " + Name + " Height: " + Height + " Weight: " + Weight + " Bmi: " + Bmi + " Number: " + Number + " Program: " + Program);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member Name:");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Member Height:");
		double Height = input.nextDouble();
		this.setHeight(Height);
		
		System.out.print("Member Weight:");
		double Weight = input.nextDouble();
		this.setWeight(Weight);
		
		System.out.print("Member Bmi:");
		double Bmi = input.nextDouble();
		this.setBmi(Bmi);
		
		System.out.print("Member Phone Number:");
		String Number = input.next();
		this.setNumber(Number);
		
		System.out.print("Member Program Kind:");
		String Program = input.next();
		this.setProgram(Program);
	}

}
