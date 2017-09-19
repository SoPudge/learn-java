import java.util.Scanner;
//这里bmi类当中的clacbmi方法如果直接定义的话，在void main当中必须实例化才能调用
//如果不想再void main当中实例化再调用的话，则可以在clacbmi方法前加入static静态方法
public class bmi{
    double clacbmi(double height,double weight){
        double bmiresult = (double)(weight/(height*height));
        return bmiresult;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double height = s.nextDouble();
        double weight = s.nextDouble();
        bmi clac = new bmi();
        System.out.println(clac.clacbmi(height,weight));
    }
}
