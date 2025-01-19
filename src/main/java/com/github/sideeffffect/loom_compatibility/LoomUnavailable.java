package com.github.sideeffffect.loom_compatibility;

public class LoomUnavailable extends Exception {
    public LoomUnavailable(Exception cause) {
        super("Loom is not available.", cause);
    }
}
