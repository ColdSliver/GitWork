package work2;

import java.util.Random;
import java.util.Scanner;

public class L324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []num = {"Ace","1","2","3","4","5",
				"6","7","8","9","10","Jack","Queen","King"};
		String []colors = {"Diamonds","Hearts","Spades","Clubs"};
		
		Random random=new Random();//��ϵͳ��ǰʱ����Ϊ��������ɵ�����
		int c = (int)(random.nextInt(4));//����һ�����ڵ���0��С��4������
		int n = (int)(random.nextInt(14));//����һ�����ڵ���0��С��14������
		
		System.out.println("The Card you picked is " + num[n] + " of " +colors[c]+".");

	}

}
