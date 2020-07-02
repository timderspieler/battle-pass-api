package io.github.battlepass.objects.reward;

import com.google.common.collect.Multiset;
import org.bukkit.entity.Player;

import java.util.List;

public interface Reward<T> {
    void reward(Player player);

    String getId();

    String getName();

    List<String> getLoreAddon();

    Multiset<T> getSet();

    void setSet(Multiset<T> set);

    void addElement(T element);

    void removeElement(T element);
}
