
public class Animal {
String name;
int id;
	public Animal(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public void hello() {
		System.out.print("Animal!!!");
	}
}



class Cat extends Animal {
String sub;
	public Cat(String name, int id, String sub) {
		super(name, id);
		this.sub=sub;
		
	}
	
}
