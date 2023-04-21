package VendingMachines;


import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private int volume;
    private List<Product> products;
    private List<String> worklog;
	//public Product[] getProdAll;



    public VendingMachine(int volume)
    {
        this.volume = volume;
        products = new ArrayList<Product>();
        worklog = new ArrayList<String>();
    }


    public void addProduct(Product prod)
    {
       products.add(prod);
    }


    public void addSales(String  line)
    {
       worklog.add(line);
    }

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name) )
            {
                return prod;
            }
        }
        return null;//если такого продукта нет
    }
/**
 * метод, чтобы нам выдать все продукты
 * @return
 */
    
     public List<Product> getProdAll()
     {
        return products;
     }

}

