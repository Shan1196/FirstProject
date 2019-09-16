package emailApp;

import java.util.Scanner;

public class Email<Changepassword> {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private String email;
    private int mailboxCapacity;
    private  int defaultPasswordLength = 9;
    private String alternateEmail;
    private String companySuffix = "USTours.usa.llc";

    // constructor to receive first and last name
    public  Email(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println ( "email created :" + this.firstName + " " + this.lastName );

        //call a method asking for the department -and return the department
        this.department =setDepartment ();
        //System.out.println ( "Department:" + this.department);

        //call a method that return a random password
        this.passWord = randomPassword (defaultPasswordLength );
       System.out.println ("Your password is : " +this.passWord);


        //combine element to generate an email

        email= firstName.toLowerCase () + "." + lastName.toLowerCase () + "@" + department + "." + companySuffix;
        //System.out.println ("your email is: " + email);

    }
    // ask for the department

    private  String setDepartment(){
        System.out.print("New worker:" + firstName + " " + "DEPARTMENT CODES:\n1 for sales\n2 for development\n3 for Accounting\n0 for none\n enter department code:");
        Scanner in = new Scanner ( System.in );
        int depChoice = in.nextInt ();
        if (depChoice == 1 ){ return  "sales";}
        else if (depChoice ==2){return "dev";}
        else  if (depChoice == 3){return  " acct";}
        else {return "";}


    }
    //generate a random password
    private  String randomPassword(int length){
        String passwordSet ="ABSCHFGFHS%$@987710991986GGFJ";
        char[] password = new  char[length];
        for ( int i = 0; i < length; i++){
           int rand = (int) (Math.random () * passwordSet.length ());
          password[i] = passwordSet.charAt ( rand );

        }
        return new String ( password );
    }
    //set a mailbox capacity
    public  void  setMailboxCapacity(int capacity){
        this.mailboxCapacity = mailboxCapacity;
    }
    //set the alternate email
    public void  setAlternateEmail(String alternateEmail){
        this.alternateEmail= alternateEmail;
    }
    //change the password

    public  void  ChangePassWord(String passWord){
        this.passWord = passWord;

    }
    public  int getMailboxCapacity(){return  mailboxCapacity;}
    public  String getAlternateEmail(){return  alternateEmail;}
    public String getPassword(){return passWord; }

    public  String showInfo(){
        return " DISPLAY NAME:" + firstName + " " + lastName +
                "\nCOMPANY EMAIL:" + email +
                "\nMAILBOX CAPACITY:" + mailboxCapacity + " " + "500mb";
    }



    }

