package lk.sliit.csse.procurementsystem;

import lk.sliit.csse.procurementsystem.controllers.SiteManagerController;
import lk.sliit.csse.procurementsystem.models.ItemList;
import static org.apache.coyote.http11.Constants.a;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcurementSystemApplicationTests {
    ItemList il = new ItemList();
    SiteManagerController siteManagerController = new SiteManagerController();
    @Test
    public void contextLoads() {
    }
    @Test
    public void addItemsToOrder(){
        
        checkItemQty(25,true);
        checkItemQty(0,false);
        checkItemQty(-3,false);
      
    }
    @Test
    public void checkPurchaseBalance(){
        
    }
    public void checkItemQty(int qty, boolean s){
        
        boolean expectedOutput = s;
        boolean actualOutput = siteManagerController.checkOrderQuantity(qty);
                 
                 assertEquals(expectedOutput,actualOutput);
        
    }
}
