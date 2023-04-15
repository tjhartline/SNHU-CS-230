package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 *
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 *
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	//long id; now needs to be included in constructor
	//String name; now needs to be included in constructor

	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	//Add private list based on UML
	private List<Team> teams = new ArrayList<Team>();

	//Add constructor with id and name
	public Game(long id, String name){

		super(id, name);

	}
	//Iterator to ensure unique name and id  for team list constraint is met
	public Team addTeam(String name) {

		//create local instance
		Team team = null;

		//instance iterator
		Iterator<Team> teamsIterator = teams.iterator();

		//While teams has next
		while (teamsIterator.hasNext()) {

			//Set local variable for next item in list
			Team teamInstance = teamsIterator.next();

			//if team name is already in system
			if (teamInstance.getName().equalsIgnoreCase(name)) {
				team = teamInstance;
			}

			else {

				teams.add(team);
				//when no instance of team name is found, it can be added
			}
		}

		return team;		//then return team
	}

	@Override
	public String toString() {

		return "Game[id =" + super.getId() + ", name = " + super.getName() + "]";
		}

}
