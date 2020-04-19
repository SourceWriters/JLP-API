package com.syntaxphoenix.jumpleagueplusapi.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * GameStartEvent is called, when the Game should start. 
 * If not cancelled the game will start after the GameStartEvent and will move from Lobby-State to InGame.
 * 
 * @author Sebastian Diers
 * @version 1.0
 *
 */
public class GameStartEvent extends Event implements Cancellable {
	
	public static HandlerList handlers = new HandlerList();
	
	private boolean cancelled = false;
	private int users;

	public GameStartEvent(int users) {
		this.users = users;
	}

	/**
	 * Get number of players on game-start
	 * 
	 * @return Returns count of users, which would play the game
	 */
	public int getUsers() {
		return users;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
}
