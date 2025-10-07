package AUD02.ex01aHanoi;

public class Kochkurve {
    void draw(double length, double direction){

    }

    void koch(int level, double length){
        if (level == 0) break;

        length /= 3;
        draw(length, 0);
        koch(level-1, length);
        draw(length, 60);
        koch(level-1, length);
        draw(length, 120);
        koch(level-1, length);
        draw(length, 60);

    }
}

public class KochSnowflake {
    // Current direction in degrees (0 = East, 90 = North, 180 = West, 270 = South)
    private double currentDirection = 0.0;

    /**
     * Simulates the required draw operation.
     * In a real implementation, this would actually move a cursor or update coordinates.
     * We assume this method moves the drawing position by 'length' in 'direction'.
     *
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

// ... rest of the code below ...

