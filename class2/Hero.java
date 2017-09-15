public class Hero{
    String name;
    float hp;
    float armor = 100;
    float moveSpeed;

    //方法
    //无返回值的方法用void开头，有返回值的用返回值类型开头
    void keng(){
        System.out.println("坑死队友");
    }

    float getArmor(){
        return armor;
    }

    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    //练习新方法
    void legenderay(){
        System.out.println("超神");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){
        hp = hp +blood
    }

    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println(garen.getArmor());
    }
}
