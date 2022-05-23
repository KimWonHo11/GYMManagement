package member;

import java.util.Scanner;

public abstract class WorkOutMember extends Member { //Member 클래스를 상속받은 추상화클래스
	
	
	public WorkOutMember(MemberKind kind) { //생성과 동시에 kind를 입력받는 생성자함수
		super(kind);
	}

	public abstract void getUserInput(Scanner input); //각각의 운동종류에 맞게 회원정보를 입력할 수 있도록 추상화메소드로 선언

	public void print() { //회원의 정보를 출력하는 함수
		String skind = getKindString();
		System.out.println("Kind: " + skind + "Id: " + Id + " Name: " + Name + " Height: " + Height + " Weight: " + Weight + " Bmi: " + Bmi + " PhoneNumber: " + PhoneNumber + " ProgramName: " + ProgramName);
	}
	
	public void setMemberProgram(Scanner input) { //회원이 운동프로그램을 원하면 입력하는 함수
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you want a Program? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setMemberProgramName(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setProgramName("");
				break;
			}
			else {
			}
		}
	}  

}
