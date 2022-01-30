package Modules.Update;

import Modules.Apikey;
import Modules.Mv.MvInventoryLocation;

public class UpdateInventoryLocation extends Apikey {
    MvInventoryLocation mvInventoryLocation;
    String mvRecordAction;

    public UpdateInventoryLocation(MvInventoryLocation mvInventoryLocation, String mvRecordAction) {
        this.mvInventoryLocation = mvInventoryLocation;
        this.mvRecordAction = mvRecordAction;
    }

    public MvInventoryLocation getMvInventoryLocation() {
        return mvInventoryLocation;
    }

    public void setMvInventoryLocation(MvInventoryLocation mvInventoryLocation) {
        this.mvInventoryLocation = mvInventoryLocation;
    }

    public String getMvRecordAction() {
        return mvRecordAction;
    }

    public void setMvRecordAction(String mvRecordAction) {
        this.mvRecordAction = mvRecordAction;
    }
}
