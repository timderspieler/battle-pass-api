package io.github.battlepass.quests;

import io.github.battlepass.BattlePlugin;
import io.github.battlepass.objects.quests.variable.QuestResult;
import me.hyfe.simplespigot.text.Replace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.function.UnaryOperator;

public class QuestExecutor implements Listener {

    public QuestExecutor(BattlePlugin plugin) {
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
