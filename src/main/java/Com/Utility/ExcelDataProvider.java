package Com.Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Batch_11_Framework\\Test_Data\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis);
		 
	}
	
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	

}
