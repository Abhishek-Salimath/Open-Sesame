class Shining{
	String shine="high";
	public void foo(){
			System.out.println("foo foo");
		}
	}
public class Treasure extends Shining{
	String shine="low";
	private int value;
	@Override
	public String toString(){
		return ""+value;
		}
	void foo(String s){
			System.out.println("tres foo "+s);
		}
	public int getValue(){
		return value;
	}
	
	public Treasure(int value){
		setValue(value);
	}
	public void setValue(int value){
		this.value=value;
	}
}