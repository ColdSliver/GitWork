package work2;

import java.util.Scanner;

public class L319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("输入三角形三边长：");
			Scanner scan=new Scanner(System.in);
			double a=scan.nextDouble();
			double b=scan.nextDouble();
			double c=scan.nextDouble();
			if(a+b<=c||a+c<=b||b+c<=a)
			{
				System.out.println("不能构成三角形！请重新输入！");
			}
			else{
				System.out.printf("周长为：",a+b+c);
			}
		}

	}

