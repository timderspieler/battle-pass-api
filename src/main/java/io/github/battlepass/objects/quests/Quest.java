package io.github.battlepass.objects.quests;

import io.github.battlepass.objects.quests.variable.Variable;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public interface Quest {

    String getId();

    String getCategoryId();

    String getName();

    ItemStack getItemStack();

    String getType();

    int getRequiredProgress();

    Variable getVariable();

    int getPoints();

    Set<Integer> getNotifyAt();

    Set<String> getWhitelistedWorlds();

    Set<String> getBlacklistedWorlds();

    String getExclusiveTo();
}
