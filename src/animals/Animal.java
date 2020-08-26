package animals;

abstract class Animal
{ 
  protected int maxId = 0;
  public int food;
  public int id; 
  public Animal()
  {
    maxId++;
    id = maxId;
    food = 1;
    
  }
  abstract String move();
  abstract String breath();
  abstract String reproduce();
  void consume()
  {
    food++;
  }
}