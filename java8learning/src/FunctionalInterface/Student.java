package FunctionalInterface;

public class Student {
    int rollnumber;
    String name;
    String branch;

    public Student(int rollnumber, String name, String branch) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student [rollnumber=" + rollnumber + ", name=" + name + ", branch=" + branch + "]";
    }
}
