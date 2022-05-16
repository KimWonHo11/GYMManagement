import java.util.InputMismatchException;
import java.util.Scanner;

public class Menumanager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HoGYMmanager hoGYM = new HoGYMmanager(input);
		
		selectMenu(input, hoGYM);
	}
	
	public static void selectMenu(Scanner input, HoGYMmanager hoGYM) { //ȸ���� �Է�, ����, ����, ����� ���⸦ �����ִ� �Լ�
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
	
				switch (num) {
				case 1:
					hoGYM.Addm();
					break;
				case 2:
					hoGYM.Delm();
					break;
				case 3:
					hoGYM.Edim();
					break;
				case 4:
					hoGYM.Viem();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) { //1~5�� �ƴ� �ٸ� ���� ���ڸ� �Է��ϸ� ����ó�����ִ� �κ�
				System.out.println("Please put an integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu(){
		System.out.println("1. Add Member");
		System.out.println("2. Delete Member");
		System.out.println("3. Edit Member");
		System.out.println("4. View Member");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
	}
}
