package epic;

public enum Level { 
	HIGH(3),
	MEDIUM(2),
	LOW(1);

	private int lvlNum;
	
	//Constructor can only be private
	private Level(int num) {
		this.lvlNum = num;	
	}

	public int getlvl() {
		return this.lvlNum;
	}

	public void setlvl(int num) {
		this.lvlNum = num;
	}
}
