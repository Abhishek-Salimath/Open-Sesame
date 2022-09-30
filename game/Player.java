import java.util.Scanner;
abstract class Player{
	abstract public void foo();
	abstract public void chooseDoor(); 
	protected int chosenDoorNum=-1;
	private String name;
	
	public int getChoice(){
		return chosenDoorNum;
		}
	public void setChoice(int choice){
		this.chosenDoorNum=choice;
		}		

	public Player(String name){
		this.name=name;		
		}
	@Override
	public String toString(){
		return "name: "+name+"\nchoice= "+chosenDoorNum; 
		}
		
	
}