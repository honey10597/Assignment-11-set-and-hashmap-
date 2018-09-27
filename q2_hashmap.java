import java.util.*;

class q2_hashmap {
  public static void main(String[] args)
  {
    List<student> al=new ArrayList<>();
    Map<String,student> m=new HashMap<>();
    char ch[]={'a','b','c','d','e'};
    int i=0;
    for(i=0;i<5;i++)
    {
      m.put(Character.toString(ch[i]),new student(i*10));
    }

    for(Map.Entry<String,student> me : m.entrySet())
    {
      // String key=me.getKey();
      // student val=me.getValue();
      System.out.println(me.getKey()+" "+(me.getValue()).getid());
    }
    
    /*Set s=m.entrySet();
    Iterator it=s.iterator();
    while(it.hasNext())
    {
      Map.Entry me=(Map.Entry)it.next();
      System.out.println(me.getKey()+" "+((student)me.getValue()).getid());
    }*/
  }
}
class student
{
  private int id;
  student(){
    id=-999;
  }
  student(int id){
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
}