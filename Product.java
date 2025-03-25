
class Product
{
    String sku;
    double priceRetail;
    double priceCurrent;
    String productName;
    String category;

    public Product(String sku, double priceRetail, double priceCurrent, String productName, String category)
    {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
    }

    public String toString()
    {
        return "SKU: " + sku + ", Price Retail: " + priceRetail + ", Price Current: " + priceCurrent +
               ", Product Name: " + productName + ", Category: " + category;
    }
}