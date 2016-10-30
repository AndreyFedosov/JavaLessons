package lesson10.homework;

public class Exercise2 extends Exception {
    private String string;

    public Exercise2(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
