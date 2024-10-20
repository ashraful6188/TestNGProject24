package day16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	
	
	@Test(dataProvider = "dp1")
	public void testDataProvider(String name, int id) {

		System.out.println(name + " ID no " + id + " is learning automation ");

	}

	@DataProvider(name = "dp1", indices= {0,3})
	public Object[][] automationData() {
		
		Object data[][] = { { "Jhon", 1001 }, { "Smith", 1002 }, { "Juree", 1003 }, { "Monica", 1004 },
				{ "Me x", 1005 },

		};
		return data;
	}

}
