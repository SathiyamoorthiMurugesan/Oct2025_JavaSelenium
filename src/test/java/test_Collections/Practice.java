package test_Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.HashMap;

public class Practice {
	
	public static void main(String[] args) throws IOException {
		Practice obj = new Practice();
//		obj.storeExcelinArraylistUsingForLoop();
//		obj.storeExcelinArraylistUsingForEachLoop();
		obj.storeExcelinHashMapUsingForLoop();
//		obj.storeExcelinHashMapofArraylistUsingForLoop();	
	}

	public void storeExcelinArraylistUsingForLoop() throws IOException {

		FileInputStream file = new FileInputStream("A:\\ExcelFile\\ExcelFileReading.xlsx");

		Workbook workbook = new XSSFWorkbook(file);

		Sheet firstSheet = workbook.getSheetAt(0);

		ArrayList<ArrayList<String>> excelData = new ArrayList<>();  //this arraylist is to store entire row data in excel

		for (int i = 1; i < firstSheet.getLastRowNum(); i++) {
			Row row = firstSheet.getRow(i);
			ArrayList<String> rowData = new ArrayList();  //this arraylist is to save one row

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);

				switch (cell.getCellType()) {
				case STRING:

					rowData.add(cell.getStringCellValue());
					break;
				case NUMERIC:
					rowData.add(String.valueOf(cell.getNumericCellValue()));
					break;
				default:
					System.out.println("Invalid value");

				}
			}
			excelData.add(rowData);

		}
		System.out.println(excelData);
		workbook.close();

	}
	
	public void storeExcelinArraylistUsingForEachLoop() throws IOException {
		FileInputStream inputFile = new FileInputStream("A:\\ExcelFile\\ExcelFileReading.xlsx");
		Workbook workbook = new XSSFWorkbook(inputFile);
		Sheet sheet = workbook.getSheetAt(0);
		
		ArrayList<ArrayList<String>> entireRow = new ArrayList<>();
		
		for(Row row: sheet) {
			ArrayList<String> eachRow = new ArrayList<>();
			for(Cell cell:row) {
				eachRow.add(cell.toString());
			}
		entireRow.add(eachRow);	
		}
		
		System.out.println(entireRow);
		workbook.close();
	}
	
	public void storeExcelinHashMapUsingForLoop() throws IOException {
		FileInputStream file = new FileInputStream("A:\\ExcelFile\\ExcelFileReading.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
//		ArrayList<HashMap<String,String>> newMap = new ArrayList<>();
		Row headerRow = sheet.getRow(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row dataRow = sheet.getRow(i);
			
			HashMap<String,String> map = new HashMap<>();
			
			for(int j=0;j<headerRow.getLastCellNum();j++) {
				Cell cell=dataRow.getCell(j);
				
				String key = headerRow.getCell(j).getStringCellValue();
				String value ="";
				
					switch(cell.getCellType()) {
					case STRING:
						value=cell.getStringCellValue();
						break;
					case NUMERIC:
						value = String.valueOf(cell.getNumericCellValue());
						break;
					default:
						break;
					}
					
				map.put(key, value);
			}
			System.out.println(map);
//			newMap.add(map);
		}
//		System.out.println(newMap);
		workbook.close();
	}
	
	public  void storeExcelinHashMapofArraylistUsingForLoop() throws IOException {
		FileInputStream file = new FileInputStream("A:\\ExcelFile\\ExcelFileReading.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		
		Row headerRow = sheet.getRow(0);
		
		ArrayList<HashMap<String,String>> entireMap = new ArrayList<>();
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row dataRow = sheet.getRow(i);
			
			HashMap<String,String> map = new HashMap<>();
			
			for(int j=0;j<headerRow.getLastCellNum();j++) {
				Cell cell=dataRow.getCell(j);
				
				String key = headerRow.getCell(j).getStringCellValue();
						
				map.put(key, cell==null?"":cell.toString());   //condition ? value_if_true : value_if_false
			}
//			System.out.println(map);
			entireMap.add(map);
		}
		System.out.println(entireMap);

		workbook.close();
	}
	
}
