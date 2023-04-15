package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 *
 * @author Tammy Hartline
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	//holds the next player id
	private static long nextPlayerId = 1;
	//holds the next team id
	private static long nextTeamId = 1;


	// FIXME: Add missing pieces to turn this class a singleton

	private static GameService gameInstance;
	private GameService() {
		//private constructor to avoid duplicate instances.
	}
	//public accessor for singleton class
	public static GameService getInstance() {
		//check if instance exists
		if (gameInstance == null) {

			//then add gameInstance
			gameInstance = new GameService();
			System.out.println("A New Game Service Instance Was Created.");

		}
		//else game instance already exists
		else {
			System.out.println("Game Service Instance Already Exists.");
		}

		return gameInstance;
	}
	/**
	 * Construct a new game instance
	 *
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name


		for(int i = 0; i < getGameCount(); i++) {

			if (name.equalsIgnoreCase(games.get(i).getName())) {
				game = games.get(i);
			}
		}
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}
			return game;
		}

		Game getGame(int i) {
			return games.get(i);
		}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param id position in the list to return
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		Game game = null;

	 /**
	 * Returns the game instance with the specified id.
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
		// FIXME: Use iterator to look for existing game with same id
	for (int i = 0; i < getGameCount(); i++) {

		if (games.get(i).getId() == id) {

			game = games.get(i);
		}
	}
	return game;
	}
	/**
	 * Returns the game instance with the specified name.
	 *
	 * @param name unique name of game to search for
	 * @return requested game instance
	*/
	public Game getGame(String name) {

		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		for (int i = 0; i < getGameCount(); i++) {
			if (name.equalsIgnoreCase(games.get(i).getName())) {
				//if game exists
				game = games.get(i);
			}
		}
		return game;
	}
	/**
	 * Returns the number of games currently active
	 *
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	/*
	*Did not use, but may be needed later.
	*
	*public long getNextPlayerId() {
	*	return nextPlayerId++;
	*}
	*public long getNextTeamId() {
	*	return nextTeamId++;
	*}
	*
	 */
}
