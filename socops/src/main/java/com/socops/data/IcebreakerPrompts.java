package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "has sent a message to the wrong chat",
            "has a snack on their desk right now",
            "can recommend a great comfort movie",
            "has joined a meeting from an unusual place",
            "has a surprisingly specific hobby",
            "has named a plant, gadget, or vehicle",
            "has worn two different socks on purpose",
            "can make a sound effect on demand",
            "has taken a wrong turn and found something fun",
            "has a song they know all the words to",
            "has built, fixed, or improvised something recently",
            "has an unexpected item in their bag",
            "has laughed at the worst possible moment",
            "can teach a five-second trick",
            "has a food combination others might question",
            "has accidentally replied all",
            "can share a tiny win from this week",
            "has a strong opinion about pineapple on pizza",
            "has discovered a useful shortcut by accident",
            "can do a safe two-second dance move",
            "has a story involving a costume or uniform",
            "has kept a souvenir for a ridiculous reason",
            "can win at rock-paper-scissors right now",
            "has made up a word that should be real"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
