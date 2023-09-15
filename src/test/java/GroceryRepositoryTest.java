
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GroceryRepositoryTest {
    GroceryDAO groceryDAO;
    /**
     * Run the same method used in the menu class to drop and recreate the Grocery table.
     * Also, generate a new GroceryDAO.
     */
    @Before
    public void setUp(){
        GroceryMain.databaseSetup();
        groceryDAO = new GroceryDAO();
    }

    /**
     * When the application starts, the grocery database should not contain any groceries.
     */
    @Test
    public void groceryListEmptyOnStartTest(){
        
        List<String> expectedOutput = new ArrayList<>();

        List<String> allGroceries = groceryDAO.getAllGroceries();

        Assert.assertEquals("getAllGroceries should have a valid SQL statement that gets all groceries.",
                expectedOutput, allGroceries);
        
    }
    /**
     * When a grocery is added, the grocery database should contain the grocery.
     */
    @Test
    public void groceryListAddTest1(){
//        test that the select all works before trying to insert
        groceryListEmptyOnStartTest();

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("apples");
        
        groceryDAO.addGrocery("apples");

        List<String> actualOutput = groceryDAO.getAllGroceries();

        Assert.assertEquals("addGrocery should have a valid SQL statement that adds a grocery.",
                expectedOutput, actualOutput);

    }

        /**
     * When a grocery is added, the grocery database should contain the grocery.
     */
    @Test
    public void groceryListAddTest2(){
//        test that the select all works before trying to insert
        groceryListEmptyOnStartTest();

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("bananas");
        
        groceryDAO.addGrocery("bananas");

        List<String> actualOutput = groceryDAO.getAllGroceries();

        Assert.assertEquals("addGrocery should have a valid SQL statement that adds a grocery.",
                expectedOutput, actualOutput);

    }
}
