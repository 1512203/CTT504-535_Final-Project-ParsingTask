package com.example.huykhoahuy.test;

class ConditionOfCode implements Condition {
    @Override
    public int getTypeOfInfo() {
        return 0;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isAllowed(char c) {
        return isDigit(c) || (c == ' ');
    }

    @Override
    public boolean validateResult(String result) {
        return result.length() == 6;
    }


    @Override
    public String extractInformationWithCondition(String inputString) {
        int len = inputString.length();
        for (int i = 0; i < len; ) {
            int j = i;
            StringBuilder result = new StringBuilder();
            for ( ; j < len; ++j) {
                char c = inputString.charAt(j);
                if (!isAllowed(c))
                    break;
                if (isDigit(c)) {
                    result.append(c);
                }
            }
            if (validateResult(result.toString())) {
                return result.toString();
            }
            i = j;
        }
        return null;
    }
}
