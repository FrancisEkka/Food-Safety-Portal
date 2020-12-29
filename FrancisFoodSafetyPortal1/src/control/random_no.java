/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author Francis
 */
public final class random_no {
    
    public final int getnum(){
//    "Generating 10 random integers in range 0..99."    
    //note a single Random object is reused here
    Random randomGenerator = new Random();
      int randomInt = randomGenerator.nextInt(99999999);
    
        return randomInt;
    
  }
    
}
