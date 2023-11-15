public class MainPerson {
    public static void main(String[] args){
        Person one = new Person("Jean", "Pan", 16);
        Person two = new Student("first", "second", 13, 2.3, 56);

        System.out.println(one);
        System.out.println(two);

        two.setName("Lily", "Wu");
    }
}