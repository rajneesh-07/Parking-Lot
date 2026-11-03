package ParkingLot.Models;

import ParkingLot.Models.Constants.GateType;

public class Gate extends BaseModel{
    private int gateNo;
    private GateType gateType;
    private String OperatorName;

    public Gate() {
    }

    public Gate(int gateNo, GateType gateType, String operatorName) {
        this.gateNo = gateNo;
        this.gateType = gateType;
        OperatorName = operatorName;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setOperatorName(String operatorName) {
        OperatorName = operatorName;
    }
}
