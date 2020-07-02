package io.github.battlepass.menus.menus;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.menus.UserDependent;
import io.github.battlepass.objects.user.User;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import org.bukkit.entity.Player;

public class PortalMenu extends Menu implements UserDependent {
    private final User user;

    public PortalMenu(BattlePlugin plugin, Config config, Player player) {
        super(player, "tt", 1);
        this.user = plugin.getUserCache().getOrThrow(player.getUniqueId());
    }

    public void redraw() {
    }

    @Override
    public boolean isUserViable() {
        return this.user != null;
    }
}
