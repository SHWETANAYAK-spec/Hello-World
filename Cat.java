package assignment;

public class Cat extends Animal {
	void sound() {
		System.out.println("cat is meawing");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound();
		c.breed();
		
		Dog d=new Dog();
		d.barking();
		d.breed();
	}

}
