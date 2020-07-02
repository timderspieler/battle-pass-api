package io.github.battlepass.loader;

import com.google.common.collect.Maps;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.objects.pass.PassType;
import lombok.SneakyThrows;
import me.hyfe.simplespigot.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public interface PassLoader {

    Map<String, PassType> getPassTypes();

    PassType passTypeOfId(String id);

    int getMaxTier();
}
