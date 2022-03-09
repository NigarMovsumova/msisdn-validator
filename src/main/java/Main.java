import model.MsisdnRequest;
import service.CSVUtil;
import service.EligibilityService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    public static void main(String[] args) {
        MsisdnRequest msisdnRequest = new MsisdnRequest();

        String [] numbers = CSVUtil.parse("numbers.csv");
        System.out.println(Arrays.toString(numbers));
        msisdnRequest.setMsisdnList(numbers);

        String blackListString = CSVUtil.readFirstLine("blacklist.csv");
        System.out.println(blackListString);
        msisdnRequest.setBlackListString(blackListString);

        EligibilityService.isEligibleToSell(msisdnRequest);

    }
}
