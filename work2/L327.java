package work2;

import java.util.Scanner;

public class L327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���������");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		double distance = Math.sqrt(x * x + y * y);
		double radius = 10;
		if(distance > radius) {
		System.out.println("Բ��");
		}else if(distance == radius ) {
		System.out.println("Բ��");
		}else if(distance < radius){
		System.out.println("Բ��");
		}

	}

}
