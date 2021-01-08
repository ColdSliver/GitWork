package work9;

import java.util.Scanner;

public class T8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		
		String hex = input.nextLine();
		try {
			for (int i = 0;i<hex.length();i++) {
				char hexChar = hex.charAt(i);
				hexCharToDecimal(hexChar);
			}
			System.out.println("The dynamical value for hex number "+ hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch (HexFormatException ex) {
			ex.printStackTrace();
		}
	}
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0;i<hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue =decimalValue*16 + 10+hexChar-'A';
		}
		return decimalValue;
	}
	public static void hexCharToDecimal(char ch) throws HexFormatException{
		if(ch <= 'A' || ch > 'F')
			throw new HexFormatException("字符串不是16进制");
	}
}
