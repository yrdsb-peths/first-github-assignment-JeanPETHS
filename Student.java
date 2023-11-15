public class Student extends Person {

    private double GPA;
    private int volunteerHours;

    Student(String firstName, String lastName, int age, double GPA, int volunteerHours) {
        super(firstName, lastName, age);
        this.GPA = GPA;
        this.volunteerHours = volunteerHours;
    }


    public double getGPA() {
        return "GPA: " + GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
        System.out.println(getGPA());
    }


    public int getVolHours() {
        return "Volunteer Hours: " + volunteerHours;
    }

    public void setVolHours(int volunteerHours) {
        this.volunteerHours = volunteerHours;
        System.out.println(getVolHours());
    }


    @Override
    public String toString() {
        return getName() + \n + getAge() + \n + getGPA() + \n + getVolHours();
    }

}
