package io.github.battlepass.menus.menus;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.loader.PassLoader;
import io.github.battlepass.menus.PageMethods;
import io.github.battlepass.menus.UserDependent;
import io.github.battlepass.objects.user.User;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import org.bukkit.entity.Player;

public class RewardMenu extends Menu implements PageMethods, UserDependent {
    private final User user;

    private int page = 1;

    public RewardMenu(BattlePlugin plugin, Config config, Player player) {
        super(player, "tt", 1);
        this.user = plugin.getUserCache().getOrThrow(player.getUniqueId());
    }

    public void redraw() {
    }

    @Override
    public boolean isUserViable() {
        return this.user != null;
    }

    // 1 is amount of free tiers, 2 is amount of premium tiers
    @Override
    public void nextPage(Runnable runnable) {
    }

    @Override
    public void previousPage(Runnable runnable) {
        this.page--;
        runnable.run();
    }

    @Override
    public int getPage() {
        return this.page;
    }
}
