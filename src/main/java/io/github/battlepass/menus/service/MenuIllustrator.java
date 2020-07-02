package io.github.battlepass.menus.service;

import com.google.common.cache.Cache;
import io.github.battlepass.actions.Action;
import io.github.battlepass.menus.MenuFactory;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.menu.Menu;
import me.hyfe.simplespigot.text.Replace;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Set;

public interface MenuIllustrator {

    void draw(Menu menu, Config config, MenuFactory menuFactory, Player player, Cache<String, Map<Integer, Set<Action>>> actionCache, Map<String, Runnable> customActions, Replace replace);
}