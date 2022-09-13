import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
     static boolean isArmstrong(int n)
     {
         int sum = 0;
         int temp = n;
         while(n > 0)
         {
            int r = n % 10;
             n = n /10;
             sum = sum + r*r*r;
         }
         return sum == temp;
     }
}
