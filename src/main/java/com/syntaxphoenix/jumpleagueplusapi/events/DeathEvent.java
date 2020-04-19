package com.syntaxphoenix.jumpleagueplusapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * The DeathEvent is triggered when a player dies in the DeathMatch
 * 
 * @author Sebastian Diers
 * @version 1.0
 */
public class DeathEvent extends Event implements Cancellable {
	
	public static HandlerList handlers = new HandlerList();
	
	private boolean cancelled = false;
	private Player player;
	private Player killer;
	private int lives;
	
	public DeathEvent(Player player, Player killer, int lives) {
		this.player = player;
		this.killer = killer;
		this.lives = lives;
	}
	
	/**
	 * Get Player who died
	 * 
	 * @return The dead player
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
	 * Get Player who killed another player
	 * 
	 * @return The killing player
	 */
	public Player getKiller() {
		return killer;
	}
	
	/**
	 * Get remaining lives of dead player
	 * 
	 * @return The number of remaining lives
	 */
	public int getLives() {
		return lives;
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
