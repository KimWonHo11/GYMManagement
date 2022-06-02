package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class Menumanager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HoGYMmanager hoGYM = getObject("hoGYM.ser");
		if(hoGYM == null) {
			hoGYM = new HoGYMmanager(input);
		}
		
		WindowFrame frame = new WindowFrame(hoGYM);
		selectMenu(input, hoGYM);
		putObject(hoGYM, "hoGYM.ser");
	}
	
	public static void selectMenu(Scanner input, HoGYMmanager hoGYM) { //회원을 입력, 삭제, 편집, 출력의 보기를 보여주는 함수
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
	
				switch (num) {
				case 1:
					hoGYM.Addm();
					logger.log("add a member");
					break;
				case 2:
					hoGYM.Delm();
					logger.log("delete a member");
					break;
				case 3:
					hoGYM.Edim();
					logger.log("edit a member");
					break;
				case 4:
					hoGYM.Viem();
					logger.log("view a list of member");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) { //1~5가 아닌 다른 수나 문자를 입력하면 예외처리해주는 부분
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
	
	public static HoGYMmanager getObject(String fileName) {
		HoGYMmanager hoGYM = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			hoGYM =(HoGYMmanager) in.readObject();
			
			in.close();
			file.close();
			
			 
		} catch (FileNotFoundException e) {
			return hoGYM;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hoGYM;
		
	}
	
	public static void putObject(HoGYMmanager hoGYM, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(hoGYM);
			
			out.close();
			file.close();
			
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
