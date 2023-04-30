
public class Product {
    private String isim;
    private Double fiyat;
    private int miktar;
   
    public Product(String initialName, Double initialPrice, int initialQuantity){
        this.isim = initialName;
        this.fiyat = initialPrice;
        this.miktar = initialQuantity;
    }
    public void printProduct(){
        System.out.println(isim + ", price " + fiyat + ", " + miktar + " adet");
    }
    
}
