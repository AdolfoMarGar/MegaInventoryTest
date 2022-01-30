package Interface;

import Modules.Mv.*;
import Modules.Update.*;
import Services.ApiServices;
import Services.Util;
import com.google.gson.Gson;

import javax.swing.*;
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
    MvProduct mvProduct;
    UpdateProduct updateProduct;
    MvDiscount mvDiscount;
    UpdateDiscount updateDiscount;
    MvTax mvTax;
    UpdateTax updateTax;
    MvInventoryLocation mvInventoryLocation;
    UpdateInventoryLocation updateInventoryLocation;
    MvSupplierClient mvSupplierClient;
    UpdateSupplierClient updateSupplierClient;

    Gson gson = new Gson();
    String jsonString;


    public MainInterface() {
        btn_CreateSalesOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createProduct();
                createDiscount();
                createTax();
                createInventoryLocation();
                createSupplierClient();

            }
        });
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainInterface().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setExtendedState(MAXIMIZED_BOTH);

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
                        jsonString = gson.toJson(updateProduct);
                        System.out.println(jsonString);
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number.");
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
                        jsonString = gson.toJson(updateDiscount);
                        System.out.println(jsonString);
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0 and less than or equal to 100.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number, don't add '%'.");
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
                        jsonString = gson.toJson(updateTax);
                        System.out.println(jsonString);
                    }
                }
            }else{
                Util.msg_error("Error","Enter a number greater than or equal to 0 and less than or equal to 100.");
            }
        }catch (Exception ex){
            Util.msg_error("Error parsing","Enter a number, don't add '%'.");
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
                    jsonString = gson.toJson(updateInventoryLocation);
                    System.out.println(jsonString);
                }
            }
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
            jsonString = gson.toJson(updateSupplierClient);
            System.out.println(jsonString);

        }


    }
}
