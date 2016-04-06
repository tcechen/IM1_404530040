
/*
 * [A]103
 * [TA's Advise]
 * 1.�ܦ��쪺�g�k, while�̭��h��user input���ˬd�O�ӫܤ�������k, ���L��ĳ�i�H���X��������ܵ{���פ�, �γ\�ˮֱ���i�H�b��T�@��, �n���ˬd�O�_<=0.
 * 2.Math.floorDiv()�O�ӫܴΪ���{, �۫H�O�A�ۤv�����ǲߪ����G, �o�����������A�B�~������! �g�o�ܦn!
 * 3.Good JOB! ���L��X�榡�O�o�̷ӧ@�~�n�D��!
 * */

/**
* This program is to calculate the Easter Sunday in the specified year
*/
import java.util.*;

public class EasterTester {

	public static void main(String[] args) {
		// HW requirements
		System.out.println(Easter.CalculateEaster(2001));
		System.out.println(Easter.CalculateEaster(2012));

		boolean flag = true;// if flag = false end of output

		// users input
		while (flag != false) {
			System.out.println("Please enter a year to calculate Easter Sunday.");
			Scanner sc = new Scanner(System.in);

			// check if user enter the number
			while (!sc.hasNextInt()) {
				System.out.println("Please enter a year.(Do not enter any letter)");
				sc.next();
			}
			int year = sc.nextInt();

			System.out.println(Easter.CalculateEaster(year));
			
			
			//NICE PROFORMANCE! +1 
			System.out.println("Continuous?(Yes/No)");
			String input = sc.next();

			if (input.equals("no") || input.equals("No")) {
				flag = false;
				sc.close();
			}
			//How about exception? continue or break?

		}
		System.out.println("End of output!");

	}

}
