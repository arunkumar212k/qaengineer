package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\arunk\\Desktop\\qaengineer\\Problems\\excelfile\\Read Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet0 = workbook.getSheetAt(0);
		Row row0 = sheet0.getRow(0);
		cell cell0= row0.getCell(0);
		System.out.println(cell0);
		fis.close();
}}