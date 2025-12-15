package Test_ExcelFileReading;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

/*
 * Fillo is a lightweight Java library that allows you to read/write Excel files using SQL queries.
 * It supports .xlsx files only.
 * 
 * Fillo allows reading Excel using SQL queries, making test-data handling easy in automation frameworks.
 */

public class ExcelReadingUsingFillo {

	public static void main(String[] args) throws FilloException {

		String filePath = "A:\\ExcelFile\\ExcelFileReading.xlsx";

		Fillo fillo = new Fillo(); // creating object to the fillo class
		Connection connection = fillo.getConnection(filePath); // get connection

		String query = "select * from Sheet1";
		Recordset recordset = connection.executeQuery(query); // execute query

		int rowCount = recordset.getCount(); // getting row count from the excel sheet

		for (int i = 0; i < rowCount; i++) {
			recordset.next();

			recordset.getField("EmployeeID");
			recordset.getField("Name");
			recordset.getField("Experience");
			recordset.getField("Project");
			recordset.getField("Domain");

		}

		connection.close();
		recordset.close();

	}

}
