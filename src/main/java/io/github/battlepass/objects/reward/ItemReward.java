package io.github.battlepass.objects.reward;

import com.google.common.collect.Multiset;
import me.hyfe.simplespigot.service.simple.services.SpigotService;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ItemReward extends Reward<ItemStack> {

    @Override
    public void reward(Player player);
}
