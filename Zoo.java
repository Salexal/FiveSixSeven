
/*
@author    created by xxxx
@problem    
@time      D.M.Y
*/



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
		System.out.print(name+": "+eat+" "+cry);
	}
	public static void main(String[] args) {
		Dog dog = new Dog("xiaogou", "¹ÇÍ·", "wang!wang!",3);
		dog.print();
		Cat cat = new Cat("xiaomao", "Óã", "ß÷£¡",5);
		cat.print();
		Fish fish = new Fish("xiaoyu", "Ë®Ôå", "à£à£à£!","blue");
		fish.print();
	    Rabiit rabiit = new Rabiit("xiaotu", "²Ý", "×ÔÐÐÄÔ²¹!","tiaotiaotiao");
		rabiit.print();
	}

}
