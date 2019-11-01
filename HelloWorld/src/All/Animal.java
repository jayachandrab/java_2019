package All;
interface Animals {

    public void sound();
}

public abstract class Animal implements Animals
{
    // abstract methods
    abstract void move();
    abstract void eat();

    // concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}


