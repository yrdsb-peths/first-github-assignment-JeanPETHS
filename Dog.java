public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound(){
        System.out.println("Dog goes wongwong");
    }

    @Override
    public String toString() {
        System.out.println("Your dog's name is " + name + " and is " + age + " years old.");
    }
}