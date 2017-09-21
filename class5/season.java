import java.util.Scanner;

public class season{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);        
        System.out.println("请输入月份：");
        int mouth = s.nextInt();
        String result;
        switch (mouth) {
            case 1:
            case 2:
            case 3:
                result = "春天";
                break;
            case 4:
            case 5:
            case 6:
                result = "夏天";
                break;
            case 7:
            case 8:
            case 9:
                result = "秋天";
                break;
            case 10:
            case 11:
            case 12:
                result = "冬天";
                break;
        }
        System.out.println(result);
    }
}
