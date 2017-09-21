import java.util.Scanner;

public class javafor{
    static long power(int x,int y){
        int result = 1;
        for (int i = 1 ; i < y ; i++){
            result *= x;
        }
        return result;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        long total = 0;
        for (int i = 1;i < day;i++){
            total = total + power(2,day-1);
        }
        System.out.println(total);
    }
}
