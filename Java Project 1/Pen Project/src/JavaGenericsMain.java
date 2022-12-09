public class JavaGenericsMain {
    public static void main(String[] args) {
        JavaGenerics<Integer> thingToPrint = new JavaGenerics<>(24);

        Dog billy = new Dog("Billy", "Chihuahua", 3);

        System.out.println(billy.age);
        billy.grow();
        System.out.println(billy.age);

        thingToPrint.printOut();
    }
}

abstract class Animal implements LivingThing {
    protected int age;
    protected String name;
    protected String sex;
    protected String breed;

    @Override
    public void grow() {
        // TODO Auto-generated method stub
        ++this.age; 
    }

    abstract void makeSound();

}

interface LivingThing {

    public void grow(); 
}