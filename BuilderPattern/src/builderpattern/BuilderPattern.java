package builderpattern;
/**
 *
 * @author Shavinu
 */
public class BuilderPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegPizza = mealBuilder.prepareVegPizza();
      System.out.println("Veg Pizza");
      vegPizza.showItems();
      System.out.println("Total Cost: " + vegPizza.getCost());

      Meal nonVegPizza = mealBuilder.prepareNonVegPizza();
      System.out.println("\n\nNon-Veg Pizza");
      nonVegPizza.showItems();
      System.out.println("Total Cost: " + nonVegPizza.getCost());
    }    
}
