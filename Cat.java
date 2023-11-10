public class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Cat goes miao ~ ");
    }

    @Override
    public String toString() {
        System.out.println("Your cat's name is " + name + " and is " + age + " years old.");
    }
}