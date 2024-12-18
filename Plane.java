public class Plane
{
  // implement the Plane class here

  private int location;
  private 

  public Plane(){
    location = 1000;
  }

  public Plane(int loc){
    if((loc >= -2000) || (loc >= 2000)){
      this.location = loc;  
    }
  }


  public void upward(){
    if(location >= 2000){
      System.out.print("Can no longer fly higher");
    }
    else{
      location += 100;
    }
    
  }

  public void downward(){
    if(location >= -2000){
      System.out.print("Can no longer fly higher");
    }
    else{
      location -= 100;
    }    
  }

  public int getLocation(){
    return location;
  }


  public String toString(){
    return ("The plane is @ " + location);
  }

}
