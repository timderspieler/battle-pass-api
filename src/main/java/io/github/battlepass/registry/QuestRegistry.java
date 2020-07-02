package io.github.battlepass.registry;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.quests.QuestExecutor;
import io.github.battlepass.quests.quests.external.executor.ExternalQuestExecutor;
import me.hyfe.simplespigot.registry.Registry;

import java.util.function.Function;

public interface QuestRegistry extends Registry {

    void registerQuests(Function<BattlePlugin, QuestExecutor>... functions);

    void registerHook(String plugin, Function<BattlePlugin, QuestExecutor>... functions);

    boolean registerHook(String plugin, Function<BattlePlugin, ExternalQuestExecutor> function);

    boolean registerHook(String plugin, Function<BattlePlugin, ExternalQuestExecutor> function, String author);

    boolean registerHook(String plugin, Function<BattlePlugin, ExternalQuestExecutor> function, Function<Integer, Boolean> versionCheck);
}