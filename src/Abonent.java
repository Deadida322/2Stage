public class Abonent {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private int debet;
    private int credit;
    private int timeIntercity;
    private int timeCity;


    public Abonent(int id, String surname, String name, String patronymic, String address,
                   long cardNumber, int debet, int credit, int timeIntercity, int timeCity) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debet = debet;
        this.credit = credit;
        this.timeIntercity = timeIntercity;
        this.timeCity = timeCity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCredit() {
        return credit;
    }

    public int getDebet() {
        return debet;
    }

    public int getTimeCity() {
        return timeCity;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getTimeIntercity() {
        return timeIntercity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTimeCity(int timeCity) {
        this.timeCity = timeCity;
    }

    public void setTimeIntercity(int timeIntercity) {
        this.timeIntercity = timeIntercity;
    }

    public String toString() {
        return (this.surname + " " + this.name + " " + this.patronymic + " " + this.id + " "
                + this.address + " " + this.debet + " " + this.credit + " " + this.cardNumber + " "
                + this.timeCity + " " + this.timeIntercity);
    }
}
