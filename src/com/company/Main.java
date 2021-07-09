package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        int value=123;


//
//        for(int i=1;i<=500;i++){
//            int value = i;
//            int sum=0;
////            value = 123;
//            while(value!=0){
//                int remainder = value%10;
//                sum = sum+(remainder*remainder*remainder);
//                value=value/10;
////                System.out.println("Remainder "+ remainder + " Next Value "+ value+ " Sum "+sum);
//            }
//            System.out.println(sum+" "+i);
////            break;

//        }
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=500;i++){
            int value =i;
            int sum=0;
            while(value!=0){
                int rim=value%10;
                sum=sum+(rim*rim*rim);
                value=value/10;
//                System.out.println( "sum" +sum);
            }
//            System.out.println( "sum" +sum);
            if (sum == i){
                System.out.println("your number is Armstrong "+i);
            }
//            else{
//                System.out.println("your number is not Armstrong"+i);
//            }



        }
    }
}
