package member;

import java.util.Scanner;

public class RunningMember extends WorkOutMember{ //WorkOutMember Ŭ������ RunningMember Ŭ������ ���
	
	public RunningMember(MemberKind kind) { //RunningMember Ŭ������ kind�� ������ �Լ��� ����
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
