public class Door{
	private boolean open=false;
	private Treasure t;
	private int number;
	
	public boolean getOpen(){
		return open;
		}
	public void setOpen(boolean status){
		open=status;
		}
	public Treasure getTreasure(){
		return t;
		}
	public void setTreasure(Treasure t){
		this.t=t;
		}
	public Door(int number){
		this.number=number;
		}
	public int getNum(){
		return number;
		}
		
	@Override 
	public String toString(){
		if(open==true)
		return "----------\n"+
			"-----"+number+"------\n"+
			"--"+t+" --\n"+
			"--"+open+"--\n"+
			"----------\n\n"; 
		
		else
		return "----------\n"+
			"----"+number+"-----\n"+
			"-------\n"+
			"--"+t+" --\n"+
			"--"+open+"--\n"+
			"----------\n\n"; 
					
		}
	
	}
