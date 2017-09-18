public class finalclass{
    public void method1(final int i){
        //i = 6;
        //final后的值只能赋值一次，当final在参数里面的时候
        //后面调用这个方法，实际上调用的时候就赋值了一次，所以后面不能再赋值
        System.out.println(i);
    }
    public static void main(String[] args){
        new finalclass().method1(5);
    }
}
