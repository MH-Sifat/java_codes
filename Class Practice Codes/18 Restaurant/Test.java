package restaurant;

// Abstract class: Food
abstract class Food {
    String name;
    String[] ingredients;
    double price;
    float calories;

    // Constructors
    public Food() {
    }

    public Food(String name, String[] ingredients, double price, float calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public float getCalories() {
        return calories;
    }

    // Abstract method
    public abstract void showDetails();
}

// Subclass: Drinks
class Drinks extends Food {
    String type;
    int sizeInLiter;

    // Constructors
    public Drinks() {
    }

    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLiter) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLiter = sizeInLiter;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int sizeInLiter) {
        this.sizeInLiter = sizeInLiter;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getSize() {
        return sizeInLiter;
    }

    // Implementing abstract method
    @Override
    public void showDetails() {
        System.out.println("Drink Name: " + name);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nPrice: $" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Type: " + type);
        System.out.println("Size: " + sizeInLiter + " L");
    }
}

// Subclass: Pizza
class Pizza extends Food {
    int sizeInInches;

    // Constructors
    public Pizza() {
    }

    public Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches) {
        super(name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    // Setters
    public void setSize(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    // Getters
    public int getSize() {
        return sizeInInches;
    }

    // Implementing abstract method
    @Override
    public void showDetails() {
        System.out.println("Pizza Name: " + name);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nPrice: $" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Size: " + sizeInInches + " inches");
    }
}

// Restaurant Class
class Restaurant {
    String restaurantName;
    Food[] foods = new Food[5]; // Array of size 5
    int foodCount = 0; // To track the number of foods added

    // Constructors
    public Restaurant() {
    }

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Setters
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Getters
    public String getRestaurantName() {
        return restaurantName;
    }

    // Add Food to Order
    public void addToOrder(Food f) {
        if (foodCount < foods.length) {
            foods[foodCount] = f;
            foodCount++;
            System.out.println(f.getName() + " added to the order.");
        } else {
            System.out.println("Cannot add more items to the order.");
        }
    }

    // Remove Food from Order
    public void removeFromOrder(Food f) {
        for (int i = 0; i < foodCount; i++) {
            if (foods[i] == f) {
                System.out.println(f.getName() + " removed from the order.");
                foods[i] = foods[foodCount - 1]; // Replace with the last item
                foods[foodCount - 1] = null; // Clear the last item
                foodCount--;
                return;
            }
        }
        System.out.println(f.getName() + " not found in the order.");
    }

    // Show Orders
    public void showOrders() {
        System.out.println("Orders in " + restaurantName + ":");
        for (int i = 0; i < foodCount; i++) {
            foods[i].showDetails();
            System.out.println();
        }
    }

    // Calculate Total Bill
    public double calculateBill() {
        double total = 0;
        for (int i = 0; i < foodCount; i++) {
            total += foods[i].getPrice();
        }
        return total;
    }
}

// Test Class
public class Test {
    public static void main(String[] args) {
        // Creating two Drinks
        String[] drinkIngredients1 = {"Water", "Sugar", "Flavor"};
        Drinks drink1 = new Drinks("Cola", drinkIngredients1, 2.99, 150, "Cold", 1);

        String[] drinkIngredients2 = {"Milk", "Chocolate"};
        Drinks drink2 = new Drinks("Chocolate Milkshake", drinkIngredients2, 4.99, 250, "Cold", 2);

        // Creating two Pizzas
        String[] pizzaIngredients1 = {"Cheese", "Tomato Sauce", "Pepperoni"};
        Pizza pizza1 = new Pizza("Pepperoni Pizza", pizzaIngredients1, 15.99, 1200, 12);

        String[] pizzaIngredients2 = {"Cheese", "Mushrooms", "Onions"};
        Pizza pizza2 = new Pizza("Veggie Pizza", pizzaIngredients2, 13.99, 1000, 10);

        // Creating a Restaurant
        Restaurant restaurant = new Restaurant("Tasty Bites");

        // Adding items to the order
        restaurant.addToOrder(drink1);
        restaurant.addToOrder(drink2);
        restaurant.addToOrder(pizza1);
        restaurant.addToOrder(pizza2);

        // Displaying orders
        restaurant.showOrders();

        // Calculating total bill
        System.out.println("Total Bill: $" + restaurant.calculateBill());

        // Removing an item
        restaurant.removeFromOrder(pizza2);
        restaurant.removeFromOrder(drink1);

        // Displaying orders again
        restaurant.showOrders();

        // Calculating total bill after removal
        System.out.println("Total Bill after removal: $" + restaurant.calculateBill());
    }
}
