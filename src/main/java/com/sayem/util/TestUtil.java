package com.sayem.util;

public class TestUtil {
	// true- test has to be executed
	// false- test has to be skipped
	public static boolean isExecutable(String testName, Xls_Reader xls){
		
		for(int rowNum=2;rowNum<=xls.getRowCount("Test Cases");rowNum++){
			
			if(xls.getCellData("Test Cases", "TCID", rowNum).equalsIgnoreCase(testName)){
			
				if(xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Y"))
					return true;
				else 
					return false;
			}
			// print the test cases with RUnmode Y
		}
		
		return false;
	}
}
