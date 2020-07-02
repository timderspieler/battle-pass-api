package io.github.battlepass.actions;

import com.sun.istack.internal.Nullable;
import me.hyfe.simplespigot.text.Replacer;
import org.bukkit.entity.Player;

public abstract class Action {
    protected final String condition;
    protected final String value;

    public Action(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public static Action parse(String string) {
        switch (string) {
            case "menu":
                // Menu action
            case "message":
                // Message action
            case "sound":
                // Sound action
            default:
                return null;
        }
    }

    /**
     * Can be used for everything but the menu action as of now.
     *
     * @param player   The player to execute for.
     * @param actions  The actions to execute.
     * @param replacer Replacer to apply to messages.
     */
    public static void executeSimple(Player player, Iterable<Action> actions, @Nullable Replacer replacer) {
    }
}