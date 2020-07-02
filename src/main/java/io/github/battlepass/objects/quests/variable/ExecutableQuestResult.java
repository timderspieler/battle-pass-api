package io.github.battlepass.objects.quests.variable;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ExecutableQuestResult extends QuestResult {
    @Override
    ExecutableQuestResult root(String root);

    @Override
    ExecutableQuestResult root(Block rootBlock);

    @Override
    ExecutableQuestResult root(ItemStack rootItem);

    @Override
    QuestResult none();

    @Override
    boolean isEligible(Player player, Variable variable);
}