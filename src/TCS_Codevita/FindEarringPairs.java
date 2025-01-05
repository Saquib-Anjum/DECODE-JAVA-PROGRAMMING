package TCS_Codevita;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class FindEarringPairs {
    // Count the cells affected by the line for the given star
    static int countCells(Line line, int[] star, boolean split) {
        if (line.x1 == line.x2) { // Vertical line
            if (split) {
                return Math.min(Math.abs(star[1] - line.y1), Math.abs(star[1] - line.y2)) + 1;
            } else {
                return Math.abs(line.y1 - line.y2) + 1;
            }
        } else { // Horizontal line
            if (split) {
                return Math.min(Math.abs(star[0] - line.x1), Math.abs(star[0] - line.x2)) + 1;
            } else {
                return Math.abs(line.x1 - line.x2) + 1;
            }
        }
    }

    // Check if two lines intersect and return the intersection point
    static boolean intersects(Line lineA, Line lineB, int[] intersection) {
        if (lineA.x1 == lineA.x2 && lineB.y1 == lineB.y2) { // Vertical vs Horizontal
            if (lineB.x1 <= lineA.x1 && lineA.x1 <= lineB.x2 && lineA.y1 <= lineB.y1 && lineB.y1 <= lineA.y2) {
                intersection[0] = lineA.x1;
                intersection[1] = lineB.y1;
                return true;
            }
        }
        if (lineA.y1 == lineA.y2 && lineB.x1 == lineB.x2) { // Horizontal vs Vertical
            if (lineA.x1 <= lineB.x1 && lineB.x1 <= lineA.x2 && lineB.y1 <= lineA.y1 && lineA.y1 <= lineB.y2) {
                intersection[0] = lineB.x1;
                intersection[1] = lineA.y1;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of lines
        int numLines = scanner.nextInt();
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < numLines; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            Line line = new Line(x1, y1, x2, y2);
            line.normalize(); // Normalize coordinates
            lines.add(line);
        }

        // Input number of required intersections (K)
        int requiredIntersections = scanner.nextInt();

        // Map to store intersection points and their associated lines
        Map<String, List<Line>> intersections = new HashMap<>();

        for (int i = 0; i < numLines; i++) {
            for (int j = i + 1; j < numLines; j++) {
                int[] intersection = new int[2];
                if (intersects(lines.get(i), lines.get(j), intersection)) {
                    String key = intersection[0] + "," + intersection[1];
                    intersections.computeIfAbsent(key, k -> new ArrayList<>())
                            .addAll(Arrays.asList(lines.get(i), lines.get(j)));
                }
            }
        }

        // Calculate the total placements
        int saquib = 0;

        for (Map.Entry<String, List<Line>> entry : intersections.entrySet()) {
            List<Line> intersectingLines = entry.getValue();
            if (intersectingLines.size() / 2 == requiredIntersections) {
                String[] coords = entry.getKey().split(",");
                int[] star = {Integer.parseInt(coords[0]), Integer.parseInt(coords[1])};

                List<Integer> intensities = new ArrayList<>();
                for (Line line : intersectingLines) {
                    intensities.add(countCells(line, star, true));
                }
                saquib += Collections.min(intensities);
            }
        }

        System.out.println();
        System.out.println(saquib);
    }
}

class Line {
    int x1, y1, x2, y2;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Ensure the line coordinates are ordered
    void normalize() {
        if (x1 > x2 || (x1 == x2 && y1 > y2)) {
            int tempX = x1, tempY = y1;
            x1 = x2;
            y1 = y2;
            x2 = tempX;
            y2 = tempY;
        }
    }
}
