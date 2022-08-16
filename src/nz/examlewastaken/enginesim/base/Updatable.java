package nz.examlewastaken.enginesim.base;

/**
 * Represents an object that updates once every tick.
 */
public interface Updatable {
    /**
     * Update the updatable.
     * @param deltaTime The time that has passed since the last update.
     */
    void update(int deltaTime);

    /**
     * Check if the updatable should update again based on the time that has passed since the last update.
     * @param timeLastUpdate Value of {@link System#nanoTime()} the last time the updatable was updated.
     * @param interval The interval in <b>milliseconds</b> the component should be updated with.
     * @return {@code true} if the updatable should update again, {@code false} otherwise.
     */
    default boolean shouldUpdate(long timeLastUpdate, long interval) {
        long timeSinceLastUpdate = System.nanoTime() - timeLastUpdate;
        return timeSinceLastUpdate >= interval;
    }
}
