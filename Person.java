public class Person {

    private String firstName;
    private String lastName;
    private int age;
    public static int numPersons = 0;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        numPersons++;
    }


    public String getName() {
        return "Name: " + firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(getName());
    }


    public int getAge() {
        return "Age: " + age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(getAge());
    }


    public String toString() {
        return getName() + \n + getAge();
    }

}