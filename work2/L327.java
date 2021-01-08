package work2;

import java.util.Scanner;

public class L327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个点的坐标");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		double distance = Math.sqrt(x * x + y * y);
		double radius = 10;
		if(distance > radius) {
		System.out.println("圆外");
		}else if(distance == radius ) {
		System.out.println("圆上");
		}else if(distance < radius){
		System.out.println("圆内");
		}

	}

}
