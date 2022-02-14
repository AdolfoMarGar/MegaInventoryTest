package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvDiscount;
import Modules.Mv.MvProduct;
import Modules.ToJson;

public class UpdateProduct extends Apikey implements ToJson {
    MvProduct mvProduct;
    String mvRecordAction;

    public UpdateProduct(MvProduct mvProduct, String mvRecordAction) {
        this.mvProduct = mvProduct;
        this.mvRecordAction = mvRecordAction;
    }

    public MvProduct getMvProduct() {
        return mvProduct;
    }

    public void setMvProduct(MvProduct mvProduct) {
        this.mvProduct = mvProduct;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }




}
