class Chick implements Animal 
{     
  private String myType;     
  private String[] mySound = new String[2];      
  public Chick(String type, String sound1, String sound2)    
  {         
    myType = type;         
    mySound[0] = sound1; 
    mySound[1] = sound2;    
  }     
  public Chick()   
  {         
    myType = "unknown";         
    mySound[0] = "unknown";
    mySound[1] = "unknown";     
  }      
  public String getSound()
  {
  	if((int)(Math.random()*2) == 0)
  	{
  	  return mySound[0];
  	}
  	else
  	{
  	  return mySound[1];
  	}
  }     
  public String getType()
  {
  	return myType;
  }
}