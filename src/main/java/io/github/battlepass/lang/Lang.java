package io.github.battlepass.lang;

import com.google.common.collect.Maps;
import io.github.battlepass.BattlePlugin;
import io.github.battlepass.objects.quests.Quest;
import me.hyfe.simplespigot.config.Config;
import me.hyfe.simplespigot.text.Replace;
import me.hyfe.simplespigot.text.Text;
import org.bukkit.command.CommandSender;

import java.util.Map;

public interface Lang {


    boolean has(String section);

    LangSub of(String section);

    LangSub local(String id, Object... args);

    LangSub external(String id);

    LangSub external(String id, Replace replace);

    String questCompleteMessage(Quest quest);

    String questProgressedMessage(Quest quest, int progress);

    public interface LangSub {
        String asString();

        void to(CommandSender commandSender);
    }
}