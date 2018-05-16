package university;

public class Student {

    private String name;
    private String surname;
    private int indexNumber;

    public static int counter = 0;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public Student printStudent()
    {
        System.out.println(getName() + getSurname() + getIndexNumber());
        return this;
    }

}
