package io.github.battlepass.menus.menus;

import com.google.common.collect.Sets;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.lang.Lang;
import io.github.battlepass.objects.quests.Quest;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import me.hyfe.simplespigot.menu.item.MenuItem;
import me.hyfe.simplespigot.tuple.ImmutablePair;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class WeekMenu extends Menu {

    public WeekMenu(BattlePlugin plugin, Config config, Player player, int week) {
        super(player, "tt", 1);
    }

    public MenuItem pageableItem(Quest quest) {
        return new MenuItem(new ItemStack(Material.BARRIER), 1, 1, null);
    }

    public ImmutablePair<Collection<Quest>, Collection<Integer>> elementalValues() {
        return ImmutablePair.of(Sets.newHashSet(), Sets.newHashSet());
    }

    @Override
    public void redraw() {

    }
}
