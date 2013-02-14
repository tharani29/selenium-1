package com.sayem.util;

public class TestUtil {

    public static boolean isExecutable(String testName, Xls_Reader xls){
        for (int rowNum=2; rowNum<=xls.getRowCount("Test Cases"); rowNum++ ){
            if (xls.getCellData("Test Cases", "TCID", rowNum).equalsIgnoreCase(testName)){
                if (xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Y")){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
