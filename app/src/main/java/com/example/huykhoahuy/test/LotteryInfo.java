package com.example.huykhoahuy.test;

class LotteryInfo {

    private String lotteryDate;
    private String lotteryHost;
    private String lotteryCode;


    // Setter


    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public void setLotteryDate(String lotteryDate) {
        this.lotteryDate = lotteryDate;
    }

    public void setLotteryHost(String lotteryHost) {
        this.lotteryHost = lotteryHost;
    }

    // Getter
    public String getLotteryDate() {
        return lotteryDate;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public String getLotteryHost() {
        return lotteryHost;
    }
}
