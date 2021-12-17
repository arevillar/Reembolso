package com.mycompany.maintenancetrxbus.rest.dto.in;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ConsultaEstadoInDto{

    private BigInteger rid;
    private BigInteger transactionId;
    private BigInteger orderId;
    private String payerName;
    private BigDecimal amount;
    private BigInteger gatewayId;
    private String gatewayName;
    private String email;
    private BigInteger cconfigId;
    private Double refundAmount;
    private Double transactionAmount;
    private String referenceId;
    private String requestDate;
    private String currencyCode;
    private BigInteger retryCount;
    private BigInteger instrumentId;

    public BigInteger getRid() {
        return rid;
    }

    public void setRid(BigInteger rid) {
        this.rid = rid;
    }

    public BigInteger getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(BigInteger transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigInteger getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(BigInteger gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getCconfigId() {
        return cconfigId;
    }

    public void setCconfigId(BigInteger cconfigId) {
        this.cconfigId = cconfigId;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigInteger getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(BigInteger retryCount) {
        this.retryCount = retryCount;
    }

    public BigInteger getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(BigInteger instrumentId) {
        this.instrumentId = instrumentId;
    }

    @Override
    public String toString() {
        return "ConsultaEstadoInDto{" +
                "rid=" + rid +
                ", transactionId=" + transactionId +
                ", orderId=" + orderId +
                ", payerName='" + payerName + '\'' +
                ", amount=" + amount +
                ", gatewayId=" + gatewayId +
                ", gatewayName='" + gatewayName + '\'' +
                ", email='" + email + '\'' +
                ", cconfigId=" + cconfigId +
                ", refundAmount=" + refundAmount +
                ", transactionAmount=" + transactionAmount +
                ", referenceId='" + referenceId + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", retryCount=" + retryCount +
                ", instrumentId=" + instrumentId +
                '}';
    }
}
