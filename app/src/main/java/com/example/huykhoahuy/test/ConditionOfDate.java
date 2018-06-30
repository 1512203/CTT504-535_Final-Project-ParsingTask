package com.example.huykhoahuy.test;

class ConditionOfDate implements Condition {
    @Override
    public int getTypeOfInfo() {
        return 1;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isAllowed(char c) {
        return isDigit(c) || (c == '-') || (c == ' ');
    }

    @Override
    public boolean validateResult(String result) {
        return result.length() == 8 && result.charAt(2) == '-' && result.charAt(4) == '-';
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
                if (c != ' ') {
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
