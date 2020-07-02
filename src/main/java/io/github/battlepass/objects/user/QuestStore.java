package io.github.battlepass.objects.user;

import com.google.common.collect.Maps;

import java.util.Map;

public interface QuestStore {

    Map<String, Map<String, Integer>> asMap();
}
