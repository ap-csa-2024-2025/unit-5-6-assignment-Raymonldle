public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  // Constructors

  public Dog(String ibreed, String iname, String icolor, double iweight){
    breed = ibreed;
    name = iname;
    color = icolor;
    weight = iweight;

    if (weight < 0){
      weight = 0;
    }
    else{
      weight = iweight;
    }

  }

  public Dog(){
    breed = "Philipee";
    name = "Tranmmy";
    color = "white";
    weight = 19;
  }

  public Dog(String ibreed){
    breed = ibreed + "saurus G. yatt";
    name = "Tranmmy";
    color = "white";
    weight = 19;
  }
  
  // Make setters
  public void setBreed(String newBreed)
  {
    breed = newBreed;
  }

  public void setWeight(double newWeight)
  {
    weight = newWeight;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public void setColor(String newColor)
  {
    color = newColor;
  }


  // Make getters
  public String getBreed()
  {
    return breed;
  }

  public double getWeight(){
    return weight;
  }

  public String getName(){
    return name;
  }

  public String getColor(){
    return color;
  }
}
 
