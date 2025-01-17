package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Short bookingId;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private LocationDetails locationId;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomDetails roomId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "booked_on")
    private LocalDateTime bookedOn;

    @Column(name = "event_date", nullable = false)
    private LocalDate eventDate;

    @Column(name = "start_time",nullable = false)
    private LocalDateTime startTime;

    @Column(name="end_time",nullable = false)
    private LocalDateTime endTime;

    @Column(name="event_name",nullable = false)
    private String eventName;

    @Column(name = "status", columnDefinition = "ENUM('awaiting_approval', 'approved', 'cancelled', 'rejected')", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "approved_by")
    private User approvedBy;

    @Column(name="approved_on")
    private LocalDateTime approvedOn;

    @Column(name="approval_remarks")
    private String approvalRemarks;

    @Column(name = "is_recurring")
    private Character isRecurring;

    @Column(name="recurrence_id")
    private Short recurrenceId;
}

