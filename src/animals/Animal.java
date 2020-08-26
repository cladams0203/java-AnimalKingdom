package animals;

abstract class Animal
{ 
  private static int maxId = 0;
  private int food;
  private int id; 
  private int yearNamed;
  private String name;
  public Animal(String name, int yearNamed)
  {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
    this.food = 1;
    
  }
  abstract String move();
  abstract String breath();
  abstract String reproduce();
  void consume()
  {
    food++;
  }
  public String getName()
  {
    return name;
  }
  public int getYear()
  {
    return yearNamed;
  }
  public int getId()
  {
    return id;
  }
  @Override
  public String toString()
  {
    return "id=" + id + ", name = " + name + ", yearNamed = " + yearNamed;
  } 

}