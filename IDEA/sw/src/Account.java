/**
 * Created by Bhajian on 5/9/2017.
 */
public class Account {
    private String namme;
    private String number;
    private Double balance;
    private Double amount;

    public Account(String namme, String number, Double balance, Double amount) {
        this.namme = namme;
        this.number = number;
        this.balance = balance;
        this.amount = amount;
    }

    public String getNamme() {
        return namme;
    }

    public String getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getAmount() {
        return amount;
    }

}
