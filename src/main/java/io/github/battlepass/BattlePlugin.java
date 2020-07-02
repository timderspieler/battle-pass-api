package io.github.battlepass;

import com.google.common.cache.Cache;
import io.github.battlepass.actions.Action;
import io.github.battlepass.api.BattlePassApi;
import io.github.battlepass.cache.QuestCache;
import io.github.battlepass.cache.RewardCache;
import io.github.battlepass.cache.UserCache;
import io.github.battlepass.controller.QuestController;
import io.github.battlepass.lang.Lang;
import io.github.battlepass.loader.PassLoader;
import io.github.battlepass.menus.MenuFactory;
import io.github.battlepass.menus.service.MenuIllustrator;
import io.github.battlepass.objects.user.User;
import io.github.battlepass.registry.QuestRegistry;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.plugin.SpigotPlugin;
import me.hyfe.simplespigot.storage.storage.Storage;

import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

public final class BattlePlugin extends SpigotPlugin {
    private static BattlePassApi api;
    private BattlePassApi localApi;
    private PassLoader passLoader;
    private UserCache userCache;
    private QuestCache questCache;
    private RewardCache rewardCache;
    private QuestController questController;
    private MenuFactory menuFactory;
    private MenuIllustrator menuIllustrator;
    private QuestRegistry questRegistry;
    private Storage<User> userStorage;
    private Cache<String, Map<Integer, Set<Action>>> actionCache;
    private Lang lang;
    private ZonedDateTime seasonStartDate;

    public static BattlePassApi getApi() {
        return api;
    }

    public BattlePassApi getLocalApi() {
        return this.localApi;
    }

    public PassLoader getPassLoader() {
        return this.passLoader;
    }

    public UserCache getUserCache() {
        return this.userCache;
    }

    public QuestCache getQuestCache() {
        return this.questCache;
    }

    public RewardCache getRewardCache() {
        return this.rewardCache;
    }

    public QuestController getQuestController() {
        return this.questController;
    }

    public MenuFactory getMenuFactory() {
        return this.menuFactory;
    }

    public MenuIllustrator getMenuIllustrator() {
        return this.menuIllustrator;
    }

    public Storage<User> getUserStorage() {
        return this.userStorage;
    }

    public Lang getLang() {
        return this.lang;
    }

    public Cache<String, Map<Integer, Set<Action>>> getActionCache() {
        return this.actionCache;
    }

    public ZonedDateTime getSeasonStartDate() {
        return this.seasonStartDate;
    }

    public QuestRegistry getQuestRegistry() {
        return this.questRegistry;
    }

    public Config getConfig(String name) {
        return this.getConfigStore().getConfig(name);
    }

    public boolean areDailyQuestsEnabled() {
        Config settings = this.getConfig("settings");
        return !settings.has("daily-quests-enabled") || settings.bool("daily-quests-enabled");
    }

    public void reload() {
        this.getConfigStore().reloadReloadableConfigs();
        // Reloads more BTW, just not in this API ver.
        System.gc();
    }
}
