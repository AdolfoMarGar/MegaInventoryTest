package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvSupplierClient;

public class UpdateSupplierClient extends Apikey {
    MvSupplierClient mvSupplierClient;
    String mvRecordAction;

    public UpdateSupplierClient(MvSupplierClient mvSupplierClient, String mvRecordAction) {
        this.mvSupplierClient = mvSupplierClient;
        this.mvRecordAction = mvRecordAction;
    }

    public MvSupplierClient getMvSupplierClient() {
        return mvSupplierClient;
    }

    public void setMvSupplierClient(MvSupplierClient mvSupplierClient) {
        this.mvSupplierClient = mvSupplierClient;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
