package com.example.huykhoahuy.test;

interface Condition {
    int getTypeOfInfo();
    boolean validateResult(String result);
    String extractInformationWithCondition(String inputString);
}
