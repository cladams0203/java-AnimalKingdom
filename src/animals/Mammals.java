package animals;

public class Mammals extends Animal
{
  // private String name;
  // private int yearNamed;
  
  public Mammals(String name, int yearNamed)
  {
    super(name, yearNamed);
    // this.name = name;
    // this.yearNamed = yearNamed;
  }
  @Override
  public String move()
  {
    return "Walk";
  }
  @Override
  public String breath()
  {
    return "Lungs";
  }
  @Override
  public String reproduce()
  {
    return "Live Births";
  }
  // @Override
  // public String toString()
  // {
  //   return "id=" + id + ", name = " + name + ", yearNamed = " + yearNamed;
  // }
}
