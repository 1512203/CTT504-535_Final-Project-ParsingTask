package com.example.huykhoahuy.test;

import java.util.ArrayList;

class ParsingListResultToGetInformation {
    ArrayList<Condition> conditions;

    public ParsingListResultToGetInformation() {
        conditions = new ArrayList<>();
        conditions.add(new ConditionOfCode());
        conditions.add(new ConditionOfDate());
    }


    public LotteryInfo getLotteryInfo(ArrayList<String> listResult) {
        LotteryInfo lotteryInfo = new LotteryInfo();
        for (int i = 0; i < listResult.size(); ++i) {
            // Says, we only care about the continuous recognized results
            // For example: 6 4 2 3 9 7 (the space is optional)
            // For example: SO XO HAU GIANG
            // etc.

            String[] resultInOneBlock = listResult.get(i).split("\n");
            for (int j = 0; j < resultInOneBlock.length; ++j) {
                String resultInABlock = resultInOneBlock[j];

                for (int k = 0; k < conditions.size(); ++k) {
                    String result = conditions.get(k).extractInformationWithCondition(resultInABlock);
                    switch (conditions.get(k).getTypeOfInfo()) {
                        case 0:
                            lotteryInfo.setLotteryCode(result);
                            break;
                        case 1:
                            lotteryInfo.setLotteryDate(result);
                            break;
                        case 2:
                            lotteryInfo.setLotteryHost(result);
                            break;
                    }

                }
            }
        }
        return null;
    }
}
