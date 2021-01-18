public class Main {
    public static void main(String[] args) {

        Worker One = new Worker("Inokntiev Pavel Sergeevich","999900",
                20000,43,"Director");
        System.out.println(One.getFIO());
        System.out.println(One.getAge());

        Worker[] arraywork = new Worker[5];
        arraywork[0] = new Worker("Olegov Mihail Pavlovich","924995",30000
        ,33,"manager");
        arraywork[1] = new Worker("Olegov Mihail Pavlovich","924995",20000
                ,22,"manager");
        arraywork[2] = new Worker("Olegov Mihail Pavlovich","924995",30000
                ,47,"manager");
        arraywork[3] = new Worker("Olegov Mihail Pavlovich","924995",30000
                ,39,"manager");
        arraywork[4] = new Worker("Olegov Mihail Pavlovich","924995",30000
                ,72,"manager");
        for (int i=0; i < arraywork.length; i++)
            if (arraywork[i].age < 40) arraywork[i].print();


        };



    }


