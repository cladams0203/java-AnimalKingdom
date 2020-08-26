package animals;

public class Fish extends Animal
{
  // private String name;
  // private int yearNamed;
  
  public Fish(String name, int yearNamed)
  {
    super(name, yearNamed);
    // this.name = name;
    // this.yearNamed = yearNamed;
  }
  @Override
  public String move()
  {
    return "Swim";
  }
  @Override
  public String breath()
  {
    return "Gills";
  }
  @Override
  public String reproduce()
  {
    return "Eggs";
  }
  // @Override
  // public String toString()
  // {
  //   return "id=" + id + ", name = " + name + ", yearNamed = " + yearNamed;
  // }
}