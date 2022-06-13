package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import member.JumpingMember;
import member.Member;
import member.MemberInput;
import member.MemberKind;
import member.PilatesMember;
import member.RunningMember;
import member.WeightMember;

public class HoGYMmanager implements Serializable { //ȸ������ �Է�, ����, ����, ����� �Լ��� ������ Ŭ����
	/**
	 * 
	 */
	private static final long serialVersionUID = -5468554216985167472L;
	
	ArrayList<MemberInput> members = new ArrayList<MemberInput>(); //MemberInput Ŭ������ ArrayList�� ����
	transient Scanner input;
	HoGYMmanager(Scanner input) { //HoGYMmanager Ŭ������ �������Լ� ����
		this.input = input;
	} 	
	
	public void Addm(int Id, String Name, double Height, double Weight, double Bmi, String PhoneNumber, String ProgramName) {
		MemberInput memberInput = new WeightMember(MemberKind.Weight);
		memberInput.getUserInput(input);
		members.add(memberInput);
	}
	
	public void Addm(MemberInput memberInput) {
		members.add(memberInput);
	}

	
	public void Addm() { //ȸ������ �Է� �Լ�
		int kind =0; //ȸ���� ����� while���� �����ϱ� ���� kind�� 0���� ���� �� ����
		MemberInput memberInput; //MemberInput�� memberInput���� ����
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) { //kind�� 1,2,3,4�� �ƴϸ� while�� �ݺ�
			try { //���ڰ� �ƴ� ���� �Է¹����� ����ó��
				System.out.println("1 for Running ");
				System.out.println("2 for Weight ");
				System.out.println("3 for Pilates ");
				System.out.println("4 for Jumping ");
				System.out.print("Select num for Member Kind between 1~4: ");
				kind = input.nextInt();
				if(kind == 1) { //kind == 1�̸� ������� Running���� ���� �� ȸ������ �Է�
					memberInput = new RunningMember(MemberKind.Running);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 2) { //kind == 2�̸� ������� Weight���� ���� �� ȸ������ �Է�
					memberInput = new WeightMember(MemberKind.Weight);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 3) { //kind == 3�̸� ������� Pilates���� ���� �� ȸ������ �Է�
					memberInput = new PilatesMember(MemberKind.Pilates);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 4) { //kind == 4�̸� ������� Jumping���� ���� �� ȸ������ �Է�
					memberInput = new JumpingMember(MemberKind.Jumping);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else { //�� ���� ���ڰ� ������ 1~4���ڸ� �Է��� ����
					System.out.print("Select num for Member Kind between 1~4: ");
				}
			}
			catch(InputMismatchException e) { //���ڰ� �ƴ� ��� 1~4���ڸ� �Է��� ����
				System.out.println("Please put an integer between 1 and 4");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void Delm() { //ȸ�������� �����ϴ� �Լ�
		System.out.print("Member Id: ");
		int memberId = input.nextInt();
		int index= findIndex(memberId);
		removefromStudents(index, memberId);
	}
	
	public int findIndex(int memberId) { //�Է��� ȸ��Id�� ��ϵ� ȸ��Id�� ��ġ�ϴ��� Ȯ���ϴ� �Լ�
		int index= -1;
		for(int i=0; i< members.size(); i++) {
			if (members.get(i).getId() == memberId) {
				index =i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStudents(int index, int memberId) { //��ϵ� ȸ���̸� ���� �ƴϸ� ��ϵ� ȸ���� ���ٰ� ����ϴ� �Լ�
		if(index >= 0) {
			members.remove(index);
			System.out.println("ȸ��Id " + memberId + "�� �����߽��ϴ�.");
			return 1;
		}
		else {
			System.out.println("��ϵ� ȸ��Id�� �����ϴ�.");
			return -1;
		}	
	}

	public void Edim() { //ȸ�������� �����ϴ� �Լ�
		System.out.print("Member Id: ");
		int MemberId = input.nextInt(); //ȸ��Id�� �Է�
		for(int i=0; i < members.size(); i++) { //��ϵ� ȸ�� �� ��ŭ for�� �ݺ�
			MemberInput member = members.get(i);
			if (member.getId() == MemberId) { //�Է��� ȸ��Id�� ��ϵ� ȸ��Id�� ��ġ�ϸ� ����
				int num=0;
				while (num != 8) { //1~8���� ���� �� �ϳ� �����ϸ� �׿� �°� ��ϵ� ȸ������ ����
					showEditMenu();
					num = input.nextInt();
		
					switch (num) {
					case 1: 
						member.setMemberId(input); 
						break;
					case 2: 
						member.setMemberName(input);
						break;
					case 3: 
						member.setMemberHeight(input);
						break;
					case 4: 
						member.setMemberWeight(input);
						break;
					case 5: 
						member.setMemberBmi(input);
						break;
					case 6: 
						member.setMemberPhoneNumber(input);
						break;
					case 7: 
						member.setMemberProgramName(input);
						break;
					case 8:
						System.out.println("Exit");
					}
				}
				break;
			}
		}
	} 
 
	public void Viem() { //��ϵ� ȸ������ ����� ������� ��� ����ϴ� �Լ�
		System.out.println("# of  registered Members: " + members.size());
		for(int i=0;i<members.size(); i++) {
			members.get(i).print();
		}
	}
	
	public int size() {
		return members.size();
	}
		
	public MemberInput get(int index) {
		return (Member) members.get(index);
	}
		
	public void showEditMenu() { //edit�Լ��� ���� ����ϴ� �Լ�
		System.out.println("Member Info Edit Menu");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Height");
		System.out.println("4. Edit Weight");
		System.out.println("5. Edit Bmi");
		System.out.println("6. Edit PhoneNumber");
		System.out.println("7. Edit ProgramName");
		System.out.println("8. Exit");
		System.out.print("Select one number between 1-8: ");
	}


}

