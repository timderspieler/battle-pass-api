package io.github.battlepass.api;

import io.github.battlepass.objects.pass.Tier;
import io.github.battlepass.objects.reward.Reward;
import io.github.battlepass.objects.user.User;
import io.github.battlepass.registry.QuestRegistry;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface BattlePassApi {

    QuestRegistry getQuestRegistry();

    CompletableFuture<Optional<User>> getUser(UUID uuid);

    Optional<Reward<?>> getReward(String id);

    long currentWeek();

    long currentDisplayWeek();

    void setPassId(User user, String passId);

    Tier getTier(int tier, String passId);

    int getRequiredPoints(int tier, String passId);

    void givePoints(User user, int points);

    void reward(User user, int tier, boolean ignoreRestrictions);

    void reward(User user, String passId, int tier, boolean ignoreRestrictions);
}
