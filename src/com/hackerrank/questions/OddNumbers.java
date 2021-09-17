package com.hackerrank.questions;

import java.util.ArrayList;

public class OddNumbers
{
    public static ArrayList findOddNumbers (int start, int end)
    {
        if(start < 0 || end < 0){
            throw new IllegalArgumentException("Number cannot be lessed than zero!!");
        }

        if(start > end){
            int temp = start;
            start = end;
            end = temp;
        }

        ArrayList<Integer> odd = new ArrayList<>();

        for(int x=start; x<=end; x++)
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
        System.out.println(findOddNumbers(50,40));
        oddNumbersBetweenOneAndHundred();
    }


}
