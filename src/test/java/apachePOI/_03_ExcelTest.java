package apachePOI;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _03_ExcelTest {
    String path = "src/test/resources/files/NegativeTestData.xlsx";
    String resultPath = "src/test/resources/files/Result.xlsx";
    String sampleDataPath = "src/test/resources/files/sample_data.csv";
    FileUtilsMethods fileUtilsMethods = new FileUtilsMethods();

    @Test
    public void PrintAllDatatTest01() {
        fileUtilsMethods.printAllData(path, 0);
    }

    @Test
    public void printAllDataTest() {
        fileUtilsMethods.printAllData(resultPath, 0);
    }

    @Test
    public void getNumberOfRows() {
        Assert.assertEquals(fileUtilsMethods.getNumberOfRowsXlsx(path),19);
        System.out.println(fileUtilsMethods.getNumberOfRowsXlsx(path));
    }

    @Test
    public void getNumberOfrowsCsvFile(){
        System.out.println(fileUtilsMethods.getNumberOfRowsCsv(sampleDataPath));
    }

    @Test
    public void getDataListTest(){
        //if there is a method is created by List. we should assing a new list this method to print data
        ArrayList<ArrayList<Object>> dataList = fileUtilsMethods.getDataList(path,"Sheet1",2);
        for(ArrayList<Object> row : dataList){
            for(Object cell :row){
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
