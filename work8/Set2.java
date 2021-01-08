package work8;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		Set<Students> stu =new TreeSet<Students>();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<10000;i++) {
            String stuData = input.nextLine();
            if(stuData.equals("exit")) {
            	break;
            }
            String[] Data =stuData.split(" ");
            //Students student =new Students(Data[0],Data[1],Data[2]);
        }
        
	}
	
	class Students{
		private String id;
		private String name;
		private String age;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age=age;
		}
	}
	private void readfile(Set<Students> setStudents) {
		File file =new File("D:/StuInfo.txt");
		FileWriter fw = null;
		Iterator<Students> it = setStudents.iterator();
		while(it.hasNext()) {
			Students StuInfo =it.next();
			//fw.write(StuInfo);
			//fw.write("\r\n");
		}
		//fw.close();
	}

}
