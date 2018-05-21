
package hosp;

import java.util.Scanner;

public class HospitalApp {

    public static final int ADD_PATIENT = 1;
    public static final int DISPLAY_PATIENTS = 2;
    public static final int EXIT = 0;

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        Scanner scanOption = new Scanner(System.in);
        // dlaczego trzeba tu zadeklarować zmienną (dowolną??) bo to pętla i musi mieć licznik? dlaczego -1 lub inny
        int input = -1;

        while (input != EXIT) {

            System.out.println("Choose a number: 1 - to add a patient, 2 - to display patients, 0 - to exit the program");
            input = scanOption.nextInt();

            switch (input) {
                case ADD_PATIENT:
                    Patient patient = new Patient();
                    System.out.println("First name: ");
                    patient.setName(scanner.nextLine());
                    System.out.println("Surname: ");
                    patient.setSurname(scanner.nextLine());
                    System.out.println("Pesel: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case DISPLAY_PATIENTS:
                    hospital.printPatients();
                    break;
                case EXIT:
                    System.out.println("Closing the prorgam");
                    break;
                default:
                    System.out.println("Choose only 1, 2 or 0");
            }
        }
        scanner.close();
    }
}

