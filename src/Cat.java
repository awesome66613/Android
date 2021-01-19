package src;
class Cat extends Animal {
    private int maxLength;

    Cat() {
        maxLength = 200;
    }


    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result) _length = length;
            showResult(this, result);
        if(length <= maxLength)
        System.out.println("Кошка бежит " + length + "м");
        else
            System.out.println("Кошка  не бежит");

    }

    @Override
    void jump(double height) {
        boolean result = height <= 2;
        if (result) _height = height;
        showResult(this, result);
        if(height <= 2)
            System.out.println("Кошка пригнула на: " + height + "м");
        else
            System.out.println("Кошка не прыгнула");
    }
}
