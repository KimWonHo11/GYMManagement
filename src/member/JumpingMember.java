package member;

import java.util.Scanner;

public class JumpingMember extends WorkOutMember{ //WorkOutMember Ŭ������ JumpingMember Ŭ������ ���
	
	public JumpingMember(MemberKind kind) { //JumpingMember Ŭ������ kind�� ������ �Լ��� ����
		super(kind);
	}
	
	public void getUserInput(Scanner input) { //�ｺ�� ȸ������ �ʿ��� �������� �Է¹���
		setMemberId(input);
		setMemberName(input);
		setMemberHeight(input);
		setMemberWeight(input);
		setMemberBmi(input);	
		setMemberPhoneNumber(input);
		setMemberProgram(input);
	}	
}
