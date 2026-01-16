class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPGStudent() {
        System.out.println("Roll No: " + rollNumber);  // public accessible
        System.out.println("Name: " + name);           // protected accessible
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());      // private accessed via getter
    }
}

public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Rohit", 8.5, "AI");
        pg.displayPGStudent();

        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
