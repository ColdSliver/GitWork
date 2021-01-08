package work7;
import java.util.ArrayList;
import java.util.HashSet;
public class DeleteSame{    
	public static void main(String[] args){
        ArrayList<String> listSame = new ArrayList<String>();
        listSame.add("pods");    
        listSame.add("pods");    
        listSame.add("pod");    
        listSame.add("poi");
        listSame.add("ssd");    
        listSame.add("dss");    
        listSame.add("poi");    
        System.out.print("重复的列表:");
        System.out.println(listSame);      
        HashSet<String> set = new HashSet<String>(listSame);       
        ArrayList<String> listOnly = new ArrayList<String>(set);      
        System.out.print("去重后的列表 :");
        System.out.println(listOnly);
    }
}