package io.github.thebusybiscuit.slimefunorechunks;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.GitHubBuildsUpdater;

public class OreChunks extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Config cfg = new Config(this);
		new Metrics(this);
		
		if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
			new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/SlimefunOreChunks/master").start();;
		}
		
		try {
			Category category = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRlOGY5NDliYmYzYTQyNzgyYzUzMWZiZjhkZTlkYzJkOGNkODRkZDdjYjhmNWQ1MzI4ZWVkYTgzOTU2YWFjOCJ9fX0="), "&6Ore Chunks", "", "&a> Click to open"));
			
			new OreChunk(category, "IRON_ORE_CHUNK", "Iron Ore Chunk", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDRjYzFjY2M3NWQwZjcyNGFmOGE1ZmUyNzNlZGFmNGM2ZDU5NTFmOWU0ZDAzOGY5ZjE2ZTRmMjY3M2NlMzgzMyJ9fX0=", SlimefunItems.IRON_DUST);
			new OreChunk(category, "GOLD_ORE_CHUNK", "Gold Ore Chunk", 2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE4NDQ3OGIyMTE0MzlmM2UyYzUwOWMzNDI0ZWE1ZmYyZmNlNzM4MjVjOGJlYmY5NmNmY2NkMTAzZTQ5MjJlYiJ9fX0=", SlimefunItems.GOLD_DUST);
			new OreChunk(category, "COPPER_ORE_CHUNK", "Copper Ore Chunk", 5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjBkNzQ4NzU3ZDZlZmRkZGU4NTJlMGE0YTFhOWI5MmYyZTRjNThiMWVhOWExNzMxYTMyZjZjZWRmMmMyM2IzNiJ9fX0=", SlimefunItems.COPPER_DUST);
			new OreChunk(category, "TIN_ORE_CHUNK", "Tin Ore Chunk", 3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUyYzk1NTE3N2ZmNjVhMmQ1NWFmMTc3NDM3NTUwOTBhNWE2YjY4YjM1ODZjY2JjMzFhMzQyZGFkOWVmNzc5OSJ9fX0=", SlimefunItems.TIN_DUST);
			new OreChunk(category, "SILVER_ORE_CHUNK", "Silver Ore Chunk", 2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRlOGY5NDliYmYzYTQyNzgyYzUzMWZiZjhkZTlkYzJkOGNkODRkZDdjYjhmNWQ1MzI4ZWVkYTgzOTU2YWFjOCJ9fX0=", SlimefunItems.SILVER_DUST);
			new OreChunk(category, "ALUMINUM_ORE_CHUNK", "Aluminum Ore Chunk", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY3MzIzNjhjOTgwYjRjMjc0OTU2NjRiZDUwYjU4MjBjYzM3YzU3M2ZiMzdhODhmMzRjNWQzYTBkZWM2NjIxOSJ9fX0=", SlimefunItems.ALUMINUM_DUST);
			new OreChunk(category, "LEAD_ORE_CHUNK", "Lead Ore Chunk", 2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzM2ZjZWMwN2M4OWM1ZmRiODg2Y2FmNWUzZWJmOGM2YTUzNmRkNjYyYjMxZjkxYzFhNmRiZDkxM2JjM2RiMCJ9fX0=", SlimefunItems.LEAD_DUST);
			new OreChunk(category, "ZINC_ORE_CHUNK", "Zinc Ore Chunk", 3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNmODJmMjAyNjZiNGI4ZTA0NTYxMTAzNzlmOTQxZmNhMTY0MTM4NDZlMjMxZThhYzIwMmRjMmNhZjdmZmI0MSJ9fX0=", SlimefunItems.ZINC_DUST);

			new OreChunk(category, "NICKEL_ORE_CHUNK", "Nickel Ore Chunk", "&7You can smelt this into an Ingot in a Smeltery", 2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2JhMzBkZjgzMTZjZGZlM2M1YjFhZDdhYTk3NzVjOTRjM2FkNWU1MDJlYTEyNTRlZmViNDEzNDRmNzk2MjM4MSJ9fX0=", 
			RecipeType.SMELTERY, SlimefunItems.NICKEL_INGOT);
			
			new OreChunk(category, "COBALT_ORE_CHUNK", "Cobalt Ore Chunk", "&7You can smelt this into an Ingot in a Smeltery", 1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWM1NGE1NGIxYTQ5YzI5Njg2YmUxYzZlM2UwNWRkMDY4Zjg1ZTk5NGM4Yzg5MzgzOGNjNTg3OGI1NDQ2YmM4YSJ9fX0=", 
			RecipeType.SMELTERY, SlimefunItems.COBALT_INGOT);
		}
		catch(Exception x) {
			getLogger().log(Level.SEVERE, "An Error occured while loading the Plugin SlimefunOreChunks v" + getDescription().getVersion(), x);
		}
	}

}
