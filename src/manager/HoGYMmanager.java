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

public class HoGYMmanager implements Serializable { //회원정보 입력, 삭제, 편집, 출력을 함수로 구현한 클래스
	/**
	 * 
	 */
	private static final long serialVersionUID = -5468554216985167472L;
	
	ArrayList<MemberInput> members = new ArrayList<MemberInput>(); //MemberInput 클래스를 ArrayList로 생성
	transient Scanner input;
	HoGYMmanager(Scanner input) { //HoGYMmanager 클래스의 생성자함수 생성
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

	
	public void Addm() { //회원정보 입력 함수
		int kind =0; //회원의 운동종류 while문을 실행하기 위해 kind를 0으로 선언 및 정의
		MemberInput memberInput; //MemberInput을 memberInput으로 선언
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) { //kind가 1,2,3,4가 아니면 while문 반복
			try { //숫자가 아닌 것을 입력받으면 예외처리
				System.out.println("1 for Running ");
				System.out.println("2 for Weight ");
				System.out.println("3 for Pilates ");
				System.out.println("4 for Jumping ");
				System.out.print("Select num for Member Kind between 1~4: ");
				kind = input.nextInt();
				if(kind == 1) { //kind == 1이면 운동종류를 Running으로 설정 후 회원정보 입력
					memberInput = new RunningMember(MemberKind.Running);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 2) { //kind == 2이면 운동종류를 Weight으로 설정 후 회원정보 입력
					memberInput = new WeightMember(MemberKind.Weight);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 3) { //kind == 3이면 운동종류를 Pilates으로 설정 후 회원정보 입력
					memberInput = new PilatesMember(MemberKind.Pilates);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 4) { //kind == 4이면 운동종류를 Jumping으로 설정 후 회원정보 입력
					memberInput = new JumpingMember(MemberKind.Jumping);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else { //그 외의 숫자가 나오면 1~4숫자를 입력을 권장
					System.out.print("Select num for Member Kind between 1~4: ");
				}
			}
			catch(InputMismatchException e) { //숫자가 아닌 경우 1~4숫자를 입력을 권장
				System.out.println("Please put an integer between 1 and 4");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void Delm() { //회원정보를 삭제하는 함수
		System.out.print("Member Id: ");
		int memberId = input.nextInt();
		int index= findIndex(memberId);
		removefromStudents(index, memberId);
	}
	
	public int findIndex(int memberId) { //입력한 회원Id와 등록된 회원Id가 일치하는지 확인하는 함수
		int index= -1;
		for(int i=0; i< members.size(); i++) {
			if (members.get(i).getId() == memberId) {
				index =i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStudents(int index, int memberId) { //등록된 회원이면 삭제 아니면 등록된 회원이 없다고 출력하는 함수
		if(index >= 0) {
			members.remove(index);
			System.out.println("회원Id " + memberId + "이 삭제했습니다.");
			return 1;
		}
		else {
			System.out.println("등록된 회원Id가 없습니다.");
			return -1;
		}	
	}

	public void Edim() { //회원정보를 수정하는 함수
		System.out.print("Member Id: ");
		int MemberId = input.nextInt(); //회원Id를 입력
		for(int i=0; i < members.size(); i++) { //등록된 회원 수 만큼 for문 반복
			MemberInput member = members.get(i);
			if (member.getId() == MemberId) { //입력한 회원Id와 등록된 회원Id가 일치하면 실행
				int num=0;
				while (num != 8) { //1~8까지 보기 중 하나 선택하면 그에 맞게 등록된 회원정보 수정
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
 
	public void Viem() { //등록된 회원정보 등록한 순서대로 모두 출력하는 함수
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
		
	public void showEditMenu() { //edit함수의 보기 출력하는 함수
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

