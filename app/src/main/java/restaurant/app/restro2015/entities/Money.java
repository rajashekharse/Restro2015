package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class Money {
    private Number amount;
    private String currency_code;

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
