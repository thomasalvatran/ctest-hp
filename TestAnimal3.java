interface Animal {
	String talk();
	String getName();
}
class Cat implements Animal { //public fails only one public the same name as the file - no need abstract keyword since all interface functions
	public String name;  //have been implemented yes you can use new to initiate the object. Abstract when not complete all functions

	Cat (String name) { //must public because interface
	this.name = name;
	}
	public String getName(){
	return name;
	}
	public String talk() {   
	return "meow meow meow";
	}
}
class Dog implements Animal { // no need abstract here since all functions of interface have been implemented
	public String name;

	Dog (String name) { //must public because interface
	this.name = name;
	}
	public String getName(){
	return name;
	}
	public String talk() {
	return "arf arf arf";
	}
}
//class CatExt extends Cat {    // do this if Cat and Dog are abstract
//	CatExt(String name){
//	this.name = name;
//	}
//};
//class DogExt extends Dog {
//	DogExt(String name){
//	this.name = name;
//	}
//};
public class TestAnimal2     //name has to be in this case with or without public is ok
{
//
public static void main(String[] args){

Cat cat = new Cat("Cat");
System.out.println(cat.getName() + "  " + cat.talk());
Dog dog = new Dog("Dog");
System.out.println(dog.getName() + "  " + dog.talk());

Animal animals[] = { new Cat("NewCat"), new Dog("NewDog") };
int i=0;
for (Animal a: animals)  //java for each Loops without index otherwise (int i; i < animals.length; i++)
            {
            System.out.println(a.getName() + ": " + a.talk() + " " + i++);
            }



//System.out.println(cat.getName()+" "+cat.talk());
//System.out.println(dog.getName()+" "+dog.talk() );
//Animal1 Animal1s[] = { new Cat("Missy"), new Cat("Mr. Mistoffelees"), new Dog("Lassie") };
//Animal1[] Animal1s = new Animal1[] { new Cat("Missy"), new Cat("Mr. Mistoffelees"), new Dog("Lassie")};
}
}
