package io.github.battlepass.cache;

import io.github.battlepass.exceptions.NoOnlineUserException;
import io.github.battlepass.objects.user.User;
import me.hyfe.simplespigot.cache.FutureCache;
import me.hyfe.simplespigot.save.Savable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface UserCache extends Savable {

    /**
     * Gets a user and throws an exception if they're not online.
     *
     * @param uuid The UUID of the user to get.
     * @return The user retrieved.
     * @throws NoOnlineUserException
     */
    User getOrThrow(UUID uuid) throws NoOnlineUserException;

    /**
     * Loads a user or creates them if they don't yet exist.
     *
     * @param uuid The UUID of the user to load.
     * @return A CompletableFuture of the User
     */
    CompletableFuture<User> load(UUID uuid);

    /**
     * Modifies all users (loads those that are unloaded to modify)
     *
     * @param consumer What to apply to the user
     */
    void asyncModifyAll(Consumer<User> consumer);

    /**
     * Unload and save a user
     *
     * @param uuid       The UUID of the user
     * @param invalidate Whether they should be removed from the cache or not.
     */
    void unload(UUID uuid, boolean invalidate);

    /**
     * Loads all of the online players
     */
    void loadOnline();

    /**
     * Saves all online users (doesn't invalidate)
     */
    @Override
    void save();
}
