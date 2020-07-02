package io.github.battlepass.menus.menus;

import com.google.common.collect.Sets;
import io.github.battlepass.BattlePlugin;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import me.hyfe.simplespigot.menu.item.MenuItem;
import me.hyfe.simplespigot.tuple.ImmutablePair;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class QuestOverviewMenu extends Menu {

    public QuestOverviewMenu(BattlePlugin plugin, Config config, Player player) {
        super(player, "tt", 1);
    }

    public void redraw() {
    }

    public MenuItem pageableItem(Integer weekInt) {
        return new MenuItem(new ItemStack(Material.BARRIER), 1, 1, null);
    }

    public ImmutablePair<Collection<Integer>, Collection<Integer>> elementalValues() {
        return ImmutablePair.of(Sets.newHashSet(), Sets.newHashSet());
    }
}
