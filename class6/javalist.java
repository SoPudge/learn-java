public class javalist {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);

        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++) 
            System.out.println(a[i]);

        System.out.println("本练习的目的是，找出最小的一个值: ");
        int min = a[0];
        for (int j = 0; j < a.length; j++)
            if (min > a[j])
                min = a[j];
            else
                continue;
        System.out.println(min);
    }
}

