package member;

import java.util.Scanner;

public abstract class WorkOutMember extends Member { //Member Ŭ������ ��ӹ��� �߻�ȭŬ����
	
	
	public WorkOutMember(MemberKind kind) { //������ ���ÿ� kind�� �Է¹޴� �������Լ�
		super(kind);
	}

	public abstract void getUserInput(Scanner input); //������ ������� �°� ȸ�������� �Է��� �� �ֵ��� �߻�ȭ�޼ҵ�� ����

	public void print() { //ȸ���� ������ ����ϴ� �Լ�
		String skind = getKindString();
		System.out.println("Kind: " + skind + "Id: " + Id + " Name: " + Name + " Height: " + Height + " Weight: " + Weight + " Bmi: " + Bmi + " PhoneNumber: " + PhoneNumber + " ProgramName: " + ProgramName);
	}
	
	public void setMemberProgram(Scanner input) { //ȸ���� ����α׷��� ���ϸ� �Է��ϴ� �Լ�
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
