package AUD02.ex01bKoch;

public class KochSnowflake {
    // Current direction in degrees (0 = East, 90 = North, 180 = West, 270 = South)
    private double currentDirection = 0.0;

    /**
     * Simulates the required draw operation.
     * In a real implementation, this would actually move a cursor or update coordinates.
     * We assume this method moves the drawing position by 'length' in 'direction'.
     * NOTE: This method does NOT update currentDirection, as per the problem's specification
     * (the direction for the next segment must be set explicitly).
     */
    private void draw(double length, double direction) {
        // Normalize direction to ensure it's within [0, 360) for clean output, though not strictly necessary for the math.
        direction = direction % 360;
        if (direction < 0) {
            direction += 360;
        }

        // Print the instruction for demonstration
        System.out.printf("Draw line: Length=%.2f, Direction=%.2f degrees\n", length, direction);
        // The drawing operation implicitly ends the line here, ready for the next one.
    }

    /**
     * Recursively draws a single Koch Curve.
     */
    private void kochCurve(int level, double length) {
        if (level == 0) {
            // Base Case: Draw a single straight line segment
            draw(length, currentDirection);
        } else {
            double nextLength = length / 3.0;
            int nextLevel = level - 1;

            // 1. Draw segment 1 (0 degree rotation)
            kochCurve(nextLevel, nextLength);

            // 2. Draw segment 2 (+60 degrees left turn)
            currentDirection += 60.0;
            kochCurve(nextLevel, nextLength);

            // 3. Draw segment 3 (-120 degrees right turn)
            currentDirection -= 120.0; // The net change from the original direction is -60 (60 - 120 = -60)
            kochCurve(nextLevel, nextLength);

            // 4. Draw segment 4 (+60 degrees left turn)
            currentDirection += 60.0; // The net change from the original direction is 0 (-60 + 60 = 0)
            kochCurve(nextLevel, nextLength);
        }
    }
// ... rest of the code below ...
    /**
     * Draws the Koch Snowflake of the given level and side length.
     * This is the required function signature.
     */
    public void koch(int level, double length) {
        // Ensure the direction starts at 0 (East) for the first side.
        // The currentDirection field keeps track of the orientation between recursive calls.
        currentDirection = 0.0;

        // Draw the three sides of the snowflake, rotating 120 degrees right (clockwise)
        // after each side to form an equilateral triangle.

        System.out.println("--- Starting Koch Snowflake Drawing (Level: " + level + ", Length: " + length + ") ---");

        // Side 1
        System.out.println("\nSide 1:");
        kochCurve(level, length);
        currentDirection -= 120.0; // Rotate right for the next side

        // Side 2
        System.out.println("\nSide 2:");
        kochCurve(level, length);
        currentDirection -= 120.0; // Rotate right for the next side

        // Side 3
        System.out.println("\nSide 3:");
        kochCurve(level, length);
        // After the third side, the final direction is another -120, totaling -360 (0).

        System.out.println("\n--- Drawing Finished ---");
    }

    // --- Main method for demonstration ---
    public static void main(String[] args) {
        KochSnowflake snowflake = new KochSnowflake();

        // Example 1: Level 0 (An Equilateral Triangle)
        // snowflake.koch(0, 9.0);

        // Example 2: Level 1 (The classic 12-segment shape)
        snowflake.koch(1, 9.0);
    }
}