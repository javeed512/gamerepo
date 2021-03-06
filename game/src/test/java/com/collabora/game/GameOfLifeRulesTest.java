package com.collabora.game;

import static com.collabora.game.GameOfLifeRules.State.ALIVE;
import static com.collabora.game.GameOfLifeRules.State.DEAD;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/*
 * @Description: Test cases for Program Game of Life to test  4 basic rules of game
 * 
 * @Author: JAVEED
 * 
 * @Date: 20-Sept-2020
 *  
 */



public class GameOfLifeRulesTest {

	private static final int ONE_NEIGHBOUR = 1;
	private static final int TWO_NEIGHBOURS = 2;
	private static final int THREE_NEIGHBOURS = 3;
	private static final int FOUR_NEIGHBOURS = 4;

	private GameOfLifeRules  rules = new GameOfLifeRules();
	
	
	@Test
	public void lessThanTwoLiveNeighboursKillsLiveCell() {

		assertEquals(liveCellWith(ONE_NEIGHBOUR), DEAD);

	}

	@Test
	public void moreThanOneNeighbourLiveCellSurvives() {

		assertEquals(liveCellWith(TWO_NEIGHBOURS), ALIVE);

	}

	@Test
	public void moreThanThreeLiveNeighboursKillsLiveCell() {

		assertEquals(liveCellWith(FOUR_NEIGHBOURS), DEAD);

	}

	@Test
	public void threeNeighbourLiveCellSurvives() {

		assertEquals(liveCellWith(THREE_NEIGHBOURS), ALIVE);

	}
	
	
	
	
	
	@Test
	public void threeNeighbourRestoreDeadCellSurvives() {

		assertEquals(deadCellWith(THREE_NEIGHBOURS), ALIVE);

	}
	
	
	
	private GameOfLifeRules.State liveCellWith(int neighbours) {

		return nextState(ALIVE, neighbours);

	}

	

	private GameOfLifeRules.State deadCellWith(int neighbours) {

		return nextState(DEAD, neighbours);

	}

	private GameOfLifeRules.State nextState(GameOfLifeRules.State cellState, int neighbours) {
		
		return  rules.nextState(cellState, neighbours);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
