package work5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MiaobiaoLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//12Сʱ��
		long time = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��
		long m =10000;
		for(long i=10;i<=100000000;i=i*10) {
			time+=m;
			m=m*10;
			Date date = new Date();
		date.setTime(time);
		System.out.println(simpleDateFormat.format(date));
		}

	}

}
