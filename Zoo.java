
/*
@author    created by xxxx
@problem    
@time      D.M.Y
*/

import java.awt.print.Printable;

public class Zoo {

	private String name;
	private String eat;
	private String cry;
	
	public Zoo(String name,String eat, String cry) {
		super();
		this.name = name;
		this.cry = cry;
		this.eat = eat;
	}
	
	public void print() {
		System.out.println(name+": "+eat+" "+cry);
	}
	public static void main(String[] args) {
		Dog dog = new Dog("xiaogou", "¹ÇÍ·", "wang!wang!",3);
		dog.print();
		Cat cat = new Cat("xiaomao", "Óã", "ß÷£¡",5);
		cat.print();
		Fish fish = new Fish("xiaoyu", "Ë®Ôå", "à£à£à£!",2);
		fish.print();
	    Rabiit rabiit = new Rabiit("xiaotu", "²Ý", "×ÔÐÐÄÔ²¹!",1);
		rabiit.print();
	}

}
