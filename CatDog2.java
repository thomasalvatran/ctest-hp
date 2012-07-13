//Base: Animal CatDog is derived 
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

 
abstract class Animal {
	public String name;
        abstract String talk();
        abstract String getName();
}
 
// from file Cat.java

 

class Cat extends Animal {
		
        public String talk() {
                return "Meow";
        }
        public String getName(){return "Cat";}
}
 
 
class Dog extends Animal {
		
        public String talk() {
                return "talk Arf! Arf!";
        }
        public String getName(){return "Dog";}
}
 
// from file PolymorphismExample.java


 
public class CatDog2 {
 
        public static void main(String[] args) {
        String animal_name;
                Collection<Animal> animals = new ArrayList<Animal>();
                animals.add(new Cat());
                animals.add(new Dog());
 
                for (Animal a : animals) {
                        System.out.println(a.getName()+" "+a.talk() );
                }
        }
 
}
 
// When you run this, the output is:
// Cat says Meow!
// Dog says Woof! Woof!
