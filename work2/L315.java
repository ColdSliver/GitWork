package work2;

import java.util.Scanner;

public class L315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int num0 = (int) (Math.random() * 1000);
        System.out.println("\n"+num0);
        System.out.print("��ע��Ʊ�ɣ�������λ��Ʊ����");
        int num = input.nextInt();
        int a = num/100;
        int b = num%100/10;
        int c = num%10;
        int a1 = num0/100;
        int b1 = num0%100/10;
        int c1 = num0%10;
        if (num == num0) {
            System.out.println("һ�Ƚ�������10000");
        }
        else if(( a == a1  &&  b == c1  &&  c == b1 ) ||( a == b1  &&  b == a1  &&  c == c1 ) ||( a == b1  &&  b == c1  &&  c == a1 ) ||( a == c1  &&  b == a1  &&  c == b1 ) ||( a == c1  &&  b == b1  &&  c == a1 )){
            System.out.println("���Ƚ�,����3000");
        }
        else if (a == a1 || a == b1 || a == c1 || b == a1 || b == b1 || b ==c1 
                || c == a1 || c == b1 || c ==c1 ){
            System.out.println("���Ƚ�,����1000");
        }

	}

}
