package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class ItemVariation {
    private String id;
    private String name;
    private String item_id;
    private Number ordinal;
    private String pricing_type;
    private Money price_money;
    private String sku;
    private Boolean track_inventory;
    private String inventory_alert_type;
    private Number inventory_alert_threshold;
    private String user_data;

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

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public Number getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Number ordinal) {
        this.ordinal = ordinal;
    }

    public String getPricing_type() {
        return pricing_type;
    }

    public void setPricing_type(String pricing_type) {
        this.pricing_type = pricing_type;
    }

    public Money getPrice_money() {
        return price_money;
    }

    public void setPrice_money(Money price_money) {
        this.price_money = price_money;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Boolean getTrack_inventory() {
        return track_inventory;
    }

    public void setTrack_inventory(Boolean track_inventory) {
        this.track_inventory = track_inventory;
    }

    public String getInventory_alert_type() {
        return inventory_alert_type;
    }

    public void setInventory_alert_type(String inventory_alert_type) {
        this.inventory_alert_type = inventory_alert_type;
    }

    public Number getInventory_alert_threshold() {
        return inventory_alert_threshold;
    }

    public void setInventory_alert_threshold(Number inventory_alert_threshold) {
        this.inventory_alert_threshold = inventory_alert_threshold;
    }

    public String getUser_data() {
        return user_data;
    }

    public void setUser_data(String user_data) {
        this.user_data = user_data;
    }
}
