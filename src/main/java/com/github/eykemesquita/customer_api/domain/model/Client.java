package com.github.eykemesquita.customer_api.domain.model;

import java.util.Date;

public class Client {

    //private Long id; O id será exclusivo do Banco de Dados

    private String name;

    private String email;

    private String phone;

    private Date birthDate;

    private boolean isEmployee;

    private String stateInscription;

    private String municipalInscription;

    private boolean isBlocked;

    private String createdBy;

    private String modifiedBy;

    private Date createdDate;

    private boolean emailOptIn;

    private boolean smsOptIn;

    private boolean whatsappOptIn;

    private boolean pushOptIn;

}
