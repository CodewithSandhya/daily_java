class Student {
    // Instance variables
    String name;
    int age;
    String course;

    // Default Constructor
    public Student() {
        name = "Unknown";
        age = 0;
        course = "None";
    }

    // Parameterized Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.display();

        System.out.println();  // Blank line for better readability

        // Using parameterized constructor
        Student student2 = new Student("Alice", 21, "Computer Science");
        student2.display();
    }
}
