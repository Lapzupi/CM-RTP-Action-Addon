package dev.lapzupi.com.randomteleportactionaddon;

import com.lapzupi.dev.configurablemenus.addons.ActionAddon;
import de.themoep.randomteleport.api.RandomTeleportAPI;
import de.themoep.randomteleport.api.Searcher;
import de.themoep.randomteleport.api.Validator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


public final class RandomTeleportFubsActionAddon extends ActionAddon {
    private final RandomTeleportAPI<? extends Searcher, ? extends Validator<?>> api;
    
    public RandomTeleportFubsActionAddon() {
        this.api = (RandomTeleportAPI) Bukkit.getPluginManager().getPlugin(getPluginName());
    }
    
    //rtp:preset
    @Override
    public void onClick(final Player player, final String args) {
        api.runPreset(player, player, args, player.getLocation());
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "rtp";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPluginName() {
        return "RandomTeleport";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getAuthor() {
        return "Lapzupi Development Team";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getVersion() {
        return "1.0.1";
    }
    
}
