package Login;

import java.util.Scanner;

public class UserRegristration {
    public User registerUser() {
        Scanner s = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("REGESTRATION");

        //user validation
        while (true) {
            System.out.println("Please Enter The Username");
            userName = s.nextLine();

            if (userName.length() >= 4) {
                break;
            } else {  System.out.println("Username is Short");}

    }
        //password validation
    while(true){
        System.out.println("Please enter the Password");
        password =s.nextLine();

        if(isValidPassword(password)){
            break;
        }
        else {
            System.out.println("Invalid Password ");}
    }
        System.out.println("You have been REGESTRED");
       return new User(userName,password);
    }



  public boolean isValidPassword(String password){
        if(password.length()<=6){
            System.out.println(" PASSWORD must be Atleast 6 Characters");
            return false;
        }

        boolean hasUpper=false;
        boolean hasLower =false;
        boolean hasDigit =false;
        boolean hasSpecial=false;


        for(int i=0;i<password.length();i++){
            char ch =password.charAt(i);

        if(Character.isUpperCase(ch))
        {hasUpper=true;}
        else if (Character.isLowerCase(ch))
            {hasLower=true;}
            else if (Character.isDigit(ch))
                {hasDigit=true;}
                else if("@#$%^&*!".contains(String.valueOf(ch)))
                    {hasSpecial=true;}

                    if(!hasUpper) System.out.println("Missing UpperCase letter");
                    if(!hasLower) System.out.println("Missing LowerCase letter");
                    if(!hasDigit) System.out.println("Missing a Digit ");
                    if(!hasSpecial) System.out.println("Missing a Special Character");
            }

      return hasUpper && hasLower && hasDigit && hasSpecial;
  }


  public boolean isValidUser(String username){
        return true;
  }

        }

  



