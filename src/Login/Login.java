package Login;

import java.util.Scanner;

public class Login {

   public void login (User registerUser){
       Scanner s = new Scanner(System.in);
       System.out.println("+++++++++++Login+++++++++");
       System.out.println("++++++++++++Enter your USERNAME++++++++");
       String inputUser= s.nextLine();

       System.out.println(" +++++++++++PASSWORD+++++++++");
       String inputPassword =s.nextLine();

       if(inputUser.equals(registerUser.getUserName())&& inputPassword.equals(registerUser.getPassword())){
           System.out.println("LOGIN SUCCESSFUL  "+inputUser+" !!!");
       }else {
           System.out.println("AWW SNAP ! LOGIN FAILED ");}

   }

}
