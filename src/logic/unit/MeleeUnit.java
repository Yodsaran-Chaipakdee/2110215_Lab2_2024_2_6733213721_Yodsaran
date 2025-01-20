package logic.unit;

public class MeleeUnit extends BaseUnit {
	  
	public MeleeUnit(int column, int row, boolean isWhite, String name) {
	        super(column, row, isWhite, name);
	        this.hp = 5;
	        this.power = 2;
	        this.isFlying = false;
	    }
	}
