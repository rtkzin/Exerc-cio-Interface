public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        system.out.println("This animal walks on"+legs+"legs");
    }
}


