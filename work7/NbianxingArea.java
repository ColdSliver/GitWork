package work7;
import java.util.*;
class point{
	public int x;
	public int y;
	point(){
		this.x=0;
		this.y=0;
	}
}
public class NbianxingArea {
	    public static float caculate(point v[],int count)
	    {
	    	int i=0;
	    	float temp=0;
	    	for(;i<count-1;i++)
	    	{
	    		temp+=(v[i].x-v[i+1].x)*(v[i].y+v[i+1].y);
	    	}
	    	temp+=(v[i].x-v[0].x)*(v[i].y+v[0].y);
	    	return temp/2;
	    }
        public static void main(String args[]) 
        {
        	point[] v=new point[100];
        	int count=0;
        	Scanner in = new Scanner(System.in);
        	for(int i=0;i<100;i++)
        	{
        		v[i]= new point();
        	}
        	System.out.println("͹����ζ���");
        	count=in.nextInt();
        	for(int i=0;i<count;i++)
        	{
        		System.out.println("��"+i+"������ĺ�����:");
        		v[i].x = in.nextInt();
        		System.out.println("��"+i+"�������������:");
        		v[i].y = in.nextInt();
        	}
        	System.out.println("���������ǣ�"+caculate(v,count));
        }
}

