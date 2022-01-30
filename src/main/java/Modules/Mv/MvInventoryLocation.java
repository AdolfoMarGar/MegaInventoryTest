package Modules.Mv;

public class MvInventoryLocation {
    String InventoryLocationName;
    String InventoryLocationAbbreviation;
    String InventoryLocationAddress;

    public MvInventoryLocation(String inventoryLocationName, String inventoryLocationAbbreviation, String inventoryLocationAddress) {
        InventoryLocationName = inventoryLocationName;
        InventoryLocationAbbreviation = inventoryLocationAbbreviation;
        InventoryLocationAddress = inventoryLocationAddress;
    }

    public String getInventoryLocationName() {
        return InventoryLocationName;
    }

    public void setInventoryLocationName(String inventoryLocationName) {
        InventoryLocationName = inventoryLocationName;
    }

    public String getInventoryLocationAbbreviation() {
        return InventoryLocationAbbreviation;
    }

    public void setInventoryLocationAbbreviation(String inventoryLocationAbbreviation) {
        InventoryLocationAbbreviation = inventoryLocationAbbreviation;
    }

    public String getInventoryLocationAddress() {
        return InventoryLocationAddress;
    }

    public void setInventoryLocationAddress(String inventoryLocationAddress) {
        InventoryLocationAddress = inventoryLocationAddress;
    }
}
