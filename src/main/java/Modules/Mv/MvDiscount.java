package Modules.Mv;

public class MvDiscount {
    String DiscountName;
    String DiscountDescription;
    double DiscountValue;

    public MvDiscount(String discountName, String discountDescription, double discountValue) {
        DiscountName = discountName;
        DiscountDescription = discountDescription;
        DiscountValue = discountValue;
    }

    public String getDiscountName() {
        return DiscountName;
    }

    public void setDiscountName(String discountName) {
        DiscountName = discountName;
    }

    public String getDiscountDescription() {
        return DiscountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        DiscountDescription = discountDescription;
    }

    public double getDiscountValue() {
        return DiscountValue;
    }

    public void setDiscountValue(double discountValue) {
        DiscountValue = discountValue;
    }
}
