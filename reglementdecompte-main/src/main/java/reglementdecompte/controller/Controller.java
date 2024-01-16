package reglementdecompte.controller;

import reglementdecompte.model.Model;
import reglementdecompte.view.View;

/**
 *
 * @author alecw
 */
public class Controller {

    private Model game;
    private View view;

    /**
     * The manufacturer initializes a new controller
     *
     * @param model the interface model of the game
     * @param view the game view interface
     */
    public Controller(Model model, View view) {
        this.game = model;
        this.view = view;
    }

    /**
     * It is this method that will drive the game as a whole.
     *
     */
    public void play() {

    }
}
