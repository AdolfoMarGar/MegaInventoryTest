package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvDiscount;

public class UpdateProduct extends Apikey {
    MvDiscount mvDiscount;
    String mvRecordAction;

    public UpdateProduct(MvDiscount mvDiscount, String mvRecordAction) {
        this.mvDiscount = mvDiscount;
        this.mvRecordAction = mvRecordAction;
    }

    public MvDiscount getMvDiscount() {
        return mvDiscount;
    }

    public void setMvDiscount(MvDiscount mvDiscount) {
        this.mvDiscount = mvDiscount;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
