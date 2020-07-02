package io.github.battlepass.quests.quests.external.executor;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.objects.quests.variable.QuestResult;
import io.github.battlepass.quests.QuestExecutor;
import me.hyfe.simplespigot.text.Replace;
import org.bukkit.entity.Player;

import java.util.function.UnaryOperator;

public class ExternalQuestExecutor extends QuestExecutor {
    private final String prefix;

    public ExternalQuestExecutor(BattlePlugin plugin, String pluginName) {
        super(plugin);
        this.prefix = pluginName.concat("_");
    }

    protected void execute(String name, Player player, int progress, UnaryOperator<QuestResult> result, Replace replace, boolean overrideUpdate) {
    }

    protected void execute(String name, Player player, int progress, UnaryOperator<QuestResult> result, Replace replace) {
    }

    protected void execute(String name, Player player, UnaryOperator<QuestResult> result, Replace replace) {
    }

    protected void execute(String name, Player player, int progress, UnaryOperator<QuestResult> result) {
    }

    protected void execute(String name, Player player, UnaryOperator<QuestResult> result) {
    }
}
