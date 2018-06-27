package notebookshop;

public class NotebookShop {
    public static void main (String[] args) {

        Computer computer = new Computer("Dell", 234);
        Computer computer1 = new Computer("IBM", 135);
        Computer computer2 = new Computer("Dell", 234);
        Computer computer3 = new Computer("HP", 34);
        Computer computer4 = new Computer("Macbook", 55);

        DataStore dataStore = new DataStore();

        dataStore.addComputer(computer);
        dataStore.addComputer(computer1);
        dataStore.addComputer(computer2);
        dataStore.addComputer(computer3);
        dataStore.addComputer(computer4);

        System.out.println("All available computers:");
        for (Computer c: dataStore.getComputers())
            System.out.println(c);

        int identicalComps = dataStore.checkAvailability(computer);
        System.out.println("\n" + "Number of identical computers " + identicalComps);
    }
}
