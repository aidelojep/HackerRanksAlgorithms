package com.hackerrank.questions;

import java.util.ArrayList;

public class OddNumbers
{
    public static ArrayList findOddNumbers (int l, int r)
    {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int x=l; x<=r;x++)
        {
            if(x % 2 != 0)
            {
                odd.add(x);
            }
        }
      return odd;

    }
    public static void oddNumbersBetweenOneAndHundred(){
        for(int i=1; i<=100; i++)
        {
            if( i % 2 != 0){
                System.out.println(i);
            }


        }
    }

    public static void main(String[] args) {
        System.out.println(findOddNumbers(2,20));
        oddNumbersBetweenOneAndHundred();
    }


}
