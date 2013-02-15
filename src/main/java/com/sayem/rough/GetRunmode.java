package com.sayem.rough;

import com.sayem.util.TestUtil;
import com.sayem.util.Xls_Reader;

public class GetRunmode {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));
		Xls_Reader xls = new Xls_Reader("src/main/java/com/sayem/data/Test Cases.xlsx");
		/*for(int rowNum=2;rowNum<=xls.getRowCount("Test Cases");rowNum++){
			if(xls.getCellData("Test Cases", "Runmode", rowNum).equals("Y"))
				System.out.println(xls.getCellData("Test Cases", "TCID", rowNum)+" -- "+xls.getCellData("Test Cases", "Runmode", rowNum));

			// print the test cases with RUnmode Y
		}*/
		
		System.out.println(TestUtil.isExecutable("Test2", xls));
		System.out.println(TestUtil.isExecutable("Test4", xls));

	}

}
