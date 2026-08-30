public class ProductInventory
{
    static int counter =0;
    private String name;
    private String code;
    private int unit_price;
    private int quantity;
    public ProductInventory()
  {
        this("NoName","XXXX",0,0);
    }
    public ProductInventory(String name)
    {
        this(name,"XXXX",0,0);
    }
    public ProductInventory(String name,String code)
    {
        this(name,code,0,0);
    }
    public ProductInventory(String name,String code, int unit_price)
    {
        this(name,code,unit_price,0);
    }
    public ProductInventory(String name,String code,int unit_price,int quantity)
    {
        if(unit_price>=0 && quantity>=0)
        {
            this.name = name;
            this.code = code;
            this.unit_price = unit_price;
            this.quantity = quantity;
            counter++;
        }
        else if (quantity<0 && unit_price>=0){
            this.name = name;
            this.code = code;
            this.unit_price = unit_price;
            this.quantity = 0;
            counter++;
        }
        else if (quantity>0 && unit_price < 0)
        {
            this.name = name;
            this.code = code;
            this.unit_price = 0;
            this.quantity = quantity;
            counter++;
        }
    }
    public boolean restock(int amount)
    {
        if(amount>0)
        {

            quantity += amount;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean sell(int amount)
    {
        if(quantity>=amount)
        {
            quantity-=amount;
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getInventoryValue()
    {
        return quantity;
    }    
    public static int getProductCount()
    {
        return counter;
    }
    @Override
    public String toString()
    {
        return "Name : "+name+'\n'+"Code : "+code+'\n'+"Unit Price : "+unit_price;
    }
}
