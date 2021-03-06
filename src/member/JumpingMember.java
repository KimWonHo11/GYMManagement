package member;

import java.util.Scanner;

public class JumpingMember extends WorkOutMember{ //WorkOutMember 클래스를 JumpingMember 클래스가 상속
	
	public JumpingMember(MemberKind kind) { //JumpingMember 클래스의 kind를 생성자 함수로 구현
		super(kind);
	}
	
	public void getUserInput(Scanner input) { //헬스장 회원에게 필요한 정보들을 입력받음
		setMemberId(input);
		setMemberName(input);
		setMemberHeight(input);
		setMemberWeight(input);
		setMemberBmi(input);	
		setMemberPhoneNumber(input);
		setMemberProgram(input);
	}	
}
