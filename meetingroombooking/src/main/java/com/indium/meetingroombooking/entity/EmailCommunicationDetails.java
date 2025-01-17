package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "email_communication_details")
public class EmailCommunicationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_comm_id")
    private Short emailCommId;

    @Column(name = "from_user")
    private String fromUser;

    @Column(name="email_to",columnDefinition = "json")
    private String emailTo;

    @Column(name="email_cc",columnDefinition = "json")
    private String emailCc;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(name="created_on")
    private LocalDateTime createdOn;
}
