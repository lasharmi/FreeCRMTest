package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtilData;

public class DataDrivenTest extends TestBase{
	
	
@BeforeMethod
public void setUp() {
	System.out.println("Before Method");
	
}

@DataProvider
public Iterator<Object[]> getTestData() {
	ArrayList<Object[]> testData= TestUtilData.getDataFromExcel();
	return testData.iterator();
}

@Test(dataProvider="getTestData")
public void excelDataFetch(String title,String firstName,String lastName,String Company) {
	System.out.println("title");
	System.out.println(title);
	System.out.println("firstName");
	System.out.println(firstName);
	System.out.println("lastName");
	System.out.println(lastName);
	System.out.println("Company");
	System.out.println(Company);
	
	
}


@AfterMethod

public void tear() {
	System.out.println("After Method");
}
}
