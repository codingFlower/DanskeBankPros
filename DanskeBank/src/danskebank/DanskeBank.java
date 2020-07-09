/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danskebank;
import java.util.*;

/**
 *
 * @author vykin
 */
public class DanskeBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(replaceDuplicate("worrld"));
        System.out.println(replacePi("i don't know pi value"));
        System.out.println(replaceBoth("I donn't knoow pii value, so I will go eat my ppiie..."));
        
    }
    
    
    
    
    public static String replaceDuplicate(String word)
{
    char[] ch = new char[word.length()];
    String newWord = "";
    for(int sk=0; sk<word.length(); sk++)
    {
        ch[sk] = word.charAt(sk);
        
    }
    for(int sk=0; sk<word.length()-1; sk++)
    {
        if(ch[sk]==ch[sk+1])
        {
            ch[sk+1]='0';
        }
    }
    for(int sk=0; sk<word.length(); sk++)
    {
        if(ch[sk]!='0')
        {
            newWord +=ch[sk];
        }
    }
    
    return newWord;
}
    
      public static String replacePi(String word)
{
    char[] ch = new char[word.length()];
    String newWord = "";
    for(int sk=0; sk<word.length(); sk++)
    {
        ch[sk] = word.charAt(sk);
        
    }
    for(int sk=0; sk<word.length()-1; sk++)
    {
        if(ch[sk]=='p' && ch[sk+1]=='i' && ch[sk+2]==' ')
        {
            ch[sk]='0';
            ch[sk+1]='0';
        }
    }
    for(int sk=0; sk<word.length(); sk++)
    {
        if(ch[sk]!='0')
        {
            newWord +=ch[sk];
        }
        else{
            newWord +="3.14";
            sk++;
        }
    }
    
    return newWord;
}
      public static String replaceBoth(String word)
{
    word = replaceDuplicate(word);
    word = replacePi(word);
    
    return word;
}
    
    
}

