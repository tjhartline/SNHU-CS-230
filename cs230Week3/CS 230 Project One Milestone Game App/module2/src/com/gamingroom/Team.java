package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	//long id; should now be included in the constructor
	//String name; should now be included in the constructor

	//create Player list
	private List<Player> players = new ArrayList<Player>();

	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {

		super(id, name);

	}

	public Player addPlayer(String name) {

		//create team local instance
		Player player = null;

		//Iterate instance
		Iterator<Player> playersIterator = players.iterator();

		//start iteration
		while (playersIterator.hasNext()) {

			//set player variable to next list item
			Player playerInstance = playersIterator.next();

			//check that player  name does not already exist
			if (playerInstance.getName().equalsIgnoreCase(name)) {

				player = playerInstance;	//player name taken

			}

			else {

				//player name is not taken and can be added
				players.add(player);
			}
		}

		return player;

	}

	@Override //overrides method in entity
	public String toString() {

		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";

	}
}
