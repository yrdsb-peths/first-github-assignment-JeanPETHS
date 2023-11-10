public class Animal {

    String name;
    int age;
    static int total = 0;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
    }

    public void sound() {
        System.out.println("Animal goes wowww!!");
    }

    public String toString() {
        System.out.println("Your animal's name is " + name + " and is " + age + " years old.");
    }
}