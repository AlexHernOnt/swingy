/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   GameModel.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ahernand <ahernand@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/11/29 19:49:26 by ahernand          #+#    #+#             */
/*   Updated: 2024/12/02 21:47:30 by ahernand         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Model;

import Hero.Hero;
import Model.GameMap;

public class GameModel {

	/*
	**		V A R I A B L E S
	*/

	private Hero hero;
	private GameMap map;










	/*
	**		C O N S T R U C T O R
	*/

	public GameModel(Hero pHero) {
		hero = pHero;
		map = new GameMap(hero.getLevel());
		map.placeHero(pHero);
	}

	public Hero getHero() {
		return hero;
	}

	public GameMap getMap() {
		return map;
	}
}