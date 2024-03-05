package apachePOI;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_PrintAllData {

    @Test
    public void printAllDataFirstWay() throws IOException {
        String path = "src/test/resources/files/NegativeTestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
       // Sheet sheetWithname = workbook.getSheet("Sheet1");
        Sheet sheetWithIndex = workbook.getSheetAt(0);
        // we should read all data
        // we should now that the total number of physically used rows on the sheet
        int rowCount = sheetWithIndex.getPhysicalNumberOfRows();
        // it gives us the Physical Number Of Rows

        //1st way
        for (int i = 0; i<rowCount; i++){
            Row row = sheetWithIndex.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();// number of columns

            for (int j =0 ; j<cellCount; j++){
                Cell cellData = row.getCell(j);
                System.out.print(cellData+ " \t ");
            }
            // without anything inside the brackets is like saying
            // 'move to the next line' when printing things out
            System.out.println();
        }
    }

    @Test
    public void printAllDataSecondWay() throws IOException {
        String path = "src/test/resources/files/NegativeTestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheetWithIndex = workbook.getSheetAt(0);

        for (int i = 0; i<sheetWithIndex.getPhysicalNumberOfRows();i++){

            for (int j = 0 ; j<sheetWithIndex.getRow(i).getPhysicalNumberOfCells();j++){
                System.out.println(sheetWithIndex.getRow(i).getCell(j)+ " \t");
            }
            System.out.println();
        }

    }

}
