/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creator;

/**
 *
 * @author MK
 */
import AbstractProductA.*;
import AbstractProductB.*;
import AbstractProductC.*;

// Promenljivo!!!
public class Projektant4 extends Projektant {
@Override
    public EkranskaForma kreirajEkranskuFormu() 
      { Panel pan = new Panel2(); // Promenljivo!!!
        EkranskaForma ef = new EkranskaForma2(); // Promenljivo!!!
        ef.setPanel(pan);
        return ef;
      }   
    
    @Override
    public BrokerBazePodataka kreirajBrokerBazePodataka () 
      { return new BrokerBazePodataka2(); // Promenljivo!!!
      }  
        
    @Override
    public Kontroler kreirajKontroler (EkranskaForma ef, BrokerBazePodataka bbp) 
      { return new Kontroler2(ef,bbp); // Promenljivo!!!
      }
}
