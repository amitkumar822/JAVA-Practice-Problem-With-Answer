package UnicMethode.MostUnicCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildingOceanView {


    public static List<Integer> gardenView(int[] heights) {
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > max) {
                result.add(i);
                max = heights[i];
            }
        }

        return result;
    }

    public static List<Integer> oceanView(int[] heights) {
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > max) {
                result.add(i);
                max = heights[i];
            }
        }

        // Since we want the indices sorted in increasing order, reverse the list
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter building heights in the format [x,y,z,k]: ");
        String input = scanner.nextLine();

        // Remove the square brackets and split the input string into an array of strings
        String[] heightStrings = input.substring(1, input.length() - 1).split(",");

        // Parse the array of strings into an array of integers
        int[] heights = new int[heightStrings.length];
        for (int i = 0; i < heightStrings.length; i++) {
            heights[i] = Integer.parseInt(heightStrings[i].trim());
        }

        List<Integer> oceanViewIndices = oceanView(heights);
        List<Integer> gardenViewIndices = gardenView(heights);


        // Format the indices as a string
        StringBuilder gardenViewOutput = new StringBuilder("[");
        for (int i = 0; i < gardenViewIndices.size(); i++) {
            gardenViewOutput.append(gardenViewIndices.get(i));
            if (i < gardenViewIndices.size() - 1) {
                gardenViewOutput.append(",");
            }
        }
        gardenViewOutput.append("]");

        StringBuilder oceanViewOutput = new StringBuilder("[");
        for (int i = 0; i < oceanViewIndices.size(); i++) {
            oceanViewOutput.append(oceanViewIndices.get(i));
            if (i < oceanViewIndices.size() - 1) {
                oceanViewOutput.append(",");
            }
        }
        oceanViewOutput.append("]");

        System.out.println("Garden View Indices: " + gardenViewOutput.toString());
        System.out.println("Ocean View Indices: " + oceanViewOutput.toString());
    }
}
