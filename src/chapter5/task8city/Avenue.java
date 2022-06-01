package chapter5.task8city;

public class Avenue {
    private final String name;
    private final int number;

    public Avenue(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                name + ' ' +
                        number;
    }

    public int getNumber() {
        return number;
    }
}
