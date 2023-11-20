package Models;
import  java.util.ArrayList;
import  java.util.List;
public class FoodPreferences {
    //breakfast
    //lunch
    //dinner
    private List<String> likedFoods;
    private List<String> dislikedFoods;

    public FoodPreferences() {
        this.likedFoods = new ArrayList<>();
        this.dislikedFoods = new ArrayList<>();
    }

    public List<String> getLikedFoods() {
        return likedFoods;
    }

    public void setLikedFoods(List<String> likedFoods) {
        this.likedFoods = likedFoods;
    }

    public List<String> getDislikedFoods() {
        return dislikedFoods;
    }

    public void setDislikedFoods(List<String> dislikedFoods) {
        this.dislikedFoods = dislikedFoods;
    }

    public void likeFood(String food) {
        likedFoods.add(food);
    }

    public void dislikeFood(String food) {
        likedFoods.remove(food); // Remove from likedFoods if present
        dislikedFoods.add(food);
    }

    public boolean hasLikedFood(String food) {
        return likedFoods.contains(food);
    }

    public boolean hasDislikedFood(String food) {
        return dislikedFoods.contains(food);
    }
}
