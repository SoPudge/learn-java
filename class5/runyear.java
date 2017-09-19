import java.util.Scanner;
//判断闰年，这里可以用长路操作符，只判断第一项，错误则不是闰年
//如果正确，则往后继续判断
public class runyear{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份：");
        int y = s.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            System.out.println(y + "是闰年");
        else
            System.out.println(y + "不是闰年");
    }
}
