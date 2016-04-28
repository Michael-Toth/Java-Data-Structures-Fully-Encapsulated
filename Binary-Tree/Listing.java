import javax.swing.JOptionPane;

public class Listing
{ private String name;  // key field
   private String id;
   private String gpa;
   public Listing(String n, String a, String num )
  {  name = n;
      id = a;
      gpa = num;
  }
   public Listing( )
  {  name = null;
      id = "";
      gpa = "";
  }
  
   public String toString( )
   {   return("Name is " + name +
                    "\nidentification number is " + id +
                    "\ngrade point averages is " + gpa + "\n");
                    
   }
   public Listing deepCopy( )
   {  Listing clone = new Listing(name, id, gpa);
      return clone;
   }
   
   public void input()
   {//String ids;
   name = JOptionPane.showInputDialog("Please enter a name");
   id = JOptionPane.showInputDialog("Please enter an id");
    gpa = JOptionPane.showInputDialog("Please enter an G.P.A");

   //id = Integer.parseInt(ids);
   
   }

   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }
   public void setid(String a) // coded to demonstrate encapsulation
   {  id = a;
   }
   public String getKey()
   {   return name;
   }
 }// end of class Listing

