/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Controller.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ahernand <ahernand@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/11/03 17:45:59 by ahernand          #+#    #+#             */
/*   Updated: 2025/01/03 15:24:29 by ahernand         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Controller;

import Hero.Hero;
import Model.Model;
import View.View;
import Controller.States;
import Controller.GameController;
import View.MyFrame;

public class Controller {

	/*
	** Parameters
	*/
 
	public View view;
	private Model model;
	public States currentState;








	/*
	** M E T H O D S
	*/

	public Controller(String GUI) {

		// Initialize classes
		view = new View(this, GUI.equalsIgnoreCase("gui") ? true : false);
		model = new Model();
	}

	public Controller(boolean GUI, boolean active, MyFrame frame) {

		// Initialize classes
		view = new View(this, GUI, active, frame);
		model = new Model();
	}










	/*
	**  C O N S T R U C T O R S 
	*/

	public void startGame() {
		currentState = States.STARTGAME;
		view.startGame();
	}

	public void loadSave() {
		currentState = States.LOADSAVE;
		view.loadSave();
	}

	public void setHeroName() {
		currentState = States.SETHERONAME;
		view.setHeroName();
	}

	public void setHeroClass() {
		currentState = States.SETHEROCLASS;
		view.setHeroClass();
	}





	/*
	**  Communicate with model to create hero before starting game
	*/

	public Hero createHeroController(String Class, String name) {
		return model.ctNewHero(Class, name);
	}

	public void saveHero(Hero pHero) {
		model.saveHero(pHero);
	}





	/*
	**  Starting game
	*/

	public void goToGame() {
		new GameController(model.getHero(), view.getGUIOnOff(), view.getFrame(), view.getActive(), this);
	}










	/*
	** S A V E     S T A T E 
	*/

	public void StateSwitcher() {

		view.closeWindows();

		switch (currentState) {
			case STARTGAME:
				startGame();
				break;
			case LOADSAVE:
				loadSave();
				break;
			case SETHERONAME:
				setHeroName();
				break;
			case SETHEROCLASS:
				setHeroClass();
				break;
		}
	}
}