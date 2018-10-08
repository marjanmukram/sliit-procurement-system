package lk.sliit.csse.procurementsystem;

import lk.sliit.csse.procurementsystem.controllers.GoodReceiptController;
import lk.sliit.csse.procurementsystem.controllers.ManagementController;
import lk.sliit.csse.procurementsystem.controllers.PaymentController;
import lk.sliit.csse.procurementsystem.controllers.SiteController;
import lk.sliit.csse.procurementsystem.controllers.SiteManagerController;
import lk.sliit.csse.procurementsystem.models.ItemList;
import lk.sliit.csse.procurementsystem.models.ReceiptMaterial;
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
        public void checkItemQty(int qty, boolean s){
        
        boolean expectedOutput = s;
        boolean actualOutput = siteManagerController.checkOrderQuantity(qty);
                 
                 assertEquals(expectedOutput,actualOutput);
        
    }
    
     
    @Test
    public void GoodRecieptTest(){
        GoodReceiptController gr = new GoodReceiptController();
        gr.addReceiptItem();
        assertEquals(true,gr.checkRecieptItem());   
    }
    @Test
        public void checkPaymentTest(){
        PaymentController pr = new PaymentController();
        pr.checkAddPayment();
        assertEquals(true,pr.checkAddPayment());   
    }
      @Test
        public void checkManagementTest(){
        ManagementController mc = new ManagementController();
        mc.checkAddNewManger();
        assertEquals(true,mc.checkAddNewManger());   
    }
        @Test
        public void checkSiteTest(){
            SiteController sc = new SiteController();
            sc.addSite();
               assertEquals(true,sc.addSite());   
        }
    
}
