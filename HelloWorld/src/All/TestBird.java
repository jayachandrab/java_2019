package All;

class Bird extends Animal {

    void move() {
        System.out.println("Moves by flying.");
    }
    // Dynamic polymorphism
    void eat() {
        System.out.println("Eats birdfood.");
    }

    @Override
    void label(){
    System.out.println("Bird label");
    }

    @Override
    public void sound() {
        System.out.println("kuhoo hoo");
    }
// static polymorphism
    public void fly() {
        System.out.println("The bird is flying.");
    }
    public void fly(int height) {
        System.out.println("The bird is flying " + height + " feet high.");
    }
    public void fly(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " feet high.");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("Moves by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }

    @Override
    public void sound() {
        System.out.println("finsh sound");
    }
}

class TestBird {

    public static void main(String[] args)
    {
        Animal myBird = new Bird();

        myBird.label();
        myBird.move();
        myBird.eat();

        Animal myFish = new Fish();

        myFish.label();
        myFish.move();
        myFish.eat();


    }
}

