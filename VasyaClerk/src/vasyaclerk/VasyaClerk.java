/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasyaclerk;

/**
 *
 * @author Mattia
 */
public class VasyaClerk {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static String main(String[] args) {
 
   int[] queue = {25, 25, 50}; //Array di prova
   int money25 = 0;
   int money50= 0;
   int money100 = 0;

   for(int i = 0; i < queue.length; i++){

      //Controllo 25
      if(queue[i] == 25){
      money25++;
      }

      //Controllo 50
      if(queue[i] == 50){
        if(money25 >= 1){
            money25--;
            money50++;
      } else {
       return "NO";
      }
    }

      //Controllo 100
      if(queue[i] == 100){
      if(money25 >= 1 && money50 >= 1){
       money25 -= 1;
       money50 -= 1;
       money100++;
      }else if(money25 >= 3){
        money25 -= 3;
        money100++;
      }else{
        return "NO";
      }
    }


  }
  return "YES";
}
}



