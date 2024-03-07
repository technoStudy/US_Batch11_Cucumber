package apachePOI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_ApachePOIStart {
    //What is an ApachePOI? Data reading tool and library from the Excel

    @Test
    public void printCellData() throws IOException {
        // 1st step: create a String path of the excel file
        String path = "src/test/resources/files/NegativeTestData.xlsx";
        //2nd step we should implement the path of the excel file in the java reading class
        // the java file reading class is FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //3rd step we should create a workbook (virtual workbook)
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // 4th step There are many sheets in the Excel, we should define to work on it
        Sheet sheetFirst = workbook.getSheet("batch11");

        // to get Row 1
        Row firstRow = sheetFirst.getRow(1);// first index
        Cell cell = firstRow.getCell(0); // first index
        System.out.println("Cell :"+cell);

    }



}
