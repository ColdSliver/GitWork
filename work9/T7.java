package work9;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        
        System.out.println("����һ����������:");
        String s = input.nextLine();
        try {
            System.out.println(bin2Dec(s));
        }
        catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}
	private static int bin2Dec(String binaryString) {
		for(int i=0;i<binaryString.length();i++)
		{
			if(binaryString.charAt(i)!='0'&&binaryString.charAt(i)!='1')
				throw new NumberFormatException("�ַ������Ƕ�����");
			else
				continue;
		}
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

}
