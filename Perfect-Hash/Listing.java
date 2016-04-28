import javax.swing.JOptionPane;
public class Listing
{ private String name;
private int id;
 
 public Listing()
{name ="";
id =0 ;
 
}

 
public Listing(String n, int a)
{name =n;
id =a;
 
}


  
public String toString()
{ return("Name is "+name+"\n"+
         "Ticket Number is "+id+"\n" );
 }
public Listing deepCopy()
 { Listing clone = new Listing(name,id );
    return clone;
    }// end deep copy
   
   public int compareTo(String targetKey)
   {
   return(name.compareTo(targetKey));
   }
   public void input()
   {String ids;
   name = JOptionPane.showInputDialog("Please enter a name");
   ids = JOptionPane.showInputDialog("Please enter an Ticket Number from 2,000 to 100,000");
   id = Integer.parseInt(ids);
   }
   Integer getId(){ return id; }
    }//end class Lisitng