package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\Kiran_1.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Kiran_1").getRow(0).getCell(0).getNumericCellValue();
	System.out.println(data);
	FileInputStream file1=new FileInputStream("C:\\Users\\Admin\\Documents\\Kiran_1.xlsx");
	 double data1 = WorkbookFactory.create(file1).getSheet("Kiran_1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data1);
	
	FileInputStream file2=new FileInputStream("C:\\Users\\Admin\\Documents\\Kiran_1.xlsx");
	boolean data2=WorkbookFactory.create(file2).getSheet("Kiran_1").getRow(0).getCell(2).getBooleanCellValue();
	System.out.println(data2);
	}
	

}
