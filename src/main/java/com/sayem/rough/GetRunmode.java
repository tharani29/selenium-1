package com.sayem.rough;

import com.sayem.util.TestUtil;
import com.sayem.util.Xls_Reader;

public class GetRunmode {

    public static void main(String [] args){

        Xls_Reader xls = new Xls_Reader("src\\main\\java\\com\\sayem\\data\\Test Cases.xlsx");

/*        for (int rowNum=2; rowNum<=xls.getRowCount("Test Cases"); rowNum++ ){

            if (xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Y")){
				System.out.println(xls.getCellData("Test Cases", "TCID", rowNum)+" -- "+xls.getCellData("Test Cases", "Runmode", rowNum));
            }

        }
*/

        System.out.println(TestUtil.isExecutable("Test2", xls));

    }
}
