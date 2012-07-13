//Base: Animal CatDog is derived 
import java.util.ArrayList;
import java.util.Collection;
//import java.util.*;

 
class Animal {
	public String name,talk;
        String talk(){return talk;};
        String getName() { return name;};
}
 

class Cat extends Animal {
		
//        public String talk() {
//                return "Meow";
//        }
        //public String getName(String catName){return catName;}
        //public Cat(String string){this.name = string;}  //Constructor
        public Cat(String string, String string1){this.name = string;this.talk=string1;}
}

 
class Dog extends Animal {
		
//        public String talk() {
//                return "Arf! Arf!";
//        }
        //public String getName(String dogName){return dogName;}
        //public Dog(String string){this.name = string;}
        public Dog(String string, String string1){this.name = string;this.talk=string1;}
}

public class CatDog {
 
        public static void main(String[] args) {
        
                Collection<Animal> animals = new ArrayList<Animal>();
                animals.add(new Cat("Cat","Meow Meow"));
                animals.add(new Dog("Dog","Arf Arf Arf"));
 				animals.add(new Dog("Dog","Arffff Arf Arf"));
                for (Animal a : animals) {
                        System.out.println(a.getName()+" "+a.talk() );
                  }
//				Cat a = new Cat("Cat","Meow Meow");
//				Dog b = new Dog("Dog","Arf Arf Arf");
//				System.out.println(a.getName()+" "+a.talk() );
//				System.out.println(b.getName()+" "+b.talk() );
                }
 
}
 
// When you run this, the output is:
// Cat says Meow!
// Dog says Woof! Woof!
