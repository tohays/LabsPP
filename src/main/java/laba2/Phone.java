package laba2;

public class Phone {
    private int Id;
    private String name;
    private String lastName;
    private String middleName;
    private int acNumber;
    private int inTalks;
    private int outTalks;

    // Конструктор класу Phone
    public Phone(int Id, String name, String lastName, String middleName, int acNumber, int inTalks, int outTalks) {
        this.Id = Id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.acNumber = acNumber;
        this.inTalks = inTalks;
        this.outTalks = outTalks;
    }

    // Геттери для отримання значень полів
    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public int getInTalks() {
        return inTalks;
    }

    public int getOutTalks() {
        return outTalks;
    }
}
