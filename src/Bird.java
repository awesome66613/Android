package src;
class Bird extends Animal {

    @Override
    void run(int length) {
        boolean result = length <= 5;
        if (result) _length = length;
        showResult(this,result);
        if(length <= 5)
            System.out.println("Птица бежит " + length + "м");
        else
            System.out.println("Птица не бежит");
    }
    @Override
    void jump(double height) {
        boolean result = height <= 0.2;
        if (result) _height = height;
        showResult(this,result);
        if(height <= 0.2)
            System.out.println("Птица прыгнула на: " + height + "м");
        else
            System.out.println("Птица не прыгнула");
    }
}

