package Modules.Mv;

public class MvTax {
    String TaxName;
    String TaxDescription;
    Double TaxValue;

    public MvTax(String taxName, String taxDescription, Double taxValue) {
        TaxName = taxName;
        TaxDescription = taxDescription;
        TaxValue = taxValue;
    }

    public String getTaxName() {
        return TaxName;
    }

    public void setTaxName(String taxName) {
        TaxName = taxName;
    }

    public String getTaxDescription() {
        return TaxDescription;
    }

    public void setTaxDescription(String taxDescription) {
        TaxDescription = taxDescription;
    }

    public Double getTaxValue() {
        return TaxValue;
    }

    public void setTaxValue(Double taxValue) {
        TaxValue = taxValue;
    }
}
