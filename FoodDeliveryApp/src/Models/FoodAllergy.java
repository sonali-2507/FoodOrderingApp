package Models;
import java.util.List;
import  java.util.ArrayList;
public class FoodAllergy {
    private String allergyName;
    private List<String> triggerFoods;

    public FoodAllergy(String allergyName) {
        this.allergyName = allergyName;
        this.triggerFoods = new ArrayList<>();
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public List<String> getTriggerFoods() {
        return triggerFoods;
    }

    public void setTriggerFoods(List<String> triggerFoods) {
        this.triggerFoods = triggerFoods;
    }

    public void addTriggerFood(String food) {
        triggerFoods.add(food);
    }

    public void removeTriggerFood(String food) {
        triggerFoods.remove(food);
    }

    public boolean hasTriggerFood(String food) {
        return triggerFoods.contains(food);
    }
}
