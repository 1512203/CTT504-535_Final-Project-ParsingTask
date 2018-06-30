package com.example.huykhoahuy.test;

import java.util.Date;

class LotteryInfo {

    private Date lotteryDate;
    private String lotteryHost;
    private String lotteryCode;

    // Constructor
    public LotteryInfo(Date _lotteryDate, String _lotteryHost, String _lotteryCode) {
        this.lotteryCode = _lotteryCode;
        this.lotteryDate = _lotteryDate;
        this.lotteryHost = _lotteryHost;
    }

    // Getter
    public Date getLotteryDate() {
        return lotteryDate;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public String getLotteryHost() {
        return lotteryHost;
    }
}
