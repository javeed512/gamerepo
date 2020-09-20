package com.collabora.game;

/**
 * @Description: 
 * A program to define set of rules for Game of life using TDD Approach
 *  Rules for Game of Life
 *  1. Any live cell with fewer than two live neighbors dies 
 *  2. Any live cell with more than three live neighbors dies 
 *  3. Any live cell with two or three live neighbors survive 
 *  4. Any dead cell with exactly three live neighbors comes to life/restore
 * @author : JAVEED
 * @version : 1.0
 * @Date : 20-Sept-2020
 */

public class GameOfLifeRules {

	enum State {
		ALIVE, DEAD
	};

	
	/*
	 * @Description : method to find nextState of cell based on current state and neighbours
	 * 
	 * @Author : JAVEED
	 * 
	 * @Params :  currentState (int)  and neighbours (int)
	 *  
	 * @Returns: State enum
	 * 
	 */
	
	
	public State nextState(final State currentState, final int neighbours) {

		State nextState = currentState;

		if (currentState == State.ALIVE) {

			if (isCellUnderPopulated(neighbours) || isCellOverPopulated(neighbours)) {     //here  neighbors less than 2 or more than 3 kills live cell

				nextState = State.DEAD;

			}
		}

		else {

			if (isCellRestorable(neighbours)) {   // here  exactly 3 neighbors restore dead cell

				nextState = State.ALIVE;
			}

		}

		return nextState;

	}

	private boolean isCellRestorable(final int neighbours) {

		return neighbours == 3;

	}

	private boolean isCellOverPopulated(final int neighbours) {

		return neighbours > 3;

	}

	private boolean isCellUnderPopulated(final int neighbours) {

		return neighbours < 2;

	}

}
