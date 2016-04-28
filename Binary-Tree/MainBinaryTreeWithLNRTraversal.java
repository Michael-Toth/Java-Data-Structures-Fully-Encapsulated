//null pointer for new case in 2

import java.util.*;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class MainBinaryTreeWithLNRTraversal
{public static void main(String args[])
   {
   BinaryTreeWithLNRTraversal t = new BinaryTreeWithLNRTraversal();
   //Listing l;
   //int pointer = 0;
   
   
   //LinkedList dataBase = new LinkedList();
   //ListIterator i= dataBase.listIterator();
   int choice;///maybe chnage this`
  Scanner s=new Scanner(System.in);
   //intialized();
  // System.out.println("Enter the number of the students you would like to enter");

//int max=s.nextInt();
//for(int x =max; x > 0; --x) {
 
   //   Listing l= new Listing();
   //  l.input();
   //  System.out.println("max is"+max);
   //  i.add(l);
    // i.next();
     // }
 
 
while(true){
s.reset();//is this needed
System.out.println("Enter 1 to insert a new student's information");
System.out.println("Enter 2 to fetch and output a student's information");
System.out.println("Enter 3 to delete a student's information");
System.out.println("Enter 4 to update a student's information");
System.out.println("Enter 5 to output all the student's information");
System.out.println("Enter 6 to exit the program");
 
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

       Listing l  = new Listing();
      l.input();
     String neKey= l.getKey();
t.insert(l);
//      System.out.println("max is"+max);
//      i.add(l);
  
 //System.out.println("Wrong kind of input!");
 


break;
//
case 2:
//////////////
////// 
 Listing l2; 
// Listing b;
// while(i.hasPrevious())
// i.previous();
  String fetchee;
 fetchee= JOptionPane.showInputDialog("Enter a Name of Student to retrieve");
// a = (Listing)i.next(); 
// System.out.println(fetcher+"here is what your fetching");
// 
  l2  =(t.fetch(fetchee ));
  System.out.println(l2);

// while(i.hasNext()&& a!=null &&!(a.compareTo(fetcher) == 0))////made chnages to! before p.1compare
// { a = (Listing)i.next(); 
// }
// if(a.compareTo(fetcher) == 0)
//   
// System.out.println(a.toString());

/////

////////////5


break;
//
case 3:

 //Listing c; 
// 
// while(i.hasPrevious())
// i.previous();
  String fetcher2;
 fetcher2= JOptionPane.showInputDialog("Enter a Name to delete");
  t.delete(fetcher2);
// //c = (Listing)i.next(); 
// Listing c= new Listing();
// System.out.println(fetcher2+"   is who your deleting");
//  c = (Listing)i.next();
// while(i.hasNext() && c!=null &&!(c.compareTo(fetcher2) == 0))////made chnages to! before p.1compare
// { c = (Listing)i.next(); 
// }
// if(c.compareTo(fetcher2) == 0)
// i.remove();
// 
//  
// 
// 
 
 break;
/////
case 4: 
 // 
// 
// Listing z; 
  String fetcher23;
 fetcher23= JOptionPane.showInputDialog("Enter a Name to update");

 
       Listing l3  = new Listing();
      l3.input();
 t.update(fetcher23 ,l3);



 //System.out.println("\nNow updateing Ann:");
   //Listing l111 = new Listing("Ann",    " 111",  "   11.5");

 //t.update("Ann",l111);
 //t.update("Ann",l8);
  //System.out.println("This is what we fetched for Ann after update :\n"+l);
  // t.showAll();

// while(i.hasPrevious())
// i.previous();
//  String fetcher3;
// fetcher3= JOptionPane.showInputDialog("Enter a Name to update");
// z = (Listing)i.next(); 
// System.out.println(fetcher3+"here is what your update");
//  
// while(i.hasNext()&& z!=null &&!(z.compareTo(fetcher3) == 0))////made chnages to! before p.1compare
// { z = (Listing)i.next(); 
// }
// if(z.compareTo(fetcher3) == 0)
// // a.deepCopy();
// 
//  
//  {
//  i.remove();
// z.input();
// i.add(z);
// //i.set(z.input());
// }
//  
// 
// 

break;
case 5:
t.showAll();
// 
// while(i.hasPrevious())
// i.previous();
// Listing d;
// 
// 
// while(i.hasNext()!=false)///continue to transsvers the list
// 
// 
//  
// 
// { d = (Listing)i.next();
// System.out.println(d.toString());
// } 
//  
break;
case 6: exit(0);

//case 7:// 
// 
// Listing c7= new Listing();
// while(i.hasPrevious())
// i.previous();
// 
//   System.out.println("increase GPA's by how much");
// int x;
//  
//   x = s.nextInt();
//        s.reset();
// 
// while(i.hasNext()!=false)///continue to transsvers the list
//  {
// c7 = (Listing)i.next();
// String numbers;
// numbers = c7.getGPA(); 
//  //System.out.println(c7.toString()); 
// int y = Integer.parseInt(numbers);
// int settingnewgpa =x+y;
//  
// c7.setGPA(Integer.toString(settingnewgpa));      
// }
break;
}
  
}
}//main
}//class5