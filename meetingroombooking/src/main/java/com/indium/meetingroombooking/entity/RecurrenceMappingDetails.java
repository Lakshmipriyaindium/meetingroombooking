package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "recurrence_mapping")
public class RecurrenceMappingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recurrence_id")
    private Short recurrenceId;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking bookingId;

    @Column(name = "recurrence_type", columnDefinition = "ENUM('daily','weekly')", nullable = false)
    private String recurrenceType;

    @Column(name = "recurrence_end_date")
    private LocalDateTime recurrenceEndDate;

    @Column(name="repeat_on_days",columnDefinition = "json")
    private String repeatOnDays;
}
