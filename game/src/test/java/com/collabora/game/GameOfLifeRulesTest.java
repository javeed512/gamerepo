package com.collabora.game;

import static com.collabora.game.GameOfLifeRules.ALIVE;
import static com.collabora.game.GameOfLifeRules.DEAD;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeRulesTest {

	public static final int ONE_NEIGHBOUR = 1;
	public static final int TWO_NEIGHBOURS = 2;
	public static final int THREE_NEIGHBOURS = 3;
	public static final int FOUR_NEIGHBOURS = 4;

	
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
	
	
	
	private int liveCellWith(int neighbours) {

		return new GameOfLifeRules().nextState(ALIVE, neighbours);

	}

	

	private int deadCellWith(int neighbours) {

		return new GameOfLifeRules().nextState(DEAD, neighbours);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
