import java.util.Scanner;

public class Menumanager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HoGYMmanager hoGYM = new HoGYMmanager(input);

		int num = 0;
		while (num != 5) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();

			switch (num) {
			case 1: // ȸ�� �Ż����� �Է�
				hoGYM.Addm();
				break;
			case 2: // ȸ�� �Ż����� ����
				hoGYM.Delm();
				break;
			case 3: // ȸ�� �Ż����� ����
				hoGYM.Edim();
				break;
			case 4: // ȸ�� �Ż����� ���
				hoGYM.Viem();
				break;
			case 5:
				System.out.println("END");
			}
		}
	}
}
