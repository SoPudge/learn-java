import java.util.Scanner;
//三元操作符练习,注意r申明的类型不要错
public class weeks{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("今日是周几？");
        int w = s.nextInt();
        String r = w < 6 ? "工作日":"双休日";
        System.out.println(r);
    }
}
