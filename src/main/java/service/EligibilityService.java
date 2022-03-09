package service;

import model.MsisdnRequest;

public class EligibilityService {

    //TODO написать реализацию метода
    private static String createBlacklistRegex() {
        return "";
    }

    public static void isEligibleToSell(MsisdnRequest msisdnSaleRequest) {
        String [] msisdnList = msisdnSaleRequest.getMsisdnList();
        String blackList = msisdnSaleRequest.getBlackListString();
        String blacklistRegex = createBlacklistRegex();
        for (String msisdn: msisdnList) {
            // TODO: сопоставить номер с blacklistRegex
        }
    }
}
