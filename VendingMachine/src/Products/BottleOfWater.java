package Products;

public class BottleOfWater extends Product{

    private int volume;

    public BottleOfWater(String name, double price, int volume)
    {
        super(name, price);
        this.volume = volume;
    }
    /**
     * возвращаем объем
     * @return
     */
    public int getVolume()
    {
        return volume;
    }
    /**
     * устанавливаем объем
     * @param volume
     */

    public void setVolume(int volume)
    {
        this.volume = volume;
    }
      /**
      * переопределение вывода продукта
      */
      @Override
      public String toString()
      {
         return "Product{"+
         "name="+super.getName() + '\'' +
         ",cost=" + super.getPrice() + 
         ",volume=" + volume+ '}';
      }
    
}
