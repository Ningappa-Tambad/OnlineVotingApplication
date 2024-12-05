package com.springacademy.karnatakavotingapplication.dtos;


import lombok.Data;
import lombok.Getter;


@Data
public class UserRegistrationRequestDto
{
    private String fullName;
    private String aadharNumber;
    private String mobileNumber;
    private String dateOfBirth;
    private String gender;
    private String address;
    private Long stateId;
    private Long districtId;
    private Long talukId;
    private Long constituencyId;
    private String pincode;
    private String otp;
}
