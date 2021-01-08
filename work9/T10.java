package work9;

import java.util.ArrayList;
import java.util.List;

public class T10 {
	public static void main(String[] args){
    	List list=new ArrayList();
    	try {
			while(true) {
				list.add("JVM will out of memory soon");
			}
		} catch (OutOfMemoryError ex) {
			System.out.println("JVM out of memory");
		}
    }
}
