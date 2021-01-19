package src;
class Dog extends Animal {
    private int _lengthSwim;
    private int maxLength;

    Dog() {
        maxLength = 500;
    }


    void swim(int length) {
        boolean result = length <= 10;
        if (result) _lengthSwim = length;
        showResult(this,result);
        if(length <= 10)
            System.out.println("Собака проплыла: " + length + "м");
        else
            System.out.println("Собака не поплыла");
    }
    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) _length = length;
        showResult(this,result);
        if(length <= maxLength)
            System.out.println("Собака бежит " + length + "м");
        else
            System.out.println("Собака  не бежит");
    }
    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) _height = height;
        showResult(this,result);
        if(height <= 0.5)
            System.out.println("Собака прыгнула на: " + height + "м");
        else
            System.out.println("Собака не прыгнула");
    }
}