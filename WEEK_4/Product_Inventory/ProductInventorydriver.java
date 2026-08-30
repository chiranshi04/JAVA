public class ProductInventorydriver 
{
    public static void main(String[] args) throws Exception 
  {
        ProductInventory p1 = new ProductInventory();
        ProductInventory p2 = new ProductInventory("FirstOne","056",5,25);
        System.out.println(p1);
        System.out.println(ProductInventory.counter);
    }
}
