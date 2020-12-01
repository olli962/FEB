package de.koehler.advent;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Launch {

    public static void main(String[] args) throws IOException {
        /*List<Integer> arr = new ArrayList<>();

        System.out.println(System.getProperty("user.dir"));
        Scanner scanner = new Scanner(new File("D:\\Dropbox\\Git\\FEB\\src\\de\\koehler\\advent\\numbers.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            arr.add(Integer.parseInt(line));
        }
    */
        int[] arr = {2018, 1, 1};

        for (Integer int1 : arr){
            for (Integer int2 : arr){
                for (Integer int3 : arr)
                    if (int1 + int2 + int3 == 2020) {
                        System.out.println(int1 * int2 * int3);
                        System.exit(0);
                    }
            }
        }
    }
}
