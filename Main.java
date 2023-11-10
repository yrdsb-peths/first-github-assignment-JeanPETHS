import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Which animal do you want? Type 1 for Dog, 2 for Cat.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Animal one;
        switch(num){
            case 1: {
                one = new Dog("Mark", 3);
                break;
            }
            case 2: {
                one = new Cat("Lily", 3);
                break;
            }
            default: {
                one = new Animal("Random", 3);
            }
        }

        System.out.println(one);
        one.sound();
        System.out.println("What name do you want your animal to have?");
        String name = sc.nextLine;
        one.name = name;
        System.out.println(one);
    }
}