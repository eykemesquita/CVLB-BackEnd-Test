package com.github.eykemesquita.customer_api.domain.model;

import java.util.Date;

public class Address {

    //private String id; O id será exclusivo do Banco de Dados

    //private String originalId; O id será exclusivo do Banco de Dados

    private boolean principal;

    private String sapClientId;

    private SapSyncStatus sapSyncStatus;

    private String sapSyncMsg;

    private String addressType;

    private String address;

    private String number;

    private String complement;

    private String city;

    private String state;

    private String zipCode;

    private String neighborhood;

    private boolean active;

    private Date creationDate;

    private String createdBy;

    private String modifiedBy;

    public Address(boolean principal, String sapClientId, SapSyncStatus sapSyncStatus, String sapSyncMsg, String addressType, String address,
                   String number, String complement, String city, String state, String zipCode, String neighborhood, boolean active, Date creationDate,
                   String createdBy, String modifiedBy) {
        this.principal = principal;
        this.sapClientId = sapClientId;
        this.sapSyncStatus = sapSyncStatus;
        this.sapSyncMsg = sapSyncMsg;
        this.addressType = addressType;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.active = active;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public String getSapClientId() {
        return sapClientId;
    }

    public void setSapClientId(String sapClientId) {
        this.sapClientId = sapClientId;
    }

    public SapSyncStatus getSapSyncStatus() {
        return sapSyncStatus;
    }

    public void setSapSyncStatus(SapSyncStatus sapSyncStatus) {
        this.sapSyncStatus = sapSyncStatus;
    }

    public String getSapSyncMsg() {
        return sapSyncMsg;
    }

    public void setSapSyncMsg(String sapSyncMsg) {
        this.sapSyncMsg = sapSyncMsg;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
