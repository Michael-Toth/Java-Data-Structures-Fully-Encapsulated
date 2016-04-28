public class PerfectHash
{
private Listing[] data;
PerfectHash()
{
data = new Listing[97999];
}

int preprocess(int ticketNumber)
{int n =ticketNumber;
int pk1 = n-2000;

return pk1;}
//preprocess


//insert
public boolean insert(Listing newListing,int pk)
{ int pki=preprocess(pk);
if(pki>97999)//out of memory
return false;
else
{ 
data[pki] =newListing.deepCopy();
return true;
}
}
//fetch

public Listing fetch(int pk)
{ int pk2 =preprocess(pk) ;
if (data [pk2]!= null)
return data [pk2].deepCopy();
else
return null;
}

//dlete
public Boolean delete(int pk33)
{  int pk3 =preprocess(pk33) ;
   //System.out.println("pk33 ="+pk3);

if (data[pk3]== null)
{return false;}
 else
 {data [pk3]=null;
 return true;
 
}
}//delete
//update

public int update( int pku)
{ 

int pk3 =preprocess(pku) ;
   //System.out.println("pk3 inside update ="+pk3);

//if (pk3<=0){return -1;}

 
 
 //else
 //{//
 if(delete(pku)== false)
 {   System.out.println("Ticket not found"+pk3);

 return -1;
 }
  // 
  else 
  {Listing l= new Listing();
  
  
     l.input();
    // data[pku] =l.deepCopy();
       // System.out.println("pk3 inside update ="+pku);

   insert(l,pku);
    return pku;
 }
 
 //data [pk]=null;
 //return pku;
// }
}//update
}//class



 
 