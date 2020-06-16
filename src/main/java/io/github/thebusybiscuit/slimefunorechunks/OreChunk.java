package io.github.thebusybiscuit.slimefunorechunks;

import java.util.Locale;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class OreChunk extends SlimefunItem {

    private final int amplifier;
    private final String name;

    private final MultiBlockMachine machine;
    private final ItemStack output;

    public OreChunk(OreChunks plugin, Category category, String id, String name, int amplifier, String texture, ItemStack output) {
        this(plugin, category, id, name, "&7Use an Ore Crusher to turn this into Dust", amplifier, texture, RecipeType.ORE_CRUSHER, output);
    }

    public OreChunk(OreChunks plugin, Category category, String id, String name, String lore, int amplifier, String texture, RecipeType machine, ItemStack output) {
        super(category, new SlimefunItemStack(id, texture, "&r" + name, lore), RecipeType.GEO_MINER, new ItemStack[0]);

        this.amplifier = amplifier;
        this.name = name;

        this.machine = (MultiBlockMachine) machine.getMachine();
        this.output = output;

        new OreResource(new NamespacedKey(plugin, id.toLowerCase(Locale.ROOT)), this).register();
    }

    public String getName() {
        return name;
    }

    public int getAmplifier() {
        return amplifier;
    }

    @Override
    public void postRegister() {
        if (!machine.isDisabled()) {
            machine.addRecipe(new ItemStack[] { getItem() }, output);
        }
    }
}
