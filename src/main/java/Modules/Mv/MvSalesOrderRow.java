package Modules.Mv;

public class MvSalesOrderRow {
    String SalesOrderRowProductSKU;
    double SalesOrderRowQuantity;
    double SalesOrderRowShippedQuantity;
    double SalesOrderRowInvoicedQuantity;
    double SalesOrderRowUnitPriceWithoutTaxOrDiscount;
    double SalesOrderTotalTaxAmount;
    double SalesOrderRowTotalDiscountAmount;
    double SalesOrderRowTotalAmount;

    public MvSalesOrderRow(String salesOrderRowProductSKU, double salesOrderRowQuantity, double salesOrderRowShippedQuantity, double salesOrderRowInvoicedQuantity, double salesOrderRowUnitPriceWithoutTaxOrDiscount, double salesOrderTotalTaxAmount, double salesOrderRowTotalDiscountAmount, double salesOrderRowTotalAmount) {
        SalesOrderRowProductSKU = salesOrderRowProductSKU;
        SalesOrderRowQuantity = salesOrderRowQuantity;
        SalesOrderRowShippedQuantity = salesOrderRowShippedQuantity;
        SalesOrderRowInvoicedQuantity = salesOrderRowInvoicedQuantity;
        SalesOrderRowUnitPriceWithoutTaxOrDiscount = salesOrderRowUnitPriceWithoutTaxOrDiscount;
        SalesOrderTotalTaxAmount = salesOrderTotalTaxAmount;
        SalesOrderRowTotalDiscountAmount = salesOrderRowTotalDiscountAmount;
        SalesOrderRowTotalAmount = salesOrderRowTotalAmount;
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

    public double getSalesOrderTotalTaxAmount() {
        return SalesOrderTotalTaxAmount;
    }

    public void setSalesOrderTotalTaxAmount(double salesOrderTotalTaxAmount) {
        SalesOrderTotalTaxAmount = salesOrderTotalTaxAmount;
    }

    public double getSalesOrderRowTotalDiscountAmount() {
        return SalesOrderRowTotalDiscountAmount;
    }

    public void setSalesOrderRowTotalDiscountAmount(double salesOrderRowTotalDiscountAmount) {
        SalesOrderRowTotalDiscountAmount = salesOrderRowTotalDiscountAmount;
    }

    public double getSalesOrderRowTotalAmount() {
        return SalesOrderRowTotalAmount;
    }

    public void setSalesOrderRowTotalAmount(double salesOrderRowTotalAmount) {
        SalesOrderRowTotalAmount = salesOrderRowTotalAmount;
    }
}
