import java.util.Random;
import java.util.Scanner;
class Game{
	private Player p=new Consoleplayer("ace");
	private Door[] doors;
	private Door treasureDoor;
	private void showDoors(){
		for(Door d:doors)
			System.out.print(d+" ");
	}
	private void assignTreasure(){
		Random r= new Random();
		int index=r.nextInt(doors.length);
		treasureDoor=doors[index];
		treasureDoor.setTreasure(new Treasure(1000));
	}
	public Game(int numDoors){
		doors=new Door[numDoors];
		for(int i=0;i<numDoors;i++)
			doors[i]=new Door(i+1);
	}
	public void start(){		
		assignTreasure();
		showDoors();		
		System.out.print("Choose a door");
		p.chooseDoor();
		Door d=getDoor();
		d.setOpen(true);
		showDoors();
		char change=changeChoice();
		if(change=='Y'){
			int doorNum=changeDoor();
			p.setChoice(doorNum);
			}		
		openDoors();
		showDoors();
		showMessage();
		
	}
	private Door getDoor(){
		for(Door d:doors)
			if(d.getNum()!=p.getChoice()&&d!=treasureDoor)
				return d;
		return null;					
	}
	private char changeChoice(){
		System.out.println("Do you want to change? Y/N");
		Scanner s=new Scanner(System.in);
		return s.next().charAt(0);
	}
	private int changeDoor(){
		for(Door d:doors){
			if(d.getNum()!=p.getChoice()&&!d.getOpen())
				return d.getNum();
			}
	return 0;
	}
	private void openDoors(){
		for(Door d:doors)
			d.setOpen(true);
	}
	private void showMessage(){
		if(treasureDoor.getNum()==p.getChoice())
			System.out.println("you win "+treasureDoor.getTreasure());
		else
			System.out.println("you lose Treasure door is "+treasureDoor.getNum());
	}
}
	