package model;

public class MsisdnRequest {
    private String [] msisdnList;

    private String blackListString;

    public MsisdnRequest() {
    }

    public String[] getMsisdnList() {
        return msisdnList;
    }

    public void setMsisdnList(String[] msisdnList) {
        this.msisdnList = msisdnList;
    }

    public String getBlackListString() {
        return blackListString;
    }

    public void setBlackListString(String blackListString) {
        this.blackListString = blackListString;
    }
}
