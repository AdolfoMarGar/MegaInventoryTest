package Modules.Mv;

public class MvProduct {
    String ProductSKU;
    String ProductDescription;
    double ProductSellingPrice;
    double ProductPurchasePrice;

    public MvProduct(String productSKU, String productDescription, double productSellingPrice, double productPurchasePrice) {
        ProductSKU = productSKU;
        ProductDescription = productDescription;
        ProductSellingPrice = productSellingPrice;
        ProductPurchasePrice = productPurchasePrice;
    }

    public String getProductSKU() {
        return ProductSKU;
    }

    public void setProductSKU(String productSKU) {
        ProductSKU = productSKU;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public double getProductSellingPrice() {
        return ProductSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        ProductSellingPrice = productSellingPrice;
    }

    public double getProductPurchasePrice() {
        return ProductPurchasePrice;
    }

    public void setProductPurchasePrice(double productPurchasePrice) {
        ProductPurchasePrice = productPurchasePrice;
    }
}
