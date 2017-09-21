import java.util.Scanner;

public class dowhile{
    public static void main (String[] args) {
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        int result = 1;
        while(i < num){
            result = result * num;
            num--;
        }
        System.out.println(result);
    }
}
