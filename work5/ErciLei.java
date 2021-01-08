package work5;
import java.util.Scanner;
public class ErciLei {
   private double a;
   private double b;
   private double c; 
   ErciLei(double a,double b,double c){   
       this.a = a;     
       this.b = b;     
       this.c = c; 
   } 
   public double getA(){    
      return a;
   } 
   public double getB(){    
      return b; 
   }  
   public double getC(){   
      return c; 
   }   
   public double getDiscriminant(){   
     double dis = b*b - 4*a*c;     
     return dis; 
   } 
   public double getRoot1(){     
      double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;     
      if (getDiscriminant()>=0)         
         return r1;     
      else         
         return 0; 
   } 
   public double getRoot2(){      
      double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;     
      if (getDiscriminant()>=0)         
         return r2;     
      else         
         return 0; 
   }    
   public static void main(String[] args) {        
      System.out.println("请输入系数a,b,c：");        
      Scanner input = new Scanner(System.in);        
      double a = input.nextDouble();        
      double b = input.nextDouble();        
      double c = input.nextDouble();        
      ErciLei F = new ErciLei(a,b,c);        
      if (F.getDiscriminant()>0)            
         System.out.println("第一个根为：" + F.getRoot1() + " 第二个根为：" + F.getRoot2());        
      else if (F.getDiscriminant()==0)            
         System.out.println(" " + F.getRoot1());        
      else            
         System.out.println("该方程无根！");    
   }
}
