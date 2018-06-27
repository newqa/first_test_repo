package university;

public class University {

    public static void main(String[] args) {

        Student student1 = new Student("Jan ", "Kowalski ", 1);
        Student student2 = new Student("Adrianna ", "Józefik ", 2);
        Student student3 = new Student("Karol ", "Król ", 3);

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();

        System.out.println("Liczba studentów " + Student.counter);
    }

}