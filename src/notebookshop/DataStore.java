package notebookshop;

import java.util.Arrays;

public class DataStore {
    public static final int MAX_COMP_NUM = 100;

    private Computer[] computers;
    public int computersInStore;

    public DataStore() {
        computers = new Computer[MAX_COMP_NUM];
        computersInStore = 0;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersInStore];
        for (int i = 0; i < computersInStore; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void addComputer(Computer computer) {
        if (computersInStore < MAX_COMP_NUM) {
            computers[computersInStore] = computer;
            computersInStore++;
        } else {
            System.out.println("You reached the maximum number of computers (100) that can bo stored in the warehouse");
        }
    }

    public int checkAvailability(Computer checkIfIdenticalComp) {
        int count = 0;
        for (int i = 0; i < computersInStore; i++) {
            if (checkIfIdenticalComp.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }
}




