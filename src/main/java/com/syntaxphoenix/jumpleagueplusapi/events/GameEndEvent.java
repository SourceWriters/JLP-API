package com.syntaxphoenix.jumpleagueplusapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * GameEndEvent is called when the games determines the winner.
 * 
 * @author Sebastian Diers
 * @version 1.0
 *
 */
public class GameEndEvent extends Event implements Cancellable {
	
	public static final HandlerList handlers = new HandlerList();
	
	private boolean cancelled;
	private Player winner;
	
	public GameEndEvent(Player winner) {
		this.cancelled = false;
		this.winner = winner;
	}

	/**
	 * Get Winner of the game
	 * 
	 * @return Winner of the game
	 */
	public Player getWinner() {
		return winner;
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
