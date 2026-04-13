package com.example.InBuiltValidation.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class UserDTO {
    @Null(message = "ID Should not be provided while creating")
    private Integer id;

    @NotBlank(message = "name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "email is required")
    private String email;

    @Min(value=18,message = "Age must be >=18")
    @Max(value=60,message = "Age must be <=60")
    private int age;

    @Size(min = 6,message = "password should be atleast 6 characters")
    private String password;

    @NotEmpty(message = "roles cannot be empty")
    private List<String> roles;

    @Past(message = "dob must be in past")
    private LocalDate dob;

    @AssertTrue(message = "you must accept terms")
    private boolean termsAccepted;

}
