package week12;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelDriver {

	public static void main(String[] args) {
		try {
			File file = new File("E:/eclipse-java-2020-12-R-win32-x86_64/text/student.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);

			int col = sheet.getColumns();
			int row = sheet.getRows();
			
//			System.out.println("列="+col+"行="+row);
//			System.out.println("学号\t姓名\t性别");
			for (int i = 0; i < row; i++) {
				Cell cell0 = sheet.getCell(0, i);
				String id = cell0.getContents();
				Cell cell1 = sheet.getCell(1, i);
				String name = cell1.getContents();
				Cell cell2 = sheet.getCell(2, i);
				String gender = cell2.getContents();

				System.out.println(id + "\t" + name + "\t" + gender);
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
