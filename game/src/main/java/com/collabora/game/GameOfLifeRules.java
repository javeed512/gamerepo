package com.collabora.game;

public class GameOfLifeRules {
	
	public static final int ALIVE =1;
	
	public static final int DEAD =0;
	
	
	public int nextState(int cell, int neighbours) {
		
	
			int val = cell;
			if(cell == ALIVE) {
				
				if(neighbours < 2 || neighbours >3) {
					
					val =DEAD;
					
				}				
			}
		
		
		return val;
		
	}
	
	

}
