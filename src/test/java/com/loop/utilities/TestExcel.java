package com.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {

        ExcelUtils excelUtils = new ExcelUtils("C:/Users/taras/Downloads/Sample.xlsx", "Nadir");
        System.out.println("excelUtils.getCellData(1, 2) = " + excelUtils.getCellData(3, 1));

    }
}