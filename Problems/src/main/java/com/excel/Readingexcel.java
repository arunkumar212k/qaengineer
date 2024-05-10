package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("C:\\Users\\arunk\\Desktop\\qaengineer\\Problems\\excelfile\\Read Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet0 = workbook.getSheetAt(0);
		/*Row row0 = sheet0.getRow(0);
		Cell cell0= row0.getCell(0);
		System.out.println(cell0);
		fis.close();*/
		for(Row row: sheet0) {
			for(Cell cell:row) {
				switch(cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case BLANK:
					System.out.print("blank cell"+"\t");
					break;
				
				}
				
			}System.out.println();
			
		}
	}}


