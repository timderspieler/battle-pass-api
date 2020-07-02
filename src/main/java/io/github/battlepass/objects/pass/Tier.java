package io.github.battlepass.objects.pass;

import java.util.Set;

public interface Tier {

    int getTier();

    int getRequiredPoints();

    Set<String> getRewardIds();
}
