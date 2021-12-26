package com.crm.qa.util;

import java.util.ArrayList;

import com.crm.qa.base.TestBase;
import com.crm.qa.testdata.Xls_Reader;

public class TestUtilData extends TestBase {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> data= new ArrayList<Object[]>();
		try {
			reader= new Xls_Reader("C:/Users/Baskar/Desktop/sharmila/FreeCrmTestData.xlsx");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int nowNum=2;nowNum<=reader.getRowCount("contacts"); nowNum++) {
			String title=reader.getCellData("contacts", "title", nowNum);
			String firstName=reader.getCellData("contacts", "firstname", nowNum);
			String lastName=reader.getCellData("contacts", "lastname", nowNum);
			String company=reader.getCellData("contacts", "company", nowNum);
			
			Object ob[]= {title,firstName,lastName,company};
			data.add(ob);
		}
		return data;
		
	}

}
