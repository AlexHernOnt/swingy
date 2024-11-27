/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   App.java                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ahernand <ahernand@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/11/01 18:54:10 by ahernand          #+#    #+#             */
/*   Updated: 2024/11/25 17:10:08 by ahernand         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package swingy;

import Controller.Controller;

/*
** Hello world!
*/


public class App 
{

	public static void main(String[] args )
	{
		Controller controller = new Controller();

		controller.presentGame();
	}
}