import java.util.ArrayList;
import java.util.Scanner;

import member.JumpingMember;
import member.Member;
import member.MemberInput;
import member.MemberKind;
import member.PilatesMember;
import member.RunningMember;
import member.WeightMember;

public class HoGYMmanager {
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;
	HoGYMmanager(Scanner input) {
		this.input = input;
	} 	

	public void Addm() {
		int kind =0;
		MemberInput memberInput;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1 for Running ");
			System.out.println("2 for Weight ");
			System.out.println("3 for Pilates ");
			System.out.println("4 for Jumping ");
			System.out.println("Select num for Member Kind between 1~4:");
			kind = input.nextInt();
			if(kind==1) {
				memberInput = new RunningMember(MemberKind.Running);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else if(kind == 2) {
				memberInput = new WeightMember(MemberKind.Weight);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else if(kind == 3) {
				memberInput = new PilatesMember(MemberKind.Pilates);
				members.add(memberInput);
				break;
			}
			else if(kind == 4) {
				memberInput = new JumpingMember(MemberKind.Jumping);
				members.add(memberInput);
				break;
			}
			else {
				System.out.println("Select num for Member Kind between 1~4");
			}
		}
	}

	public void Delm() {
		System.out.print("Member Name:");
		String name = input.next();
		int index= -1;
		for(int i=0; i< members.size(); i++) {
			if (members.get(i).getName() == name) {
				index =i;
				break;
			}
		}
		if(index >= 0) {
			members.remove(index);
			System.out.println("회원" + name + "삭제했습니다.");
		}
		else {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
			
	}

	public void Edim() {
		System.out.print("Member Name:");
		String name = input.next();
		for(int i=0; i < members.size(); i++) {
			MemberInput memberInput = members.get(i);
			if (memberInput.getName() == name) {
				int num=0;
				while (num != 7) {
					System.out.println("Member Info Edit Menu");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Height");
					System.out.println("3. Edit Weight");
					System.out.println("4. Edit Bmi");
					System.out.println("5. Edit Number");
					System.out.println("6. Edit Date");
					System.out.println("7. Exit");
					System.out.println("Select one number between 1-7:");
					num = input.nextInt();
		
					switch (num) {
					case 1: 
						System.out.print("Member Name: ");
						String Name= input.next();
						memberInput.setName(Name);
						break;
					case 2: 
						System.out.print("Member Height: ");
						double Height = input.nextDouble();
						memberInput.setHeight(Height);
						break;
					case 3: 
						System.out.print("Member Weight: ");
						double Weight = input.nextDouble();
						memberInput.setWeight(Weight);
						break;
					case 4: 
						System.out.print("Member Bmi: ");
						double Bmi = input.nextDouble();
						memberInput.setBmi(Bmi);
						break;
					case 5: 
						System.out.print("Member Number: ");
						String Number= input.next();
						memberInput.setNumber(Number);
						break;
					case 6: 
						System.out.print("Member date: ");
						String Program = input.next();
						memberInput.setProgram(Program);
						break;
					case 7:
						System.out.println("Exit");
					}
				}
				break;
			}
		}
	}

	public void Viem() {
		System.out.println("# of  registered Members: " + members.size());
		for(int i=0;i<members.size(); i++) {
			members.get(i).print();
		}
	}
}

