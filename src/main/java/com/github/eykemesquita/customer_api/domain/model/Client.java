package com.github.eykemesquita.customer_api.domain.model;


import java.util.Date;
import java.util.List;

public class Client {

    //private Long id; O id será exclusivo do Banco de Dados

    private String name;

    private String email;

    private String docNumber;

    private String phone;

    private Date birthDate;

    private boolean isEmployee;

    private String stateInscription;

    private String municipalInscription;

    private boolean isBlocked;

    private String createdBy;

    private String modifiedBy;

    private Date createdDate;

    private Date modifiedDate;

    private boolean emailOptIn;

    private boolean smsOptIn;

    private boolean whatsappOptIn;

    private boolean pushOptIn;

    private List<Address> addressList;

//    public Client(String name, String email, String docNumber, String phone, Date birthDate, boolean isEmployee, String stateInscription, String municipalInscription,
//                  boolean isBlocked, String createdBy, String modifiedBy, Date createdDate, Date modifiedDate, boolean emailOptIn, boolean smsOptIn, boolean whatsappOptIn,
//                  boolean pushOptIn, List<Address> addressList) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.birthDate = birthDate;
//        this.isEmployee = isEmployee;
//        this.stateInscription = stateInscription;
//        this.municipalInscription = municipalInscription;
//        this.isBlocked = isBlocked;
//        this.createdBy = createdBy;
//        this.modifiedBy = modifiedBy;
//        this.createdDate = createdDate;
//        this.emailOptIn = emailOptIn;
//        this.smsOptIn = smsOptIn;
//        this.whatsappOptIn = whatsappOptIn;
//        this.pushOptIn = pushOptIn;
//        this.addressList = addressList;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public String getStateInscription() {
        return stateInscription;
    }

    public void setStateInscription(String stateInscription) {
        this.stateInscription = stateInscription;
    }

    public String getMunicipalInscription() {
        return municipalInscription;
    }

    public void setMunicipalInscription(String municipalInscription) {
        this.municipalInscription = municipalInscription;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isEmailOptIn() {
        return emailOptIn;
    }

    public void setEmailOptIn(boolean emailOptIn) {
        this.emailOptIn = emailOptIn;
    }

    public boolean isSmsOptIn() {
        return smsOptIn;
    }

    public void setSmsOptIn(boolean smsOptIn) {
        this.smsOptIn = smsOptIn;
    }

    public boolean isWhatsappOptIn() {
        return whatsappOptIn;
    }

    public void setWhatsappOptIn(boolean whatsappOptIn) {
        this.whatsappOptIn = whatsappOptIn;
    }

    public boolean isPushOptIn() {
        return pushOptIn;
    }

    public void setPushOptIn(boolean pushOptIn) {
        this.pushOptIn = pushOptIn;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
