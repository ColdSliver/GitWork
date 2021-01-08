package work3;

import java.util.Scanner;

public class L73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			i++;
			int []num =new int[100];
			num[i]=input.nextInt();
			
			int m=1;
			for(int j=0;j<i;j++) {
				if(num[i]==num[j])
					m++;
			}
			System.out.println(num[i] +"; occurs ;"+ m +"; time;");
		}

	}

}
