package io.github.battlepass.controller;

import com.google.common.collect.Maps;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.cache.QuestCache;
import io.github.battlepass.objects.quests.Quest;
import io.github.battlepass.objects.user.User;

import java.math.BigInteger;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public interface QuestController {

    Map<String, Integer> getQuests(User user, String categoryId);

    boolean isQuestDone(User user, Quest quest);

    boolean isWeekDone(User user, int week);

    boolean resetQuest(User user, Quest quest);

    int getQuestProgress(User user, Quest quest);

    /**
     * Sets the progress of a quest.
     *
     * @param user     The user to set the quest progress of.
     * @param quest    The quest to set progress for.
     * @param progress The progress to set.
     * @return The new progress amount.
     */
    int setQuestProgress(User user, Quest quest, int progress);

    /**
     * Adds quest progress and gets the new progress
     *
     * @param user     The user to add progress of a quest to.
     * @param quest    The quest to add progress for.
     * @param progress The amount of progress to add.
     * @return The new progress (same if max already).
     */
    int addQuestProgress(User user, Quest quest, int progress);
}
