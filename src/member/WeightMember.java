package member;

import java.util.Scanner;

public class WeightMember extends Member {
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
			System.out.print("Do you want  an Program? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Member Program Kind:");
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
}
