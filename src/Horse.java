package src;
class Horse extends Animal {
    private int _lengthSwim;
    private int maxLength = 500;

    void swim(int length) {
        boolean result = length <= 100;
        if (result) _lengthSwim = length;
        showResult(this,result);
        if(length <= 100)
            System.out.println("Лошадь проплыла: " + length + "м");
        else
            System.out.println("Лошадь не поплыла");
    }
    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) _length = length;
        showResult(this,result);
        if(length <= maxLength)
            System.out.println("Лошадь бежит " + length + "м");
        else
            System.out.println("Лошадь не бежит");
    }
    @Override
    void jump(double height) {
        boolean result = height <= 3;
        if (result) _height = height;
        showResult(this,result);
        if(height <= 3)
            System.out.println("Лошадь прыгнула на: " + height + "м");
        else
            System.out.println("Лошадь не прыгнула");
    }
}
