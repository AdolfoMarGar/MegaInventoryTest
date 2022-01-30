package Interface;

import Modules.Mv.*;
import Modules.Update.*;
import Services.ApiServices;
import Services.Util;
import com.google.gson.Gson;
import javax.json.JsonObject;
import javax.swing.*;
import javax.ws.rs.core.Response;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class MainInterface {
    private JButton btn_CreateSalesOrder;
    private JPanel panelMain;
    private JTextField txt_NameDiscount;
    private JTextField txt_DescriptionDiscount;
    private JTextField txt_ValueDiscount;
    private JPanel JpanelDiscount;
    private JTextField txt_SkuProduct;
    private JTextField txt_DescriptionProduct;
    private JTextField txt_SellingPriceProduct;
    private JTextField txt_PurchasePriceProduct;
    private JPanel JPanelProduct;
    private JTextField txt_NameTax;
    private JTextField txt_DescriptionTax;
    private JTextField txt_ValueTax;
    private JPanel JPanelTax;
    private JPanel JPanelInventoryLocation;
    private JTextField txt_NameInvLocation;
    private JTextField txt_AbbreviatonInvLocation;
    private JTextField txt_AddresInvLocation;
    private JTextField txt_QuantitySalesOrder;
    private JTextField txt_NameClient;
    private JTextField txt_AddressClient;
    private JTextField txt_EmailClient;
    private JTextField txt_PhoneClient;


    final ApiServices apiServices = new ApiServices();
    UpdateDiscount updateDiscount;
    UpdateProduct updateProduct;
    UpdateTax updateTax;
    UpdateInventoryLocation updateInventoryLocation;
    UpdateSupplierClient updateSupplierClient;
    UpdateSalesOrder updateSalesOrder;

    JsonObject jsonInvLoc;
    JsonObject jsonTax;
    JsonObject jsonDisc;

    MvProduct mvProduct;
    MvDiscount mvDiscount;
    MvTax mvTax;
    MvInventoryLocation mvInventoryLocation;
    MvSupplierClient mvSupplierClient;
    MvSalesOrderRow mvSalesOrderRow;
    MvSalesOrder mvSalesOrder;

    Gson gson = new Gson();
    String jsonString;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainInterface().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
    }

    public MainInterface() {
        btn_CreateSalesOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createProduct();
                createDiscount();
                createTax();
                createInventoryLocation();
                createSupplierClient();
                if(updateDiscount!=null && updateProduct!=null && updateTax!=null && updateInventoryLocation!=null && updateSupplierClient!=null){
                    postProduct();
                    postDiscount();
                    postTax();
                    postInventoryLocation();
                    postSupplierClient();
                    createSalesOrder();
                    postSalesOrder();
                }
            }
        });
    }

    public void createProduct(){
        String productSKU;
        String productDescription;
        double psp;
        double ppp;
        try{
            productSKU = txt_SkuProduct.getText();
            productDescription = txt_DescriptionProduct.getText();
            psp = Double.parseDouble(txt_SellingPriceProduct.getText());
            ppp = Double.parseDouble(txt_PurchasePriceProduct.getText());
            if(psp>=0&&ppp>=0){
                if (productSKU.equals("")){
                    Util.msg_warning("Empty field","SKU can't be empty");
                }else{
                    if (productDescription.equals("")){
                        Util.msg_warning("Empty field","Description can't be empty");
                    }else{
                        mvProduct = new MvProduct(productSKU,productDescription,psp,ppp);
                        updateProduct = new UpdateProduct(mvProduct,"InsertOrUpdate");
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number.");
        }
    }
    public void postProduct() {
        jsonString = gson.toJson(updateProduct);
        Response response = apiServices.requestPost(jsonString,"/Product/ProductUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            Util.msg_info("Product status.","Product successfully inserted or updated.");
        }else{
            Util.msg_error("Product error.","Error : "+status);
        }
    }

    public void createDiscount(){
        String name;
        String description;
        double value;
        try{
            name = txt_NameDiscount.getText();
            description = txt_DescriptionDiscount.getText();
            value = Double.parseDouble(txt_ValueDiscount.getText());
            if(value>=0&&value<=100){
                if (name.equals("")){
                    Util.msg_warning("Empty field","Name can't be empty");
                }else{
                    if (description.equals("")){
                        Util.msg_warning("Empty field","Description can't be empty");
                    }else{
                        mvDiscount = new MvDiscount(name,description,value);
                        updateDiscount = new UpdateDiscount(mvDiscount,"InsertOrUpdate");
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0 and less than or equal to 100.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number, don't add '%'.");
        }
    }
    public void postDiscount() {
        jsonString = gson.toJson(updateDiscount);
        Response response = apiServices.requestPost(jsonString,"/Discount/DiscountUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            jsonDisc = response.readEntity(JsonObject.class);
            Util.msg_info("Discount status.","Discount successfully inserted or updated.");
        }else{
            Util.msg_error("Discount error.","Error : "+status);
        }
    }

    public void createTax(){
        String name;
        String description;
        double value;
        try{
            name = txt_NameTax.getText();
            description = txt_DescriptionTax.getText();
            value = Double.parseDouble(txt_ValueTax.getText());
            if(value>=0&&value<=100){
                if (name.equals("")){
                    Util.msg_warning("Empty field","Name can't be empty");
                }else{
                    if (description.equals("")){
                        Util.msg_warning("Empty field","Description can't be empty");
                    }else{
                        mvTax = new MvTax(name,description,value);
                        updateTax = new UpdateTax(mvTax,"InsertOrUpdate");
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0 and less than or equal to 100.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number, don't add '%'.");
        }
    }
    public void postTax() {
        jsonString = gson.toJson(updateTax);
        Response response = apiServices.requestPost(jsonString,"/Tax/TaxUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            jsonTax = response.readEntity(JsonObject.class);
            Util.msg_info("Tax status.","Tax successfully inserted or updated.");
        }else{
            Util.msg_error("Tax error.","Error : "+status);
        }
    }

    public void createInventoryLocation(){
        String name;
        String abbreviation;
        String address;

        name = txt_NameInvLocation.getText();
        abbreviation = txt_AbbreviatonInvLocation.getText();
        address = txt_AddresInvLocation.getText();

        if (name.equals("")){
            Util.msg_warning("Empty field","Name can't be empty");
        }else{
            if (abbreviation.equals("")){
                Util.msg_warning("Empty field","Abbreviation can't be empty");
            }else{
                if(abbreviation.length()>5){
                    Util.msg_warning("Error","Abbreviation can't be longer than 5 characters.");
                }else{
                    mvInventoryLocation = new MvInventoryLocation(name,abbreviation,address);
                    updateInventoryLocation = new UpdateInventoryLocation(mvInventoryLocation,"InsertOrUpdate");
                }
            }
        }
    }
    public void postInventoryLocation() {
        jsonString = gson.toJson(updateInventoryLocation);
        Response response = apiServices.requestPost(jsonString,"/InventoryLocation/InventoryLocationUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            jsonInvLoc = response.readEntity(JsonObject.class);
            Util.msg_info("InventoryLocation status.","InventoryLocation successfully inserted or updated.");
        }else{
            Util.msg_error("InventoryLocation error.","Error : "+status);
        }
    }

    public void createSupplierClient(){
        String name;
        String address;
        String Email;
        String Phone;

        name = txt_NameClient.getText();
        address = txt_AddressClient.getText();
        Email = txt_EmailClient.getText();
        Phone = txt_PhoneClient.getText();

        if (name.equals("")){
            Util.msg_warning("Empty field","Name can't be empty");
        }else{
            mvSupplierClient = new MvSupplierClient(name,address,Email,Phone);
            updateSupplierClient = new UpdateSupplierClient(mvSupplierClient,"InsertOrUpdate");
        }
    }
    public void postSupplierClient() {
        jsonString = gson.toJson(updateSupplierClient);
        Response response = apiServices.requestPost(jsonString,"/SupplierClient/SupplierClientUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            Util.msg_info("SupplierClient status.","SupplierClient successfully inserted or updated.");
        }else{
            Util.msg_error("SupplierClient error.","Error : "+status);
        }
    }

    public int getIDInvLoc(){
        String auxString;
        JsonObject jsonAux = jsonInvLoc.getJsonObject("mvInventoryLocation");
        auxString = jsonAux.get("InventoryLocationID").toString();
        return  Integer.parseInt(auxString);
    }
    public int getIDTax(){
        String auxString;
        JsonObject jsonAux = jsonDisc.getJsonObject("mvDiscount");
        auxString = jsonAux.get("DiscountID").toString();
        return  Integer.parseInt(auxString);
    }
    public int getIDDiscount(){
        String auxString;
        JsonObject jsonAux = jsonTax.getJsonObject("mvTax");
        auxString = jsonAux.get("TaxID").toString();
        return  Integer.parseInt(auxString);
    }
    public void createSalesOrder(){
        String ProductSKU = mvProduct.getProductSKU();
        double Quantity;
        double UnitPriceWithoutTaxOrDiscount =mvProduct.getProductSellingPrice();
        try{
            Quantity = Double.parseDouble(txt_QuantitySalesOrder.getText());
            if (Quantity<1){
                Util.msg_warning("Error.","Enter a number greater than 0.");
            }else{
                mvSalesOrderRow = new MvSalesOrderRow(
                        ProductSKU,Quantity,0,0,
                        UnitPriceWithoutTaxOrDiscount,getIDTax(),getIDDiscount()
                );

                mvSalesOrder = new MvSalesOrder(
                        3,0,mvSupplierClient.getSupplierClientName(),
                        mvSupplierClient.getSupplierClientShippingAddress1(),"Verified",
                        mvSalesOrderRow,getIDInvLoc()
                );

                updateSalesOrder = new UpdateSalesOrder(mvSalesOrder,"InsertOrUpdate");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number.");
        }
    }
    public void  postSalesOrder(){
        jsonString = gson.toJson(updateSalesOrder);
        Response response = apiServices.requestPost(jsonString,"/SalesOrder/SalesOrderUpdate");
        int status=-1;
        status = response.getStatus();
        if(status==200){
            Util.msg_info("SalesOrder status.","SalesOrder successfully inserted or updated.");
        }else{
            Util.msg_error("SalesOrder error.","Error : "+status);
        }
    }
}
