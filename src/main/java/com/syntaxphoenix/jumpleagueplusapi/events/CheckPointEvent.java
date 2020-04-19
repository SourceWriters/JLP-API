package com.syntaxphoenix.jumpleagueplusapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * The CheckPointEvent is called, when a player reaches a checkpoint
 * 
 * @author Sebastian Diers
 * @version 1.0
 *
 */
public class CheckPointEvent extends Event implements Cancellable {
	
	public static HandlerList handlers = new HandlerList();
	
	private boolean cancelled = false;
	private Player player;
	private int checkpoint;
	
	public CheckPointEvent(Player player, int checkpoint) {
		this.player = player;
		this.checkpoint = checkpoint;
	}

	/**
	 * Get Player reaching checkpoint
	 * 
	 * @return Player interacting with checkpoint
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Get checkpoint(number) reached by user
	 * 
	 * @return number of checkpoint(1-10)
	 */
	public int getCheckpoint() {
		return checkpoint;
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
