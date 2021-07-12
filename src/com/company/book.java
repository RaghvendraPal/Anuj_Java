package com.company;
import java.util.*;
public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /* 1. Q
        System.out.println("enter your string ");
        String s=sc.nextLine();
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
        if (s.equals(rev)){
            System.out.println("Yes Your String is palindrome "+s);
        }
        else{
            System.out.println("No Your String is not palindrome\n"+s+"!="+rev);
        }

       */
        /* 2. Q
        System.out.println("String");
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(s.substring(a,b));
        */
        /* 3. Q
        System.out.println("enter your string");
        String s = sc.nextLine();
        System.out.println("enter your number ");
        int k=sc.nextInt();
        int x=s.length()-(k-1);
        String [] s_array = new String[x];
        String a ;
        for (int i = 0; i < s.length()-(k-1); i++) {

            a = s.substring(0 + i, k + i);
            s_array[i] = a;
            System.out.println(a+i+(k+i));
        }
        int min=0,minindex=0;
        for (int j=0;j< s_array.length;j++) {
           int  sum=0;
            for(int c=0;c<k;c++){
                char ch=s_array[j].charAt(c);
                int y=ch;
                sum=sum+y;
            }
            if (j==0){
                min=sum;
                minindex=j;
            }
            else{
                if (sum>min){
                    minindex=j;
                    min=sum;
                }
            }

            System.out.println(s_array[j]+ " "+sum);
        }
        System.out.println(min);
        System.out.println(s_array[minindex]);

         */

    }
}


