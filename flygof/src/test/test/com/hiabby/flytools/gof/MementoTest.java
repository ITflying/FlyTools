package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.memento.GameMementoExecute;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/28
 **/
public class MementoTest {
    @Test
    public void test_memento() {
        GameMementoExecute game = new GameMementoExecute("jack");
        game.runGame();
        game.quitGame();

        game.runGame();
        game.quitGame();

        game.loadTask(1);
        game.runGame();
    }
}
