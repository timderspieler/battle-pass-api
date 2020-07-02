package io.github.battlepass.menus.menus;

import com.google.common.collect.Sets;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.menus.UserDependent;
import io.github.battlepass.objects.quests.Quest;
import io.github.battlepass.objects.user.User;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import me.hyfe.simplespigot.menu.item.MenuItem;
import me.hyfe.simplespigot.tuple.ImmutablePair;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class DailyQuestsMenu extends Menu{

    public DailyQuestsMenu(BattlePlugin plugin, Config config, Player player) {
        super(player, "title", 1);
    }

    @Override
    public void redraw() {

    }
}
