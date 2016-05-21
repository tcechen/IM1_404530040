/*
 * [A]98
 * [TA's Advise]
 * 1. �{���S����Ӥj���D, �i���b�p�a��.
 * */

import javax.swing.JOptionPane;

/**
 * This program is designed to calculate average and standard deviation of
 * user's input number.
 */
public class GradeAnalyzerTester {

	public static void main(String[] args) {
		GradeAnalyzer GA = new GradeAnalyzer();

		String inputNum = "";// user's input

		while (true) {
			inputNum = JOptionPane.showInputDialog(null, "Please enter one score.");
			if (inputNum.equalsIgnoreCase("Q")) {
				break;
			}
			try {

				GA.addGrade(Double.parseDouble(inputNum));// turn inputNum into
															// double

			} catch (Exception e) {
				System.out.println("Invalid input number!");

			}
		}
		// �ʤ֧P�_�O�_�Ӽ�<2, -2.
		GA.analyzeGrades();
		String output = GA.toString();
		System.out.println(output);// show the output
	}

}
