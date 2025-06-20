package examples.lezione2025_03_20;

import java.time.LocalDate;

public class Client extends Person {
    protected String contractNumber;
    protected boolean isGold;

    public Client(String name, LocalDate birthday, String address, String contractNumber, boolean isGold) {
        super(name, birthday, address);
        this.contractNumber = contractNumber;
        this.isGold = isGold;
    }

    @Override
    public String toString() {
        return "Client{" +
                "contractNumber='" + contractNumber + '\'' +
                ", isGold=" + isGold +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}