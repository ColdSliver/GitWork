package work8;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList book = new LinkedList();
		book.add("���");
		book.add("����");
		book.add("����");
		book.add("������");
		System.out.println(book);
		
		TreeMap<Integer,String>books =new TreeMap<>();
		books.put(1, " ս�����ƽ "+" ��50 "+" �����ձ������� ");
		books.put(2, " ���ȿ������� "+" ��30 "+" �����ձ������� ");
		Iterator<Integer> iterator = books.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key =iterator.next();
			System.out.println(key+books.get(key));
		}
	}

}
