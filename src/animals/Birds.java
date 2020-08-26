package animals;

public class Birds extends Animal
{
  // private String name;
  // private int yearNamed;
  
  public Birds(String name, int yearNamed)
  {
    super(name, yearNamed);
    // this.name = name;
    // this.yearNamed = yearNamed;
  }
  @Override
  public String move()
  {
    return "Fly";
  }
  @Override
  public String breath()
  {
    return "Lungs";
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