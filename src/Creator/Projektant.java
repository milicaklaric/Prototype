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
import Product.*;

public abstract class Projektant {

    SoftverskiSistem ss;

    abstract EkranskaForma kreirajEkranskuFormu();

    abstract BrokerBazePodataka kreirajBrokerBazePodataka();

    abstract Kontroler kreirajKontroler(EkranskaForma ef, BrokerBazePodataka bbp);

    public void Kreiraj() {
        EkranskaForma ef = kreirajEkranskuFormu();
        BrokerBazePodataka bbp = kreirajBrokerBazePodataka();
        Kontroler kon = kreirajKontroler(ef, bbp);
        ss = new SoftverskiSistem1(ef, bbp, kon);
        ss.prikaziEkranskuFormu();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
        ss.zatvoriEkranskuFormu();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
        SoftverskiSistem ss1 = ss.Clone();
        ss1.prikaziEkranskuFormu();
    }

}
