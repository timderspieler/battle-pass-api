package io.github.battlepass.objects.user;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.function.UnaryOperator;

public interface User {

    UUID getUuid();

    @Nullable
    Player getPlayer();

    QuestStore getQuestStore();

    String getPassId();

    void setPassId(String passId);

    boolean hasPassId(String passId);

    int getTier();

    int updateTier(UnaryOperator<Integer> current);

    BigInteger getPoints();

    BigInteger updatePoints(UnaryOperator<BigInteger> current);

    Map<String, TreeSet<Integer>> getPendingTiers();

    TreeSet<Integer> getPendingTiers(String passId);

    boolean hasPendingTier(String passId, int tier);

    void addPendingTier(String passId, int tier);
}
