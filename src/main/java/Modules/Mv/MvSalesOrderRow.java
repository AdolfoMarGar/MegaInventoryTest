package Modules.Mv;

public class MvSalesOrderRow {
    String SalesOrderRowProductSKU;
    double SalesOrderRowQuantity;
    double SalesOrderRowShippedQuantity;
    double SalesOrderRowInvoicedQuantity;
    double SalesOrderRowUnitPriceWithoutTaxOrDiscount;
    int SalesOrderRowTaxID ;
    int SalesOrderRowDiscountID ;

    public MvSalesOrderRow(String salesOrderRowProductSKU, double salesOrderRowQuantity, double salesOrderRowShippedQuantity, double salesOrderRowInvoicedQuantity, double salesOrderRowUnitPriceWithoutTaxOrDiscount, int salesOrderRowTaxID, int salesOrderRowDiscountID) {
        SalesOrderRowProductSKU = salesOrderRowProductSKU;
        SalesOrderRowQuantity = salesOrderRowQuantity;
        SalesOrderRowShippedQuantity = salesOrderRowShippedQuantity;
        SalesOrderRowInvoicedQuantity = salesOrderRowInvoicedQuantity;
        SalesOrderRowUnitPriceWithoutTaxOrDiscount = salesOrderRowUnitPriceWithoutTaxOrDiscount;
        SalesOrderRowTaxID = salesOrderRowTaxID;
        SalesOrderRowDiscountID = salesOrderRowDiscountID;
    }

    public String getSalesOrderRowProductSKU() {
        return SalesOrderRowProductSKU;
    }

    public void setSalesOrderRowProductSKU(String salesOrderRowProductSKU) {
        SalesOrderRowProductSKU = salesOrderRowProductSKU;
    }

    public double getSalesOrderRowQuantity() {
        return SalesOrderRowQuantity;
    }

    public void setSalesOrderRowQuantity(double salesOrderRowQuantity) {
        SalesOrderRowQuantity = salesOrderRowQuantity;
    }

    public double getSalesOrderRowShippedQuantity() {
        return SalesOrderRowShippedQuantity;
    }

    public void setSalesOrderRowShippedQuantity(double salesOrderRowShippedQuantity) {
        SalesOrderRowShippedQuantity = salesOrderRowShippedQuantity;
    }

    public double getSalesOrderRowInvoicedQuantity() {
        return SalesOrderRowInvoicedQuantity;
    }

    public void setSalesOrderRowInvoicedQuantity(double salesOrderRowInvoicedQuantity) {
        SalesOrderRowInvoicedQuantity = salesOrderRowInvoicedQuantity;
    }

    public double getSalesOrderRowUnitPriceWithoutTaxOrDiscount() {
        return SalesOrderRowUnitPriceWithoutTaxOrDiscount;
    }

    public void setSalesOrderRowUnitPriceWithoutTaxOrDiscount(double salesOrderRowUnitPriceWithoutTaxOrDiscount) {
        SalesOrderRowUnitPriceWithoutTaxOrDiscount = salesOrderRowUnitPriceWithoutTaxOrDiscount;
    }

    public int getSalesOrderRowTaxID() {
        return SalesOrderRowTaxID;
    }

    public void setSalesOrderRowTaxID(int salesOrderRowTaxID) {
        SalesOrderRowTaxID = salesOrderRowTaxID;
    }

    public int getSalesOrderRowDiscountID() {
        return SalesOrderRowDiscountID;
    }

    public void setSalesOrderRowDiscountID(int salesOrderRowDiscountID) {
        SalesOrderRowDiscountID = salesOrderRowDiscountID;
    }
}
