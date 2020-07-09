/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danskebankpros2;
import java.util.ArrayList;
/**
 *
 * @author vykin
 */
public class DanskeBankPros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        ArrayList<Integer> array = new ArrayList<>();
        array = luckyNumbers(arr);
        
        for(int sk=0; sk<array.size(); sk++)
        {
            System.out.println(array.get(sk));
        }
        
    }
    
    public static ArrayList luckyNumbers(int[] arr)
{{
    ArrayList<Integer> newArr = new ArrayList<>();
    
        if( arr[0]%2==0){
            for(int sk=0; sk<arr.length; sk++)
            {
                if(arr[sk]%2==0) newArr.add(arr[sk]);
            }

        }
        else{
            for(int sk=0; sk<arr.length; sk++)
            {
                if(arr[sk]%2==1) newArr.add(arr[sk]);
            }
        }
        
        if(newArr.size()>newArr.get(1))
        {
            for(int sk=newArr.get(1)-1; sk<newArr.size(); sk+=newArr.get(1))
            {
                newArr.remove(sk);
            }
        }
        
    return newArr;
}}

        

}
