package work8;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList book = new LinkedList();
		book.add("编号");
		book.add("名称");
		book.add("单价");
		book.add("出版社");
		System.out.println(book);
		
		TreeMap<Integer,String>books =new TreeMap<>();
		books.put(1, " 战争与和平 "+" ￥50 "+" 人民日报出版社 ");
		books.put(2, " 安娜卡列尼娜 "+" ￥30 "+" 人民日报出版社 ");
		Iterator<Integer> iterator = books.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key =iterator.next();
			System.out.println(key+books.get(key));
		}
	}

}
