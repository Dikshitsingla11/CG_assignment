class Course {
    String courseName;
    int duration; // in months
    double fee;

    static String instituteName = "CG Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("----------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Data Science", 5, 40000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Capgemini Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
