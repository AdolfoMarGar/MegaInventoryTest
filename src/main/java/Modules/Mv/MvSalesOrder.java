package Modules.Mv;

public class MvSalesOrder {
    int SalesOrderTypeId;
    int SalesOrderClientID;
    String SalesOrderClientName;
    String SalesOrderShippingAddress;
    String SalesOrderStatus;
    MvSalesOrderRow SalesOrderDetails;
    int SalesOrderInventoryLocationID;

    public MvSalesOrder(int salesOrderTypeId, int salesOrderClientID, String salesOrderClientName, String salesOrderShippingAddress, String salesOrderStatus, MvSalesOrderRow salesOrderDetails, int salesOrderInventoryLocationID) {
        SalesOrderTypeId = salesOrderTypeId;
        SalesOrderClientID = salesOrderClientID;
        SalesOrderClientName = salesOrderClientName;
        SalesOrderShippingAddress = salesOrderShippingAddress;
        SalesOrderStatus = salesOrderStatus;
        SalesOrderDetails = salesOrderDetails;
        SalesOrderInventoryLocationID = salesOrderInventoryLocationID;
    }

    public int getSalesOrderInventoryLocationID() {
        return SalesOrderInventoryLocationID;
    }

    public void setSalesOrderInventoryLocationID(int salesOrderInventoryLocationID) {
        SalesOrderInventoryLocationID = salesOrderInventoryLocationID;
    }

    public int getSalesOrderTypeId() {
        return SalesOrderTypeId;
    }

    public void setSalesOrderTypeId(int salesOrderTypeId) {
        SalesOrderTypeId = salesOrderTypeId;
    }

    public int getSalesOrderClientID() {
        return SalesOrderClientID;
    }

    public void setSalesOrderClientID(int salesOrderClientID) {
        SalesOrderClientID = salesOrderClientID;
    }

    public String getSalesOrderClientName() {
        return SalesOrderClientName;
    }

    public void setSalesOrderClientName(String salesOrderClientName) {
        SalesOrderClientName = salesOrderClientName;
    }

    public String getSalesOrderShippingAddress() {
        return SalesOrderShippingAddress;
    }

    public void setSalesOrderShippingAddress(String salesOrderShippingAddress) {
        SalesOrderShippingAddress = salesOrderShippingAddress;
    }

    public String getSalesOrderStatus() {
        return SalesOrderStatus;
    }

    public void setSalesOrderStatus(String salesOrderStatus) {
        SalesOrderStatus = salesOrderStatus;
    }

    public MvSalesOrderRow getSalesOrderDetails() {
        return SalesOrderDetails;
    }

    public void setSalesOrderDetails(MvSalesOrderRow salesOrderDetails) {
        SalesOrderDetails = salesOrderDetails;
    }
}
