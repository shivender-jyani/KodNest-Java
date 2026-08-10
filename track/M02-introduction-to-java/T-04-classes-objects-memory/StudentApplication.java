
class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "Raja";
        s1.height = 5.5;
        s1.run();
        s1.sleeping();
    }
}

class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleeping() {
        System.out.println("sleeping");
    }
}
