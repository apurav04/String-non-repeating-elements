package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.nextLine();
        nonrepeating(str);



    }
    public static void nonrepeating(String str){
        char  temp[]= str.toCharArray();
        int[] fre= new int[200];
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            fre[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    fre[i]++;
                    temp[j]='-';
                }


            }
        }
        for(int i=0;i<str.length();i++){
            if(fre[i]==1 && temp[i]!=' ' && temp[i]!='-'){
                System.out.print(temp[i]);
            }
        }


    }
}
