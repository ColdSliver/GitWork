package work5;
import java.util.Random;
public class RandomLei {
    public static int GetRandom(int num1,int num2){
    	
    	int s=num1+(int)(Math.random()*(num2-num1));
    	return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(1000);
		for(int i=1;i<=50;i++)
		    System.out.println("第"+i+"个随机数为"+r.nextInt(100));
	}

}
