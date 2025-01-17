package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_log")
public class AuditLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="audit_log_id")
    private Short auditLogId;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking bookingId;

    @Column(name = "change_type", columnDefinition = "ENUM('created','modified','cancelled')", nullable = false)
    private String changeType;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String comments;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name = "booking_status", columnDefinition = "ENUM('awaiting_approval', 'approved', 'cancelled', 'rejected')")
    private String bookingStatus;
}

