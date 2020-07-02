package io.github.battlepass.objects.pass;

import io.github.battlepass.actions.Action;
import io.github.battlepass.cache.RewardCache;
import io.github.battlepass.objects.user.User;
import org.bukkit.inventory.ItemStack;

import java.util.Set;
import java.util.TreeMap;

public interface PassType {

    String getId();

    String getName();

    String getRequiredPermission();

    int getDefaultPointsRequired();

    TreeMap<Integer, Tier> getTiers();

    Set<Action> getTierUpActions();

    /**
     * Gets the item for the specified t5ier.
     *
     * @param rewardCache {@link RewardCache}
     * @param user        The user to get the tier item for.
     * @param passId      The pass ID, e.g free or premium
     * @param tier        The tier to get for.
     * @param hasTier     Whether the player has the tier
     * @return The generated item stack for the tier.
     */
    ItemStack tierToItem(RewardCache rewardCache, User user, String passId, Tier tier, boolean hasTier);
}
