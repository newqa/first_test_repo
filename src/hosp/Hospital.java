package hosp;

public class Hospital {

    public static final int MAX_PATIENTS_NUM = 10;

    // dlaczego tu zadeklarowana musi być tablica; czy gdyby nie było konieczności sprawdzania indeksu mogłaby być zainicjalizowana?

        private Patient[] patients;
        private int registeredPatiens;

        // konstruktor w którym inicjalizuje się tablice i ustanawia licznik dla zarejestrowanych pacjentów. Dlaczego? konstruktory służące do liczenia i tworzenia tablic!
    // użyty obiekt Patient z klasy patient


        public Hospital() {
            patients = new Patient[MAX_PATIENTS_NUM];
            registeredPatiens = 0;
        }


        // co znaczy  patients[regPatiens] = patient; przy wywołaniu addPatient dodwanany jest obiekt (klasa patient) i indeks zwiększany?;

        public void addPatient(Patient patient) {
            if (registeredPatiens < MAX_PATIENTS_NUM) {
                patients[registeredPatiens] = patient;
                registeredPatiens++;
            } else {
                System.out.println("Zapisano maksymalną liczbę pacjentów");
            }
        }

        public void printPatients() {
            for(int i=0; i<registeredPatiens; i++) {
                System.out.println(patients[i].getName() + " " + patients[i].getSurname() + " "
                        + patients[i].getPesel());
            }
        }
    }


