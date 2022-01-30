
import Modules.Mv.*;
import Modules.Update.*;
import com.google.gson.Gson;

public class Main {
    public static void main (String [ ] args) {
        MvDiscount mvDiscount = new MvDiscount("NombreDesc","Descrip",5.5);
        UpdateDiscount discountUpdate = new UpdateDiscount(mvDiscount,"InsertOrUpdate");
        Gson gson = new Gson();
        String jsonString = gson.toJson(discountUpdate);
        System.out.println(jsonString);
        System.out.println("");


        MvInventoryLocation mvInventoryLocation = new MvInventoryLocation("local","l","calzada castro");
        UpdateInventoryLocation updateInventoryLocation = new UpdateInventoryLocation(mvInventoryLocation,"InsertOrUpdate");
        jsonString = gson.toJson(updateInventoryLocation);
        System.out.println(jsonString);
        System.out.println("");

        MvTax mvTax = new MvTax("por guapo","que eres mu guapo", 8.3);
        UpdateTax updateTax = new UpdateTax(mvTax,"InsertOrUpdate");
        jsonString = gson.toJson(updateTax);
        System.out.println(jsonString);
        System.out.println("");

        MvProduct mvProduct = new MvProduct("SKUUUR","RATATATATA",99.8,12);
        UpdateProduct updateProduct = new UpdateProduct(mvProduct,"InsertOrUpdate");
        jsonString = gson.toJson(updateProduct);
        System.out.println(jsonString);
        System.out.println("");

        MvSupplierClient mvSupplierClient = new MvSupplierClient("pepe","Su casa","pepe@pepada.com","675132510");
        UpdateSupplierClient updateSupplierClient = new UpdateSupplierClient(mvSupplierClient, "InsertOrUpdate");
        jsonString = gson.toJson(updateSupplierClient);
        System.out.println(jsonString);
        System.out.println("");

        MvSalesOrderRow mvSalesOrderRow = new MvSalesOrderRow(
                mvProduct.getProductSKU(),
                50,
                20,
                20,
                mvProduct.getProductSellingPrice()*20,
                mvProduct.getProductSellingPrice()*20*(mvTax.getTaxValue()/100),
                mvProduct.getProductSellingPrice()*20*(mvDiscount.getDiscountValue()/100),
                (mvProduct.getProductSellingPrice()*20)
                        -(mvProduct.getProductSellingPrice()*20*(mvDiscount.getDiscountValue()/100))
                        +(mvProduct.getProductSellingPrice()*20*(mvTax.getTaxValue()/100))
        );

        MvSalesOrder mvSalesOrder = new MvSalesOrder(
                3,
                5,
                mvSupplierClient.getSupplierClientName(),
                mvSupplierClient.getSupplierClientShippingAddress1(),
                "Verified ",
                mvSalesOrderRow,
                3
        );
        UpdateSalesOrder updateSalesOrder = new UpdateSalesOrder(mvSalesOrder,"InsertOrUpdate");
        jsonString = gson.toJson(updateSalesOrder);
        System.out.println(jsonString);
        System.out.println("");




    }
}
