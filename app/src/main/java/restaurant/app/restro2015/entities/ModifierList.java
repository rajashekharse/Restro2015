package restaurant.app.restro2015.entities;

/**
 * Created by DELL PC on 08-11-2015.
 */
public class ModifierList {
    private String id;
    private String name;
    private String selection_type;
    private ModifierOption[] modifier_options;

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

    public String getSelection_type() {
        return selection_type;
    }

    public void setSelection_type(String selection_type) {
        this.selection_type = selection_type;
    }

    public ModifierOption[] getModifier_options() {
        return modifier_options;
    }

    public void setModifier_options(ModifierOption[] modifier_options) {
        this.modifier_options = modifier_options;
    }
}
