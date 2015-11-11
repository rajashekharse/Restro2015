package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class Item {
    private String id;
    private String name;
    private String description;
    private String type;
    private String abbreviation;
    private String color;
    private String visibility;
    private Boolean available_online;
    private ItemImage master_image;
    private Category category;
    private ItemVariation[] variations;
    private ModifierList[] modifier_lists;
    private Fee[] fees;
    private Boolean taxable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Boolean getAvailable_online() {
        return available_online;
    }

    public void setAvailable_online(Boolean available_online) {
        this.available_online = available_online;
    }

    public ItemImage getMaster_image() {
        return master_image;
    }

    public void setMaster_image(ItemImage master_image) {
        this.master_image = master_image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ItemVariation[] getVariations() {
        return variations;
    }

    public void setVariations(ItemVariation[] variations) {
        this.variations = variations;
    }

    public ModifierList[] getModifier_lists() {
        return modifier_lists;
    }

    public void setModifier_lists(ModifierList[] modifier_lists) {
        this.modifier_lists = modifier_lists;
    }

    public Fee[] getFees() {
        return fees;
    }

    public void setFees(Fee[] fees) {
        this.fees = fees;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }
}
