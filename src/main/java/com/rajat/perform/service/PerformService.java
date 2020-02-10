package com.rajat.perform.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rajat.perform.dao.PerformDao;
import com.rajat.perform.model.PerformModel;

@Service
public class PerformService {

	@Autowired
	private PerformDao performDao;

	public List<PerformModel> getList() {
		return performDao.findAll();
	}

	public void generateExcel() {
		List<PerformModel> list = getList();
		System.out.println(list.size());
		int cnt = list.size() - 1;
		double f = 3;
		int start=0,end=3;
		int totalPage = 0;
		totalPage = (int) Math.ceil((double) cnt / f);
		System.out.println(totalPage);

		ArrayList<String> listAr = new ArrayList<String>(Arrays.asList("SRNO", "SCHEMENAME", "NAV AS ON DATE", "DAY1",
				"DAY7", "DAY15", "MONTH1", "MONTH3 ", "MONTH6 ", "YEAR1 ", "YEAR2 ", "YEAR3 ", "YEAR4 ", "YEAR5 ",
				"YEAR6 ", "YEAR7 ", "YEAR8 ", "YEAR9 ", "YEAR10 ", "YEAR11 ", "YEAR12 ", "YEAR13 ", "YEAR14 ",
				"YEAR15 ", "YEAR20 ", "YEARSI ", "	DAY1ANN ", "DAY7ANN ", "DAY15ANN ", "MONTH1ANN ", "MONTH3ANN ",
				"MONTH6ANN ", "DAY1TOTAL ", "DAY7TOTAL ", "DAY15TOTAL ", "MONTH1TOTAL ", "MONTH3TOTAL ", "MONTH6TOTAL ",
				"YEAR1TOTAL ", "YEAR2TOTAL ", "YEAR3TOTAL ", "YEAR4TOTAL ", "YEAR5TOTAL ", "YEAR6TOTAL ", "YEAR7TOTAL ",
				"YEAR8TOTAL ", "YEAR9TOTAL ", "YEAR10TOTAL ", "YEAR11TOTAL ", "YEAR12TOTAL ", "YEAR13TOTAL ",
				"YEAR14TOTAL ", "YEAR15TOTAL ", "YEAR20TOTAL", "YEARSITOTAL ", "DAY1ANNTOTAL ", "DAY7ANNTOTAL ",
				"DAY15ANNTOTAL ", "MONTH1ANNTOTAL ", "	MONTH3ANNTOTAL ", "MONTH6ANNTOTAL"));
		// "DIVIDEND ","GROWTH "
		try {// FileInputStream file = new FileInputStream(new File("C:\\test.xlsx"));
			HSSFWorkbook workbook = new HSSFWorkbook();
			;
			FileOutputStream out = null;
			for (int d = 0; d < totalPage; d++) {
				System.out.println(list.size());
				HSSFSheet sheet = workbook.createSheet("Sample sheet" + (d + 1));
				sheet.setColumnWidth(1, 25 * 256);
				sheet.setColumnWidth(2, 25 * 256);
				sheet.setColumnWidth(3, 25 * 256);
				HSSFFont font = workbook.createFont();
				font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
				HSSFCellStyle style = workbook.createCellStyle();
//				style.setFillForegroundColor(HSSFColor.BLUE.index);
//				style.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
				style.setFillForegroundColor(HSSFColor.GREY_50_PERCENT.index);
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				style.setAlignment(style.ALIGN_CENTER);
				font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
				font.setColor(HSSFColor.WHITE.index);
				style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
				style.setBorderTop(HSSFCellStyle.BORDER_THIN);
				style.setBorderRight(HSSFCellStyle.BORDER_THIN);
				style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
				// style.setF
				// style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				// font.setBold(true);
				// font.setColor(HSSFColor.BLACK.index);
				style.setFont(font);

				int g = 0;
				for (int i = 0; i < 3; i++) {
					Row row = sheet.createRow(i);
					if (i == 0) {
						for (int j = 0; j < listAr.size(); j++) {
							if (listAr.get(j).equals("NAV AS ON DATE")) {
								sheet.addMergedRegion(new CellRangeAddress(0, 0, 2, 3));
								Cell cell = row.createCell(j);
								cell.setCellStyle(style);
								cell.setCellValue(listAr.get(j));
								g = 1;
							} else {
								Cell cell = row.createCell(j + g);
								cell.setCellStyle(style);
								cell.setCellValue(listAr.get(j));
							}
							if (listAr.get(j).trim().equals("MONTH6ANN")) {
								System.out.println(listAr.get(j));
								break;
							}
						}
					}
					if (i == 1) {
						for (int k = 0; k < listAr.size(); k++) {
							if (k == 2) {
								Cell cell = row.createCell(2);
								cell.setCellStyle(style);
								cell.setCellValue("Dividend");
							} else if (k == 3) {
								Cell cell1 = row.createCell(3);
								cell1.setCellStyle(style);
								cell1.setCellValue("Growth");
							} else {
								Cell cell1 = row.createCell(k);
								cell1.setCellStyle(style);
								cell1.setCellValue("");
							}
							if (listAr.get(k).trim().equals("MONTH6ANN")) {
								Cell cell1 = row.createCell(k + 1);
								cell1.setCellStyle(style);
								cell1.setCellValue("");
								break;
							}
						}
					}
					for(int l=start,n=2;l<=end;l++,n++) {
						Row row1 = sheet.createRow(n);
					}
					start=end+1;
					end+=end;					
				}
			}
			out = new FileOutputStream(new File("F://maven/new.xls"));
			workbook.write(out);
			out.close();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}
