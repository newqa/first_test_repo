package com.company.hospital;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Hospital extends Patient {

    private static final ADD_PATIENT = 1;
    private static final PRINT_LIST_OF_PATIEINTS = 2;

    List<Patient> listOfPatients = new ArrayList<Patient>();

    public Hospital () {
    }

    public Hospital(String name, String surname, long pesel) {
        super.setName(name);
        super.setSurname(surname);
        super.setPesel(pesel);
        }


    public List<Patient> chooseProgramOption(int input, Scanner read) {
        switch (input) {
            case ADD_PATIENT:
                System.out.println("Patient's name: ");
                String name = read.next();
                System.out.println("Patient's surname: ");
                String surname = read.next();
                System.out.println("Patient's PESEL: ");
                long pesel = read.nextLong();
                Patient patient = new Patient(name,surname,pesel);
                listOfPatients.add(patient);
                System.out.println("Patients list:" );
                for (Patient: patient1 : listOfPatients) {
                    System.out.println(patient.getName()+ "" + patient1.getSurname() + "" + patient1.getPesel());
                }
                break;

            case PRINT_LIST_OF_PATIEINTS:


    }


            //for (int numberOfPatients = 0; numberOfPatients<10; )

            break;
        case 2:
            hospital.printPatient();
        case 0:
            System.out.println("Closing the application");
            break;
    }

    public Hospital addPatient() {

        System.out.println("Patient name ");
        setName(patientName.nextLine());

        System.out.println("Patient surnmae ");
        setSurname(patientSurname.nextLine());

        System.out.println("Pesel ");
        setPesel(patientPesel.nextInt());
        return this;
    }

    public void printPatient() {
        System.out.println(super.getName() + super.getSurname() + super.getPesel() );
    }

}
