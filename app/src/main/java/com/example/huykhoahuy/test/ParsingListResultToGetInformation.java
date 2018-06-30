package com.example.huykhoahuy.test;

import java.util.ArrayList;

class ParsingListResultToGetInformation {


    public LotteryInfo getLotteryInfo(ArrayList<String> listResult) {
        for (int i = 0; i < listResult.size(); ++i) {
            // Says, we only care about the continuous recognized results
            // For example: 6 4 2 3 9 7 (the space is optional)
            // For example: SO XO HAU GIANG
            // etc.
        }
        return null;
    }
}
