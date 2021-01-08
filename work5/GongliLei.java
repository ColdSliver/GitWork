package work5;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class GongliLei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date=new GregorianCalendar();
        Scanner in=new Scanner(System.in);
        long millis=in.nextLong();
        date.setTimeInMillis(millis);
        System.out.println(date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH))+"-"+date.get(Calendar.DAY_OF_MONTH));

	}

}
