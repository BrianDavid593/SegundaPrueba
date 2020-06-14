/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

/**
 *
 * @author brian
 */
public class ProbadorAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Automovil a1=new Automovil("audi","q3","1111 abc",2001);
        Automovil a2=new Automovil("renault","megane","2222 def",2007);
        Automovil a3=new Automovil("kia","sportage","3333 ghi",2012);
        Automovil a4=new Automovil("ford","fiesta","4444 jkl",1989);
        
        HashSet<Automovil> coches=new HashSet<Automovil>();
        coches.add(a1);
        coches.add(a2);
        coches.add(a3);
        coches.add(a4);
        LinkedHashSet<Automovil> coches1=new LinkedHashSet<Automovil>();
        coches1.add(a1);
        coches1.add(a2);
        coches1.add(a3);
        coches1.add(a4);
        TreeSet<Automovil> coches2=new TreeSet<Automovil>(Comparator.comparing(Automovil::getMatricula));
        coches2.add(a1);
        coches2.add(a2);
        coches2.add(a3);
        coches2.add(a4);
        
        Iterator<Automovil> it=coches.iterator();
        Iterator<Automovil> it1=coches1.iterator();
        Iterator<Automovil> it2=coches2.iterator();
        System.out.println("HashSet");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("LinkedHasSet");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("TreeSet");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
    
}
