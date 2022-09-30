import java.util.Scanner;
class Consoleplayer extends Player{
	public Consoleplayer(String name){
		super(name);
		}
	public void chooseDoor(){
		Scanner s=new Scanner(System.in);
		System.out.println("\nenter choice:");
		int c=s.nextInt();
		chosenDoorNum=c;
		}
	@Override
	public void foo(){
		System.out.println("foo foo");
	}
}