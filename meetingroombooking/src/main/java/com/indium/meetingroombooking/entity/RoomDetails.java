package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "room_details")
public class RoomDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Short roomId;

    @Column(name="room_name",nullable = false)
    private String roomName;

    @Column(name="external_display_availability",nullable = false)
    private Character externalDisplayAvailability;

    @Column(name="facilities",nullable = false, columnDefinition = "LONGTEXT")
    private String facilities;

    @Column(nullable = false)
    private Short capacity;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private LocationDetails locationId;

    @Column(name = "booking_allowed")
    private Character bookingAllowed;

    @Column(name = "is_approval_needed")
    private Character isApprovalNeeded;

    @Column(name = "is_active")
    private Character isActive;

    @Column(name = "recurrence_allowed")
    private Character recurrenceAllowed;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;
}

