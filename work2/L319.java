package work2;

import java.util.Scanner;

public class L319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("�������������߳���");
			Scanner scan=new Scanner(System.in);
			double a=scan.nextDouble();
			double b=scan.nextDouble();
			double c=scan.nextDouble();
			if(a+b<=c||a+c<=b||b+c<=a)
			{
				System.out.println("���ܹ��������Σ����������룡");
			}
			else{
				System.out.printf("�ܳ�Ϊ��",a+b+c);
			}
		}

	}

