package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class ModifierOption {
    private String id;
    private String name;
    private Money price_money;
    private Boolean on_by_default;
    private Number ordinal;
    private String modifier_list_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice_money() {
        return price_money;
    }

    public void setPrice_money(Money price_money) {
        this.price_money = price_money;
    }

    public Boolean getOn_by_default() {
        return on_by_default;
    }

    public void setOn_by_default(Boolean on_by_default) {
        this.on_by_default = on_by_default;
    }

    public Number getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Number ordinal) {
        this.ordinal = ordinal;
    }

    public String getModifier_list_id() {
        return modifier_list_id;
    }

    public void setModifier_list_id(String modifier_list_id) {
        this.modifier_list_id = modifier_list_id;
    }
}
