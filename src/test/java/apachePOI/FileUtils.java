package apachePOI;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {


    public void printCellData(String path, String sheet, int rowNum, int cellNum) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheetFirst = workbook.getSheet(sheet);
            Row firstRow = sheetFirst.getRow(rowNum);// first index
            Cell cell = firstRow.getCell(cellNum); // first index
            System.out.println("Cell :" + cell);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printAllData(String path, int sheetIndex) {
        FileInputStream fileInputStream=null;
        Workbook workbook = null;

        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Sheet sheetWithIndex = workbook.getSheetAt(sheetIndex);
        int rowCount = sheetWithIndex.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheetWithIndex.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {
                Cell cellData = row.getCell(j);
                System.out.print(cellData + " \t ");
            }
            System.out.println();
        }
    }

    //**************************************************************
    public int getNumberOfRowsXlsx(String sPathToFile) {
        FileInputStream fis = null;
        Workbook workbook = null;
        int count = 0;
        try {
            fis = new FileInputStream(sPathToFile);
            workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            count = sheet.getPhysicalNumberOfRows();// This will get the number of rows with data
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    //******************************************************************
    public int getNumberOfRowsCsv(String sPathToFile) {
        CSVReader csvReader = null;
        int count = 0;
        try {
            csvReader = new CSVReaderBuilder(new FileReader(sPathToFile)).build();
            while (csvReader.readNext() != null) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (csvReader != null) {
                try {
                    csvReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }

    //*************************************************************
    // when we want to print data from the file, it is better to create method with list
    // if we put in the list we can use data in our test scenario

    public ArrayList<ArrayList<Object>> getDataList(String path, String sheetName,int columnNum){
      ArrayList<ArrayList<Object>> tableList = new ArrayList<>();
      FileInputStream fileInputStream = null;
      Workbook workbook = null;
      Sheet sheet = null;
        try {
          fileInputStream = new FileInputStream(path);
          workbook = WorkbookFactory.create(fileInputStream);
          sheet = workbook.getSheet(sheetName);
      }catch (IOException e){
          e.printStackTrace();
      }
        for (int i = 0; i<sheet.getPhysicalNumberOfRows();i++){
            ArrayList<Object> rowList = new ArrayList<>();
            for (int j = 0; j<columnNum; j++){
                rowList.add(sheet.getRow(i).getCell(j).toString());
            }
            tableList.add(rowList);
        }
        return tableList;
    }

}


