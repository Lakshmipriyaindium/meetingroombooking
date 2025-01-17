package com.indium.meetingroombooking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "location_details")
public class LocationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Short locationId;

    @Column(name="location_name",nullable = false)
    private String locationName;

    @Column(name="is_active",nullable = false)
    private Character isActive;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name="created_on")
    private LocalDateTime createdOn;

    @Column(name="admin_users_id", columnDefinition = "json")
    private String adminUsersId;

    @Column(name = "booking_allowed_window_in_days")
    private Short bookingAllowedWindowInDays;

    @Column(name = "notice_duration_to_book_in_min")
    private Byte noticeDurationToBookInMin;

    @Column(name = "recurrence_count_allowed")
    private Byte recurrenceCountAllowed;
}
