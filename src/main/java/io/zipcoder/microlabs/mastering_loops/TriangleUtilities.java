package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        // StringBuilder
        StringBuilder tree = new StringBuilder();

        // Outer loop to create each row of the
        for (int row = 1; row < numberOfRows; row++) {

            // Inner loop to append stars (*) to the string
            for (int star = 1; star <= row; star++) {
                tree.append("*");
            }

            // Append a newline
            tree.append("\n");
        }
        return tree.toString();

    }


    public static String getRow(int width) {
        // StringBuilder
        StringBuilder tree = new StringBuilder();

        // Outer loop to create each row of the
        for (int i = 0; i < width; i++) {
                tree.append("*");
            }

        return tree.toString();
    }

    public static String getSmallTriangle() {
        // StringBuilder
        StringBuilder tree = new StringBuilder();
        int stars = 5;
        // Outer loop to create each row of the
        for (int row = 1; row < stars; row++) {

            // Inner loop to append stars (*) to the string
            for (int star = 1; star <= row; star++) {
                tree.append("*");
            }

            // Append a newline
            tree.append("\n");
        }
        return tree.toString();
    }

    public static String getLargeTriangle() {
        // StringBuilder
        StringBuilder tree = new StringBuilder();
        int stars = 10;
        // Outer loop to create each row of the
        for (int row = 1; row < stars; row++) {

            // Inner loop to append stars (*) to the string
            for (int star = 1; star <= row; star++) {
                tree.append("*");
            }

            // Append a newline
            tree.append("\n");
        }
        return tree.toString();
    }
}
