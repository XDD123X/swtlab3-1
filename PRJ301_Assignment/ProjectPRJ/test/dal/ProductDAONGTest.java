/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package dal;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import model.*;
import org.testng.Assert;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author duchi
 */
public class ProductDAONGTest {

    private ProductDAO dao = new ProductDAO();

    public ProductDAONGTest() {
    }

    @Test
    public void importAndTestFromCSV() throws IOException {
        List<String> passedTestCases = new ArrayList<>();
        List<String> failedTestCases = new ArrayList<>();

        try ( FileReader reader = new FileReader("testData1.csv");  CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {

            int totalTestCases = 0;
            for (CSVRecord record : csvParser) {
                totalTestCases++;
                try {
                    String id = record.get("id");
                    String name = record.get("name");
                    int quantity = Integer.parseInt(record.get("quantity"));
                    int price = Integer.parseInt(record.get("price"));
                    String describe = record.get("describe");
                    String image = record.get("image");
                    String date = record.get("date");
                    int cid = Integer.parseInt(record.get("cid"));
                    int total = Integer.parseInt(record.get("total"));
                    int ex = Integer.parseInt(record.get("expected"));
                    boolean expectedResult = true;
                    if (ex == 0) {
                        expectedResult = false;
                    }

                    Product product = new Product(id, name, quantity, price, describe, image, date, cid, total);

                    boolean result;
                    try {
                        result = dao.insert(product);
                    } catch (Exception e) {
                        result = false;
                    }

                    if (result == expectedResult) {
                        passedTestCases.add("Test Case #" + totalTestCases + " Passed: id=" + id + ", name=" + name
                                + ", quantity=" + quantity + ", price=" + price
                                + ", describe=" + describe + ", image=" + image
                                + ", date=" + date + ", cid=" + cid + ", total=" + total);
                    } else {
                        failedTestCases.add("Test Case #" + totalTestCases + " Failed: id=" + id + ", name=" + name
                                + ", quantity=" + quantity + ", price=" + price
                                + ", describe=" + describe + ", image=" + image
                                + ", date=" + date + ", cid=" + cid + ", total=" + total
                                + " - Expected: " + expectedResult + ", Actual: " + result);
                    }
                } catch (Exception e) {
                    failedTestCases.add("Test Case #" + totalTestCases + " Failed: Exception thrown - " + e.getMessage());
                }
            }
        }

        // In ra toàn bộ test case đã thành công
        System.out.println("Passed Test Cases:");
        for (String testCase : passedTestCases) {
            System.out.println(testCase);
        }

        // In ra toàn bộ test case đã thất bại
        System.out.println("Failed Test Cases:");
        for (String testCase : failedTestCases) {
            System.out.println(testCase);
        }

    }
}
