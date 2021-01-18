import java.util.Random;

public class Worker {
    public static String FIO;
    public static String tel;
    public static int money;
    public static int age;
    public static String dl;
    public static final int MAX_AGE = 45;


    public Worker(String FIO, String tel, int money, int age, String dl) {
        this.FIO = FIO;
        this.tel = tel;
        this.money = money;
        this.age = age;
        this.dl = dl;
    }
    public   String getFIO() {
        return FIO;
    }

    public String gettel() {
        return tel;
    }
    public int getMoney() {
        return money;
    }
    public int getAge() {
        return age;
    }
    public String getDl() {
        return dl;
    }
    public void print(){
        System.out.println(this);
    }
}
