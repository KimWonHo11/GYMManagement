package member;

import java.util.Scanner;

public class WeightMember extends WorkOutMember{ //WorkOutMember Ŭ������ WeightMember Ŭ������ ���
	
	public WeightMember(MemberKind kind) { //WeightMember Ŭ������ kind�� ������ �Լ��� ����
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
