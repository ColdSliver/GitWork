package work2;

import java.util.Random;
import java.util.Scanner;

public class L324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []num = {"Ace","1","2","3","4","5",
				"6","7","8","9","10","Jack","Queen","King"};
		String []colors = {"Diamonds","Hearts","Spades","Clubs"};
		
		Random random=new Random();//以系统当前时间作为随机数生成的种子
		int c = (int)(random.nextInt(4));//返回一个大于等于0且小于4的整数
		int n = (int)(random.nextInt(14));//返回一个大于等于0且小于14的整数
		
		System.out.println("The Card you picked is " + num[n] + " of " +colors[c]+".");

	}

}
