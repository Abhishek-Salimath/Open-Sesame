import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);		
		//Door d1= new Door(1);		
		//d1.setOpen(true);
		//d1.setTreasure(new Treasure(10000));
		//System.out.println(d1);			
		//p1.chooseDoor(c);
		//System.out.println(p1);
		Game g=new Game(3);
		//Object p=new ConsolePlayer("ace");
		//Player p1=(Player)p;
		//System.out.println(p instanceof Treasure);
		g.start();
		
		}
	}