package work7;
import java.util.Random;
import java.util.Scanner;

public class MaxLineColum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//创建一个键盘扫描类对象
        System.out.print("请您输入维数n:");
        int n = input.nextInt();
        Random random = new Random();
        int arr[][] = new int[n][n];
        int temp;
        int h = 0;
        int l = 0;
        int hang[] =new int[n];
        int lie[] =new int[n];
        int i = 0;
        while (i < n) {
            i = 0;
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    temp = random.nextInt(2);
                    arr[j][k] = temp;
                }
            }

            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    h += arr[j][k];
                    l += arr[k][j];
                }
                hang[j] = h;
                lie[j] = l;
                h = 0;
                l = 0;
            }

            for (int j = 0; j < n; j++) 
            {
                if (hang[j]==1&&lie[j]==1)
                {
                    i++;
                }
            }
            if (i==n){
                for (int s = 0; s < n; s++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(arr[s][k]);
                    }
                    System.out.println();
                }
            }
        }
    }
}