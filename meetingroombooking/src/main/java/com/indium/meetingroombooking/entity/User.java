package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "employee_code")
    private String employeeCode;
    @Column(name = "company_email")
    private String companyEmail;

    private String designation;

    @Column(name = "login_token")
    private String loginToken;

    @Column(name = "employee_status")
    private String employeeStatus;

    @Column(name = "admin_flag")
    private Byte adminFlag;

    @Column(name = "admin_portal_login_flag")
    private Byte adminPortalLoginFlag;

}