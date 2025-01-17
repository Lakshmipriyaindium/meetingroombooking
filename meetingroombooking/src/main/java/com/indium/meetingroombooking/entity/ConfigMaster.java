package com.indium.meetingroombooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "config_master")
public class ConfigMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="config_master_id")
    private Long configMasterId;

    @Column(name = "config_param")
    private String configParam;

    @Column(name = "config_employee_code", columnDefinition = "json", nullable = false)
    private String configEmployeeCode;
}
