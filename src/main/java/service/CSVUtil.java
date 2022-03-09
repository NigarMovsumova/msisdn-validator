package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVUtil {

    private static final String COMMA_DELIMITER = ",";

    private static String []  getRecordFromLine(String line) {
        String [] values = new String [5];
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            for (int i = 0; i < 1; i++) {
                values[i] = rowScanner.next();
            }
        }
        return values;
    }

    public static String [] parse(String fileName) {
        String [] records = new String[5];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                return getRecordFromLine(nextLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return records;
    }


    public static String readFirstLine(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
