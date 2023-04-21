

import Products.BottleOfWater;
import Products.Product;
import VendingMachines.VendingMachine;
import Products.HotDrinks;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.90, 500));
        itemMachine.addProduct(new BottleOfWater("Water", 188.00, 1500));
        itemMachine.addProduct(new HotDrinks("Tea", 80.00, 250, 80, true));
        itemMachine.addProduct(new HotDrinks("Cofee", 100.00, 200, 80, false));
        itemMachine.addProduct(new HotDrinks("Cofee", 120.90, 300, 80, true ));
        
        
        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }

        
    }
}
