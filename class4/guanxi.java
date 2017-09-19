import java.util.Scanner;
//关系操作符的练习
public class guanxi{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数： " + a);
        int b = s.nextInt();
        System.out.println("第二个整数： " + b);
        System.out.println("比较" + a + ">" + b + ": " + (a>b));
        System.out.println("比较" + a + ">=" + b + ": " + (a>=b));
        System.out.println("比较" + a + "<" + b + ": " + (a<b));
        System.out.println("比较" + a + "<=" + b + ": " + (a<=b));
        System.out.println("比较" + a + "==" + b + ": " + (a==b));
        System.out.println("比较" + a + "!=" + b + ": " + (a!=b));
    }
}
