package ParkingLot.Models;

import ParkingLot.Models.Constants.PaymentMode;
import ParkingLot.Models.Constants.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private PaymentStatus paymentStatus;
    private String transactionNo;
    private Bill bill;
    private double amount;
    private PaymentMode paymentMode;
    private LocalDateTime paymentDateTime;

    public Payment() {
    }

    public Payment(PaymentStatus paymentStatus, String transactionNo, Bill bill, double amount, PaymentMode paymentMode, LocalDateTime paymentDateTime) {
        this.paymentStatus = paymentStatus;
        this.transactionNo = transactionNo;
        this.bill = bill;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentDateTime = paymentDateTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDateTime paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }
}
