/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Creator.Projektant;
import Creator.Projektant1;
import Creator.Projektant4;

/**
 *
 * @author MK
 */
public class Sef {// Client

    Projektant proj; // Creator   

    Sef(Projektant proj1) {
        proj = proj1;
    }

    public static void main(String args[]) {
        Sef sef;
// ConcreteCreator
        Projektant proj = new Projektant4(); // Promenljivo!!!
        sef = new Sef(proj);
        sef.Kreiraj();
    }

    void Kreiraj() {
        proj.Kreiraj();
    }

}
