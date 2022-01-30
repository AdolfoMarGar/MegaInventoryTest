package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvSalesOrder;

public class UpdateSalesOrder extends Apikey {
    MvSalesOrder mvSalesOrder;
    String mvRecordAction;

    public UpdateSalesOrder(MvSalesOrder mvSalesOrder, String mvRecordAction) {
        this.mvSalesOrder = mvSalesOrder;
        this.mvRecordAction = mvRecordAction;
    }

    public MvSalesOrder getMvSalesOrder() {
        return mvSalesOrder;
    }

    public void setMvSalesOrder(MvSalesOrder mvSalesOrder) {
        this.mvSalesOrder = mvSalesOrder;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
