package Modules.Mv;

public class MvSupplierClient {
    String SupplierClientName;
    String SupplierClientShippingAddress1;
    String SupplierClientEmail;
    String SupplierClientPhone1;

    public MvSupplierClient(String supplierClientName, String supplierClientShippingAddress1, String supplierClientEmail, String supplierClientPhone1) {
        SupplierClientName = supplierClientName;
        SupplierClientShippingAddress1 = supplierClientShippingAddress1;
        SupplierClientEmail = supplierClientEmail;
        SupplierClientPhone1 = supplierClientPhone1;
    }

    public String getSupplierClientName() {
        return SupplierClientName;
    }

    public void setSupplierClientName(String supplierClientName) {
        SupplierClientName = supplierClientName;
    }

    public String getSupplierClientShippingAddress1() {
        return SupplierClientShippingAddress1;
    }

    public void setSupplierClientShippingAddress1(String supplierClientShippingAddress1) {
        SupplierClientShippingAddress1 = supplierClientShippingAddress1;
    }

    public String getSupplierClientEmail() {
        return SupplierClientEmail;
    }

    public void setSupplierClientEmail(String supplierClientEmail) {
        SupplierClientEmail = supplierClientEmail;
    }

    public String getSupplierClientPhone1() {
        return SupplierClientPhone1;
    }

    public void setSupplierClientPhone1(String supplierClientPhone1) {
        SupplierClientPhone1 = supplierClientPhone1;
    }
}
