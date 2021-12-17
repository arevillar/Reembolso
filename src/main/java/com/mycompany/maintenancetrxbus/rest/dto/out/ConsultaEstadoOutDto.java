package com.mycompany.maintenancetrxbus.rest.dto.out;

import com.mycompany.maintenancetrxbus.rest.dto.base.BaseDto;

import java.math.BigInteger;

public class ConsultaEstadoOutDto extends BaseDto {

    private int transactionId=01;
    private  String status="SUCCESS ";
    private  String data="...";
    private  String message="Reembolso Aprobado";
    private String referenceId="003";
    private int errorCode=0;
    private String errorMessage="Sin Error";
    private int rid=00321;
    private String orderId="00434";
    private int gatewayId=00213;
    private String gatewayName="Niubiz";
    private int cconfigId=0021;
    private Double refundAmount=200.00;
    private int refundRefId=023;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(int gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public int getCconfigId() {
        return cconfigId;
    }

    public void setCconfigId(int cconfigId) {
        this.cconfigId = cconfigId;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public int getRefundRefId() {
        return refundRefId;
    }

    public void setRefundRefId(int refundRefId) {
        this.refundRefId = refundRefId;
    }

    @Override
    public String toString() {
        return "ConsultaEstadoOutDto{" +
                "transactionId=" + transactionId +
                ", status='" + status + '\'' +
                ", data='" + data + '\'' +
                ", message='" + message + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", rid=" + rid +
                ", orderId='" + orderId + '\'' +
                ", gatewayId=" + gatewayId +
                ", gatewayName='" + gatewayName + '\'' +
                ", cconfigId=" + cconfigId +
                ", refundAmount=" + refundAmount +
                ", refundRefId=" + refundRefId +
                '}';
    }
}
