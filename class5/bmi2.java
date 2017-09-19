import java.util.Scanner;
//这里bmi类当中的clacbmi方法如果直接定义的话，在void main当中必须实例化才能调用
//如果不想再void main当中实例化再调用的话，则可以在clacbmi方法前加入static静态方法
public class bmi2{
    double clacbmi(double height,double weight){
        double bmiresult = (double)(weight/(height*height));
        return bmiresult;
    }

    String statu(double bminum){
        final String result;
        if (bminum < 18.5)
            result = "体重过轻";
        else if (bminum >= 18.5 & bminum < 24)
            result = "正常范围";
        else if (bminum >= 24 & bminum < 27)
            result = "体重过重";
        else if (bminum >= 27 & bminum < 30)
            result = "轻度肥胖";
        else if (bminum >= 30 & bminum < 35)
            result = "中度肥胖";
        else
            result = "重度肥胖";
        return result;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        bmi2 clac = new bmi2();

        System.out.println("请输入您的身高，单位m：");
        double height = s.nextDouble();
        System.out.println("请输入您的体重，单位kg：");
        double weight = s.nextDouble();
        double bminum = clac.clacbmi(height,weight);
        System.out.println("当前的bmi是：" + bminum);
        System.out.println("当前的身体状态是：" + clac.statu(bminum));
    }
}
