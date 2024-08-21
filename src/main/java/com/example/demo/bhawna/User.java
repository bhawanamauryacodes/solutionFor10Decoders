package com.example.demo.bhawna;

public class User {


    @NotBlank(" userName should not be null or empty")
    String userName;
    @NotBlank(" password should not be null or empty")
     @Limit(8)
    String password;

   @Email
    String email;

   @Limit(18)
    String dateOfBirth;
}
