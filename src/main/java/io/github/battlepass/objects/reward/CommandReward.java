package io.github.battlepass.objects.reward;

import com.google.common.collect.Multiset;
import me.hyfe.simplespigot.text.Replacer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public interface CommandReward extends Reward<String> {

    @Override
    void reward(Player player);
}
