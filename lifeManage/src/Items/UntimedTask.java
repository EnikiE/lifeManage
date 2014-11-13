package Items;

public class UntimedTask extends Item{

	public UntimedTask(String name, String desc) {
		this.name  = name;
		this.description = desc;
	}
	
	public String toString(){
		return this.name + "\t" + this.description;
	}
	
}
