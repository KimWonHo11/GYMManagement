package member;

import java.util.Scanner;

public class PilatesMember extends WorkOutMember{ //WorkOutMember Ŭ������ PilatesMember Ŭ������ ���
	
	public PilatesMember(MemberKind kind) { //PilatesMember Ŭ������ kind�� ������ �Լ��� ����
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
