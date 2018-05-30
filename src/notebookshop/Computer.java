package notebookshop;

import java.util.Objects;

public class Computer {

    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return model == computer.model &&
                Objects.equals(producer, computer.producer);
    }

    @Override
    public String toString() {
        return "Computer " +
                "producer = '" + producer + '\'' +
                ", model = " + model +
                ';';
    }
}
