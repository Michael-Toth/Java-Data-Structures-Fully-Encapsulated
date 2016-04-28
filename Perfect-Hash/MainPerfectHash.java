 

import static java.lang.System.exit;
import java.util.Scanner;
import javax.swing.JOptionPane;
 import java.util.InputMismatchException;
 
public class MainPerfectHash
{   public static void main(String[] args)
{
PerfectHash TicketDataBase = new PerfectHash();
int choice;///maybe chnage this`
  Scanner s=new Scanner(System.in);
 
 s.reset(); 
while(true){
s.reset(); 
System.out.println("Enter 1 to insert a new Ticket");
System.out.println("Enter 2 to fetch and Ticket");
System.out.println("Enter 3 to delete a Ticket");
System.out.println("Enter 4 to update a Ticket");
System.out.println("Enter 5 to exit the program");
//System.out.println("Enter your choice");
//vaildeinting correct input

   choice =0;
    s.reset();
    System.out.print("Enter your choice: ");
    try {
       choice = s.nextInt();
       
    }
    catch(InputMismatchException e) {
        System.out.println("Wrong kind of input!");
       s.nextLine();
       s.reset();
        //choice = s.nextInt();
       //  
    }


  




//
switch(choice)
{
case 1:
 //System.out.println("Enter a ticket number");
 //int tcktNum;
  //tcktNum = s.nextInt();
 
 
      Listing l= new Listing();
     l.input();
  int id=l.getId();
     //System.out.println("max is"+max);
     TicketDataBase.insert(l,id); 
    
 //System.out.println("Wrong kind of input!");
 


break;
//
case 2:
//////////////
////
  System.out.println("Enter a ticket number from 2,000 to 100,000 to fetch");
 int tcktNumToFetch;
  tcktNumToFetch = s.nextInt();
  System.out.println(TicketDataBase.fetch(tcktNumToFetch));
/////

////////////

break;
//
case 3:
 

  System.out.println("Enter a ticket number from 2,000 to 100,000 to delete");
 int tcktNumToD;
  tcktNumToD = s.nextInt();
   System.out.println("inside case ticket number before preprocess"+tcktNumToD);
TicketDataBase.delete(tcktNumToD);


 break;
/////
case 4:  
 System.out.println("Enter a ticket number from 2,000 to 100,000 to update");
 int tcktNumToUpdate;
  tcktNumToUpdate = s.nextInt();
TicketDataBase.update(tcktNumToUpdate);
 
break;
case 5:
 
  exit(0);
}
  
}
}
  
}
