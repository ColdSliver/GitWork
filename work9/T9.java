package work9;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("输入一个二进制数:");
        String s = input.nextLine();
        try {
        	isBinaryFormatException(s);
        	System.out.println(bin2Dec(s));
        }
        catch (BinaryFormatException ex) {
			ex.printStackTrace();
		}
        
	}
	private static int bin2Dec(String binaryString) {
		int bS =Integer.parseInt(binaryString);
		int sum=0,p=0;
		while(bS!=0)
		{
			sum+=(bS%10)*Math.pow(2, p);
			bS/=10;
			p++;
		}
		return sum;
	}
	public static void isBinaryFormatException(String binaryString) throws BinaryFormatException{
		for(int i=0;i<binaryString.length();i++)
		{
			if(binaryString.charAt(i)!='0'&&binaryString.charAt(i)!='1')
				throw new BinaryFormatException("字符串不是二进制");
			break;
		}
	}
}
