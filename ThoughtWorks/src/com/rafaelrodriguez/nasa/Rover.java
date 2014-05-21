/**
 * 
 */
package com.rafaelrodriguez.nasa;

import java.util.List;

import com.rafaelrodriguez.nasa.*;

/**
 * @author rafase282
 *
 */
public class Rover {
	
	private static int topRightX;
	private static int topRightY;
	private int xCoordinate;
	private int yCoordinate;
	private char cardinalPoint;
	private static int north = 0;
	private static int east = 90;
	private static int south = 180;
	private static int west = 270;
	
	
	public final static void Commands(List<String> execute) {
		System.out.println(execute);
		topRightX = Integer.parseInt(execute.get(0));
		topRightY = Integer.parseInt(execute.get(1));
		Rover rover1 = new Rover(Integer.parseInt(execute.get(2)),Integer.parseInt(execute.get(3)),execute.get(4).charAt(0));
		for (int i = 0, n = execute.get(5).length(); i < n; i++) {
		    char c = execute.get(5).charAt(i);
		    //System.out.println(c);
		    // make it move
		    RunRover(rover1, c);
		}
		System.out.println(rover1.getxCoordinate()+" "+rover1.getyCoordinate()+" " + rover1.getCardinalPoint());
		
		Rover rover2 = new Rover(Integer.parseInt(execute.get(6)),Integer.parseInt(execute.get(7)),execute.get(8).charAt(0));
		for (int i = 0, n = execute.get(9).length(); i < n; i++) {
		    char c = execute.get(9).charAt(i);
		    //System.out.println(c);
		    // make it move
		    RunRover(rover2, c);
		    
		}
		System.out.println(rover2.getxCoordinate()+" "+rover2.getyCoordinate()+" " + rover2.getCardinalPoint());
	}

	private static void RunRover(Rover rover1, char c) {
		Rover rover = rover1;
		char current = rover.getCardinalPoint();
	    if (c == 'L') {
	    	// Rotate 90 degrees to the Left
	    	int currentAngle =  GetAngle(current);
	    	currentAngle = (currentAngle - 90) % 360;
	    	char newCP = ConvertDegrees(currentAngle);
	    	rover.setCardinalPoint(newCP);

	    }
	    else if (c == 'R') {
	    	//Rotate 90 Degrees to the Right
	    	int currentAngle =  GetAngle(current);
	    	currentAngle = (currentAngle + 90) % 360;
	    	char newCP = ConvertDegrees(currentAngle);
	    	rover.setCardinalPoint(newCP);
	    }
	    else if (c == 'M') {
	    	//Move forwards one unit
	    	if (rover.getCardinalPoint() == 'N') {
	    		int y = rover.getyCoordinate();
	    		rover.setyCoordinate(y+1);
	    	}
	    	else if (rover.getCardinalPoint() == 'E') {
	    		int x = rover.getxCoordinate();
	    		rover.setxCoordinate(x+1);
	    	}
	    	else if (rover.getCardinalPoint() == 'S') {
	    		int y = rover.getyCoordinate();
	    		rover.setyCoordinate(y-1);
	    	}
	    	else {
	    		int x = rover.getxCoordinate();
	    		rover.setxCoordinate(x-1);
	    	}
	    }
	    else {
	    	System.err.println("Error: wrong Command, Only L,R,M are accepted!");
	    }
		
	}

	private static char ConvertDegrees(int currentDegree) {
		char newCardinalP;
		if (currentDegree == 0) {
			return newCardinalP = 'N';
		}
		else if (currentDegree == 90) {
			return newCardinalP = 'E';
		}
		else if (currentDegree == 180) {
			return newCardinalP = 'S';
		}
		return newCardinalP = 'W';
		
	}

	private static int GetAngle(char angle) {
		
		if (angle == 'N') {
			return north;
		}
		else if (angle == 'E') {
			return east;
		}
		else if (angle == 'S') {
			return south;
		}
		return west;
	}

	public Rover(int x, int y, char c) {
		this.xCoordinate = x;
		this.yCoordinate = y;
		this.cardinalPoint = c;
	}
	
	/**
	 * @param xCoordinate the xCoordinate to set
	 */
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	/**
	 * @param yCoordinate the yCoordinate to set
	 */
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	/**
	 * @param cardinalPoint the cardinalPoint to set
	 */
	public void setCardinalPoint(char cardinalPoint) {
		this.cardinalPoint = cardinalPoint;
	}

	/**
	 * @return the xCoordinate
	 */
	public int getxCoordinate() {
		return xCoordinate;
	}

	/**
	 * @return the yCoordinate
	 */
	public int getyCoordinate() {
		return yCoordinate;
	}

	/**
	 * @return the cardinalPoint
	 */
	public char getCardinalPoint() {
		return cardinalPoint;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		try {
			String filename = args[0];
			List<String> execute = ReadFile.makeInputArray(filename);
			Commands(execute);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: Please enter the file name!");
		}

	}



}
