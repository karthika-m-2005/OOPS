class Animal
  {
    void Sound()
    {
      System.out.println("Animals Makes Sounds!");
    }
  }

  class Dog extends Animal
  {
    void sound()
    {
       System.out.println("Dog Barks!");
    }
  }
class Overriding
  {
    public static void main(String[] args)
    {
      Animal animal = new Animal();
      animal.sound();
      Dog dog = new Dog();
      dog.sound();
    }
  }
      
