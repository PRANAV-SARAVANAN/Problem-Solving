// Given String as input (eg:- One Hundred and twenty One),
// Display the integer value of it (eg:- 121).
// eg:- input - one thousand and five hundred, output - 1500.

import java.io.*;
import java.util.*;
class WordtoNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s,s1="";int i,j,k,k1,l=0,n=0; 
        String arr3[]=new String[40];
        s=sc.nextLine();
        s="x "+s;
        s=s+" p";
        arr3=s.split(" ");

        
        String arr1[]={"one","two","three","four","five","six","seven","eight","nine"};
        String arr2[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String arr2i[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        
        for(i=0;i<arr3.length-1;i+=1){
            for(j=0;j<arr1.length;j+=1){
                if(arr3[i].equals(arr1[j])){
                    if(arr3[i+1].equals("hundred")){
                        n=n+((j+1)*100);i+=1;
                    }
                    else if(arr3[i+1].equals("thousand") && arr3[i-1].equals(s1))
                    n=n*1000;
                    else if(arr3[i+1].equals("thousand")){
                    n=n+((j+1)*1000);i+=1;
                    }
                    else if(arr3[i+1].equals("p") && arr3[i-1].equals("and"))
                    n=n+j+1;
                }
            }
            for(k=0;k<arr2.length;k++){
                if(arr3[i].equals(arr2[k])){
                    s1=arr2[k];
                    n=n+((k+1)*10);
                    if(arr3[i+1].equals("thousand")){
                    n=n*1000;i=i+1;}
                    else{
                        for(k1=0;k1<arr1.length;k1++){
                            if(arr3[i+1].equals(arr1[k1])){
                                n=n+(k1+1);
                            }
                        }
                    }
                }
            }
            for(int l1=0;l1<arr2i.length;l1++){
                if(arr3[i].equals(arr2i[l1]) && arr3[i+1].equals("Thousand")){
                    n=(n*10)+(l1+1);
                    n=n*1000;
                }
                else if(arr3[i].equals(arr2i[l1]) && !(arr3[i+1].equals("Thousand")))
                n=(n*10)+(l1+1);
            }
        }
        System.out.println(n);
    }
}