/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import AbstractProductA.EkranskaForma;
import AbstractProductB.BrokerBazePodataka;
import AbstractProductC.Kontroler;

/**
 *
 * @author MK
 */
public class SoftverskiSistem1 implements SoftverskiSistem// ConcretePrototype
{

    EkranskaForma ef; // AbstractProductA 
    BrokerBazePodataka bbp; // AbstractProductB 
    Kontroler kon; // AbstractProductC 

    public SoftverskiSistem1(EkranskaForma ef1, BrokerBazePodataka bbp1, Kontroler kon1) {
        ef = ef1;
        bbp = bbp1;
        kon = kon1;
    }

    public SoftverskiSistem1(SoftverskiSistem1 ss1) {
        ef = ss1.ef;
        bbp = ss1.bbp;
        kon = ss1.kon;
    }

    @Override
    public void prikaziEkranskuFormu() {
        ef.prikaziEkranskuFormu();
    }

    @Override
    public void zatvoriEkranskuFormu() {
        ef.zatvoriEkranskuFormu();
    }

    @Override
    public SoftverskiSistem Clone() {
        return new SoftverskiSistem1(this);
    }
}
