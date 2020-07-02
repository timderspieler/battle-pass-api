package io.github.battlepass.cache;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.objects.quests.variable.Variable;
import lombok.SneakyThrows;
import me.hyfe.simplespigot.cache.SimpleCache;
import io.github.battlepass.objects.quests.Quest;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.item.SpigotItem;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public interface QuestCache {
    Set<Quest> getAllQuests();

    Quest getQuest(String categoryId, String questId);

    Map<String, Quest> getQuests(String categoryId);

    Set<String> getPlaceholderTypes();

    int getMaxWeek();
}
