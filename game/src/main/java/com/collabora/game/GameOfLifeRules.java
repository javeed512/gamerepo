package com.collabora.game;




public class GameOfLifeRules {

	

	enum State {
		ALIVE, DEAD
	};

	public State nextState(final State currentState, final int neighbours) {

		State nextState = currentState;

		if (currentState == State.ALIVE) {

			if (isCellUnderPopulated(neighbours) || isCellOverPopulated(neighbours)) {

				nextState = State.DEAD;

			}
		}

		else {

			if (isCellRestorable(neighbours)) {

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
