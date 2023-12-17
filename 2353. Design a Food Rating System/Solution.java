import java.lang.Comparable;
class FoodRatings {
    private class FoodItem {
        String food; String cuisine; int rating;
        public FoodItem(String food, String cuisine, int rating) {
            this.food = food; this.cuisine = cuisine; this.rating = rating;
        } //FoodItem
        public String toString() {
            return this.food + " " + this.rating;
        } //toString
    } //FoodItem

    HashMap<String, PriorityQueue<FoodItem>> cuisinePriority;
    HashMap<String, FoodItem> foodCuisine;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cuisinePriority = new HashMap<>();
        foodCuisine = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            String cuisine = cuisines[i];
            FoodItem newFoodItem = new FoodItem(foods[i], cuisine, ratings[i]);
            foodCuisine.put(foods[i], newFoodItem);
            if (cuisinePriority.get(cuisine) == null) {
                cuisinePriority.put(cuisine, new PriorityQueue<>(new Comparator<FoodItem>() {
                    public int compare(FoodItem a, FoodItem b) {
                        int result = b.rating - a.rating;
                        //System.out.println("comparing " + a.food + ", " + b.food + ". " + result);
                        if (result != 0) return result;
                        return a.food.compareTo(b.food);
                    } //compare
                }));
            } //if
            cuisinePriority.get(cuisine).add(newFoodItem);
        } //for
    } //FoodRatings
    
    public void changeRating(String food, int newRating) {
        foodCuisine.get(food).rating = newRating;
        PriorityQueue<FoodItem> pq = cuisinePriority.get(foodCuisine.get(food).cuisine);
        //if (!pq.isEmpty()) pq.remove(pq.add());
        pq.remove(foodCuisine.get(food));
        pq.add(foodCuisine.get(food));
    } //changeRating
    
    public String highestRated(String cuisine) {
        //System.out.println("pq: " + cuisinePriority.get(cuisine));
        //System.out.println(temp.food + " " + temp.rating);
        return cuisinePriority.get(cuisine).peek().food;
    } //highestRated
} //FoodRatings

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */