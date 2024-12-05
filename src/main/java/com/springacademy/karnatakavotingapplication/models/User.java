package com.springacademy.karnatakavotingapplication.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity(name="users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 100)
    private String fullname;
    @Column(nullable = false,unique = true, length = 100)
    private String aaadharNumber;
    @Column(nullable = false,unique = true, length = 10)
    private String MobileNumber;
    @Column(nullable = false)

    private LocalDate DateOfBirth;
    @Column(nullable = false, length = 6)
    private String gender;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false, length = 6)
    private String pincode;
    @Column(nullable = false, length = 100)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "constituency_id",nullable = false)
    private Constituency constituency;

    @Column(name="registration_date")
    private LocalDate resgistrationDate;

    @Column(nullable =false,unique = true)
    private String voterId;
    private String isActive;
    private String otp;
    private String otpExpiryTime;
}
