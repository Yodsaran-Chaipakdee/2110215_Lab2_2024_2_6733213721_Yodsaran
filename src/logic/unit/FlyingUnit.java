package logic.unit;

public class FlyingUnit  extends BaseUnit{

	    public FlyingUnit(int column, int row, boolean isWhite, String name) {
	        super(column, row, isWhite, name);
	        this.hp = 2;
	        this.power = 1;
	        this.isFlying = true;
	    }

	    @Override
	    public boolean move(int direction) {
	        // Flying unit moves 2 tiles
	        switch (direction) {
	            case 0: row -= 2; break; // Move up
	            case 1: row += 2; break; // Move down
	            case 2: column -= 2; break; // Move left
	            case 3: column += 2; break; // Move right
	            default: return false; // Invalid direction
	        }
	        return true;
	    }
	

	
}
