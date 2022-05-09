package member;

import java.util.Scanner;

public class JumpingMember extends Member implements MemberInput {
	
	public JumpingMember(MemberKind kind) {
		super(kind);
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
		
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you want a Jumping? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Program Level:");
				String Program = input.next();
				this.setProgram(Program);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setProgram("");
				break;
			}
			else {
			}
		}
	}
	
	public void print() {
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
		System.out.println("Kind" + skind + "Name: " + Name + " Height: " + Height + " Weight: " + Weight + " Bmi: " + Bmi + " Number: " + Number + " Program: " + Program);
	}
}
