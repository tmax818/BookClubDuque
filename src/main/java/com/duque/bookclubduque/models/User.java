package com.duque.bookclubduque.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Username is required")
    @Size(min = 3, max = 30, message = "Username 3 and 30")
    private String userName;

    @NotEmpty(message = "email is required")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotEmpty(message = "Username is required")
    @Size(min = 8, max = 128, message = "Password 8 and 128")
    private String password;

    @Transient
    @NotEmpty(message = "Confirm password is required")
    @Size(min = 8, max = 128, message = "You know the drill!")
    private String confirm;


}

