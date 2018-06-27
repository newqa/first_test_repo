package hosp;


public class Patient {

    private String name;
    private String surname;
    private String pesel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Patient(){

    }

    public Patient(String name, String surname, String pesel) {
        setName(name);
        setSurname(surname);
        setPesel(pesel);
    }
}
