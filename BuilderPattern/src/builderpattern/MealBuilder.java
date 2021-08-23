package builderpattern;
/**
 *
 * @author Shavinu
 */
public class MealBuilder {
      public Meal prepareVegPizza (){
      Meal meal = new Meal();
      meal.addItem(new VegPizza());
      meal.addItem(new Cocacola());
      return meal;
   }   

   public Meal prepareNonVegPizza (){
      Meal meal = new Meal();
      meal.addItem(new ChickenPizza());
      meal.addItem(new Creamsoda());
      return meal;
   }
}
