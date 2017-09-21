public class orderlist{
    public static void main(String[] args){
        int [] a = new int[6];
        //System.out.println("随机数组是")
        for (int i = 0; i < 6; i++){
            a[i] = (int)(Math.random() * 100);
            System.out.println(a[i]);
        }

        System.out.println("使用冒泡法从小到大排序：");
        int [] b = new int[6];
        //int [] temp;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6;j++){
                int temp = a[i];
                if (temp < a[j]){
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
