package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class Fee {
    private String id;
    private String name;
    private String rate;
    private String calculation_phase;
    private String adjustment_type;
    private Boolean applies_to_custom_amounts;
    private Boolean enabled;
    private String inclusion_type;
    private String type;

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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getCalculation_phase() {
        return calculation_phase;
    }

    public void setCalculation_phase(String calculation_phase) {
        this.calculation_phase = calculation_phase;
    }

    public String getAdjustment_type() {
        return adjustment_type;
    }

    public void setAdjustment_type(String adjustment_type) {
        this.adjustment_type = adjustment_type;
    }

    public Boolean getApplies_to_custom_amounts() {
        return applies_to_custom_amounts;
    }

    public void setApplies_to_custom_amounts(Boolean applies_to_custom_amounts) {
        this.applies_to_custom_amounts = applies_to_custom_amounts;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getInclusion_type() {
        return inclusion_type;
    }

    public void setInclusion_type(String inclusion_type) {
        this.inclusion_type = inclusion_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
