package io.github.battlepass.menus;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.menus.menus.DailyQuestsMenu;
import io.github.battlepass.menus.menus.PortalMenu;
import io.github.battlepass.menus.menus.QuestOverviewMenu;
import io.github.battlepass.menus.menus.RewardMenu;
import me.hyfe.simplespigot.menu.Menu;
import org.bukkit.entity.Player;

public class MenuFactory {
    private final BattlePlugin plugin;

    public MenuFactory(BattlePlugin plugin) {
        this.plugin = plugin;
    }

    public Menu createMenu(String menuName, Player player) {
        switch (menuName) {
            case "portal":
                // Makes a new portal menu for the player
            case "daily-quests":
                // Makes a new daily quests menu for the player
            case "rewards":
                // Makes a new rewards menu for the player
            case "missions":
            case "quests":
            case "quest-overview":
                // Makes a new quest overview for the player
        }
        return null;
    }
}
