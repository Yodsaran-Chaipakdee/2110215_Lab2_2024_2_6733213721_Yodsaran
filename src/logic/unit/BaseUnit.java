package logic.unit;

import java.util.ArrayList;
import java.util.Objects;

public class BaseUnit {
	
	public int row;
	public int column;
	public boolean isWhite;
	public String name;
	public int hp;
	public int power;
	public boolean isFlying;
	
	public BaseUnit(int column, int row, boolean isWhite, String name) {
		super();
		this.row = row;
		this.column = column;
		this.isWhite = isWhite;
		this.name = name;
		this.hp = 2;
		this.power = 1;
		this.isFlying = false;
	}

	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public boolean isFlying() {
		return isFlying;
	}


	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}


	@Override
	public int hashCode() {
		return Objects.hash(column, hp, power, row);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseUnit other = (BaseUnit) obj;
		return column == other.column && hp == other.hp && power == other.power && row == other.row;
	}
	
	public boolean move(int direction) {
	    switch (direction) {
	        case 0: row--; break; 
	        case 1: row++; break; 
	        case 2: column--; break;
	        case 3: column++; break; 
	        default: return false; 
	    }
	    return true;
	}
	
	public void attack(ArrayList<BaseUnit> targetPieces) {
	    for (BaseUnit target : targetPieces) {
	       
	        if (!target.isFlying && target.getRow() == this.row && target.getColumn() == this.column) {
	          
	            target.setHp(target.getHp() - this.power);
	            
	          
	            System.out.println(this.getName() + " attacks " + target.getName() + "!");
	        }
	    }
	}
  
	
	
	
	
	
}
