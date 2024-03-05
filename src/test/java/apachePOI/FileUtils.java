package apachePOI;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileUtils {

    String path = "src/test/resources/files/NegativeTestData.xlsx";
    String resultPath = "src/test/resources/files/Result.xlsx";


    public void printCellData(String path,String sheet,int rowNum,int cellNum)  {
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheetFirst = workbook.getSheet(sheet);
            Row firstRow = sheetFirst.getRow(rowNum);// first index
            Cell cell = firstRow.getCell(cellNum); // first index
            System.out.println("Cell :"+cell);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void printAllData(String path,int sheetIndex)  {
        FileInputStream fileInputStream ;
        Workbook workbook = null;

        try {
            fileInputStream  = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Sheet sheetWithIndex = workbook.getSheetAt(sheetIndex);
        int rowCount = sheetWithIndex.getPhysicalNumberOfRows();
        for (int i = 0; i<rowCount; i++){
            Row row = sheetWithIndex.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            for (int j =0 ; j<cellCount; j++){
                Cell cellData = row.getCell(j);
                System.out.print(cellData+ " \t ");
            }
            System.out.println();
        }
    }

    @Test
    public void test(){
        printAllData(path,0);
    }
    @Test
    public void test01(){
        printAllData(resultPath,0);
    }
}
