package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
// define the number
        int size = 5;
        // table builder
        StringBuilder table = new StringBuilder();
//loop
        for (int i=1; i <= size; i++) {
            for (int j = 1; j <=size; j++){
               table.append(String.format("%3d |", i * j));
            }
            table.append("\n");
            // return to string
        }
    return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        // define the number
        int size = 10;
        // table builder
        StringBuilder table = new StringBuilder();
//loop
        for (int i=1; i <= size; i++) {
            for (int j = 1; j <=size; j++){
                table.append(String.format("%3d |", i * j));
            }
            table.append("\n");
            // return to string
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        // define the number
        int size = 20;
        // table builder
        StringBuilder table = new StringBuilder();
//loop
        for (int i=1; i <= size; i++) {
            for (int j = 1; j <=size; j++){
                table.append(String.format("%3d |", i * j));
            }
            table.append("\n");
            // return to string
        }
        return table.toString();
    }
}
