package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvTax;

public class UpdateTax extends Apikey {
    MvTax mvTax;
    String mvRecordAction;

    public UpdateTax(MvTax mvTax, String mvRecordAction) {
        this.mvTax = mvTax;
        this.mvRecordAction = mvRecordAction;
    }

    public MvTax getMvTax() {
        return mvTax;
    }

    public void setMvTax(MvTax mvTax) {
        this.mvTax = mvTax;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }

}
