package io.github.battlepass.objects.quests.variable;

import me.hyfe.simplespigot.version.MultiMaterial;
import me.hyfe.simplespigot.version.ServerVersion;

import java.util.function.BiFunction;

public interface Variable {
    public String getRoot();

    public boolean supplyMaterial(BiFunction<String, Byte, Boolean> function);
}
