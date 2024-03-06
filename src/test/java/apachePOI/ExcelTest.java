package apachePOI;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ExcelTest {
    String path = "src/test/resources/files/NegativeTestData.xlsx";
    String resultPath = "src/test/resources/files/Result.xlsx";
    String sampleDataPath = "src/test/resources/files/sample_data.csv";
    FileUtils fileUtils = new FileUtils();

    @Test
    public void PrintAllDatatTest01() {
        fileUtils.printAllData(path, 0);
    }

    @Test
    public void printAllDataTest() {
        fileUtils.printAllData(resultPath, 0);
    }

    @Test
    public void getNumberOfRows() {
        Assert.assertEquals(fileUtils.getNumberOfRowsXlsx(path),19);
        System.out.println(fileUtils.getNumberOfRowsXlsx(path));
    }

    @Test
    public void getNumberOfrowsCsvFile(){
        System.out.println(fileUtils.getNumberOfRowsCsv(sampleDataPath));
    }

    @Test
    public void getDataListTest(){
        //if there is a method is created by List. we should assing a new list this method to print data
        ArrayList<ArrayList<Object>> dataList = fileUtils.getDataList(path,"Sheet1",2);
        for(ArrayList<Object> row : dataList){
            for(Object cell :row){
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
