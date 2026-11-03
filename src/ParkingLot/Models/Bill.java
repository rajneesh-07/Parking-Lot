package ParkingLot.Models;

import ParkingLot.Models.Constants.PaymentStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exitTime;
    private double amount;
    private PaymentStatus paymentStatus;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(Ticket ticket, LocalDateTime exitTime, double amount, PaymentStatus paymentStatus, Gate exitGate) {
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.exitGate = exitGate;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
