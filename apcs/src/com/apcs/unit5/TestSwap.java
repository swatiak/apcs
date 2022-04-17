package com.apcs.unit5;

public class TestSwap
{
public static void swap(IntPair pair)
{
int temp = pair.getFirst();
pair.setFirst(pair.getSecond());
pair.setSecond(temp);
}
public static void main(String[] args)
{
int x = 8, y = 6;
IntPair iPair = new IntPair(x, y);
swap(iPair);
x = iPair.getFirst();
y = iPair.getSecond();
}
}
