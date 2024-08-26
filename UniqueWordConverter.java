/**
Write a program to convert a given word into a unique word by removing all repeating characters in it.
  eg:- application -> aplictons
       programming -> progamin
*/

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Word");
        String s=sc.nextLine(); 
        String s1=""; int n=s.length(),i,j,k=0; char ch,ch1;
        for(i=0;i<n;i++){
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            for(j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j))
                s=s.replace(s.charAt(i),' ');
            }
        }
        System.out.println("Unique Word: "+s1);
    }
}
