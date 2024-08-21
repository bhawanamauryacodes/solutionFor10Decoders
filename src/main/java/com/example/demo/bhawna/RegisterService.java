package com.example.demo.bhawna;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RegisterService {


    @Autowired
    private Respository respository;

    @Autowired
    private MySqlConnection mySqlConnection;

    public createUser(String userName , String password, String email , String dateOfBirth){
        public boolean isValidEmail(email) {
            String regex = "absFORexample";
            if (email != regex)
                return true;
        }
        public boolean isDateOfBirth(dateOfBirth) {
            if (dateOfBirth > 18) {
                return true;
            }
        }
     if( isValidEmail || isDateOfBirth){
         Respository registerRepo = User.createUser("bhawna" , "abs", "bhawna@gmail.com" ,"24-08-1998");
     }
    }
}
