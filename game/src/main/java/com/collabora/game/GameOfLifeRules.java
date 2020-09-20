package com.collabora.game;

public class GameOfLifeRules {
	
	public static final int ALIVE =1;
	
	public static final int DEAD =0;
	
	enum State{ALIVE,DEAD};
	
	public State nextState(final State currentState, int neighbours) {
		
		State nextState = currentState;
	
			if(currentState == State.ALIVE) {
				
				if(neighbours < 2 || neighbours >3) {
					
					nextState =State.DEAD;
					
				}				
			} 
			
			else {
				
				if(neighbours == 3 ) {
					
					nextState = State.ALIVE;
				}
				
				
				
			}
		
		
		return nextState;
		
	}
	
	

}
