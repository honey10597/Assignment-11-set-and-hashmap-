

import java.util.*;

public class q1_set{

	public static void main(String[] args) {
		
		
		 List<employee> e=new java.util.ArrayList<>();
		  int i=0;
		 
		     Set<employee> sh=new TreeSet<>();
		     Set<employee> sh2=new TreeSet<>();
 
		      for(i=1;i<=5;i++)
		      {
		        sh.add(new employee(i*10));
		      }
		      
		      for(i=1;i<=5;i++)
		      {
		        sh2.add(new employee(i*5));
		      }

		      sh.retainAll(sh2);   // ONLY SAME ELEMENTS OF TWO SET ARE RETAIN
		      
		      for(employee em2:sh)
		      {
		    	  System.out.print(em2.getid()+" ");
		      }
		      
		      
		      
	}

}



class employee implements Comparable
{
  int id;
  
  employee()
  {
    this.id=-999;
  }
  employee(int id)
  {
    this.id=id;
  }
  public void setid(int id)
  {
    this.id=id;
  }
  public int getid()
  {
    return id;
  }
  public boolean equals(Object o)
  {
    employee e=(employee) o;
    if(id==e.getid())
    return true;
    else 
    return false;
  }

  public int compareTo(Object o)
  {
    employee ec=(employee) o;
    if(id==ec.getid())
    return 0;
    else if(id>ec.getid())
    return 1;
    else return -1;
  } 


}
