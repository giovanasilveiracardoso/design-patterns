package enums;

public enum Bandeira {

    VISA(0),
    MASTERCARD(1),
    ELO(2);

    private int id;

    Bandeira(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
