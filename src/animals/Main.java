package animals;

import java.util.List;
import java.util.ArrayList;

public class Main
{
  private static List<Animal> filterAnimals(List<Animal> animals, CheckAnimals tester)
  {
    List<Animal> templist = new ArrayList<>();
    for (Animal v : animals)
    {
      if (tester.test(v))
      {
        templist.add(v);
      }
    }
    return templist;
  }
  public static void main(String[] args)
  {
    Mammals panda = new Mammals("Panda", 1869);
    Mammals zebra = new Mammals("Zebra", 1778);
    Mammals koala = new Mammals("Koala", 1816);
    Mammals sloth = new Mammals("Sloth", 1804);
    Mammals armadillo = new Mammals("Armadillo", 1758);
    Mammals raccoon = new Mammals("Raccoon", 1758);
    Mammals bigfoot = new Mammals("Bigfoot", 2021);

    Birds pigeon = new Birds("Pigeon", 1837);
    Birds peacock = new Birds("Peacock", 1821);
    Birds toucan = new Birds("Toucan", 1758);
    Birds parrot = new Birds("Parrot", 1824);
    Birds swan = new Birds("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    List<Animal> animalList = new ArrayList<>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    animalList.sort((v1,v2) -> v2.getYear() - (v1.getYear()));
    System.out.println("\n Ordered descenting by year named");
    animalList.forEach((v) -> System.out.println(v));
    
    animalList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    System.out.println("\n Ordered alphabetically");
    animalList.forEach((v) -> System.out.println(v));

    animalList.sort((v1,v2) -> v1.move().compareToIgnoreCase(v2.move()));
    System.out.println("\n Ordered by move");
    animalList.forEach((v) -> System.out.println(v));

    List<Animal> lungsList = filterAnimals(animalList, v -> v.breath().equals("Lungs"));
    System.out.println("\n Filtered by lungs");
    lungsList.forEach((v) -> System.out.println(v));
    
    List<Animal> lungYearList = filterAnimals(animalList, v -> (v.breath().equals("Lungs")) && (v.getYear() == 1758));
    System.out.println("\n Filtered by lungs and 1758");
    lungYearList.forEach((v) -> System.out.println(v));

    List<Animal> eggLungList = filterAnimals(animalList, v -> (v.reproduce().equals("Eggs")) && (v.breath().equals("Lungs")));
    System.out.println("\n Filtered by eggs and lungs");
    eggLungList.forEach((v) -> System.out.println(v));

    List<Animal> yearList = filterAnimals(animalList, v -> v.getYear() == 1758);
    yearList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    System.out.println("\n Filtered by 1758");
    yearList.forEach((v) -> System.out.println(v));
    
  }
}