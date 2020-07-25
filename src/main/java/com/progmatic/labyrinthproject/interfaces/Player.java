package com.progmatic.labyrinthproject.interfaces;

import com.progmatic.labyrinthproject.enums.Direction;

/**
 *
 * @author csaba
 */
public interface Player {

    /**
     * Returns the player's next move.
     * This method should not modify the parameter l.
     * @param l
     * @return the player's next move. The returned cell should be an EMTPY cell within l.
     * If the player has arrived on the END cell, it should return null.
     */
    Direction nextMove(Labyrinth l);

}