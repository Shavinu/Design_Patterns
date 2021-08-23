package builderpattern;
/**
 *
 * @author Shavinu
 */
public abstract class Pizza implements Item{
   @Override
   public Packing packing() {
      return new Package();
   }

   @Override
   public abstract float price();
}
