public class convert{
    public static void main(String[] args){
        //不同类型的转换
        char c = 'A';
        short s = 80;
        c = (char)s;//将s转换为字符
        System.out.println(c);
        //低精度向高精度转换
        long l = 50;
        int i = 50;
        l = i;//可以直接转换
        //高精度向低精度转换
        byte b = 5;
        int i1 = 10;
        int i2 = 300;
        b = (byte)i1;//强制转换
        System.out.println(b);
        b = (byte)i2;
        System.out.println(b);
    }
}
