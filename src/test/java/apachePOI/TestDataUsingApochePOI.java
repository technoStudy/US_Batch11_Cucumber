package apachePOI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataUsingApochePOI {

    // We will create data provider with reading excel


    @DataProvider(name="loginData")
    public Iterator<Object[]> loginDataProvider(){
        /* Iterators are more memory-efficient than lists,
        especially for the large data set
        When you return on iterator, the entire dataset doesnt need to
        be loaded into memory at once
         */
        List<Object[]> testData = new ArrayList<>();
        String path = "src/test/resources/files/NegativeTestData.xlsx";
        FileInputStream fis = null;
        Workbook workbook = null;
        Sheet sheet = null;
        try {
          fis = new FileInputStream(path);
         // workbook = WorkbookFactory.create(fis);// we have another method
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
        }catch (IOException e){
            e.printStackTrace();
        }
        for (Row row: sheet){
            Cell usernameCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);

            String username = usernameCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();
            testData.add(new Object[]{username,password}) ;
        }
        return testData.iterator();
    }
}
