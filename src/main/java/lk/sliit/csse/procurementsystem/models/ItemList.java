package lk.sliit.csse.procurementsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class ItemList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long reqOrderNo;
    private int itemId;
    private int qty;
    public ItemList(){}
    public ItemList(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public int getRelavantItemId(String itemId){
        return (int) (Math.random()*100);
    }
}

