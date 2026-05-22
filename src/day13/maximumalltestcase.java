package day13;

import java.util.Arrays;

class MaximumTest<T extends Comparable<T>>
{
    T[] values;

    MaximumTest(T... values)
    {
        this.values = values;
    }

    public T testMaximum()
    {
        return printMax(values);
    }

    public static
    <T extends Comparable<T>>
    T printMax(T... values)
    {
        Arrays.sort(values);

        T max = values[values.length - 1];

        System.out.println(
        "Maximum value : "+max);

        return max;
    }
}

public class maximumalltestcase
{
    public static void main(String[] args)
    {

        MaximumTest<Integer> i =
        new MaximumTest<>(
        10,50,30,90,20);

        i.testMaximum();



        MaximumTest<Float> f =
        new MaximumTest<>(
        10.5f,7.8f,15.2f,99.9f);

        f.testMaximum();



        MaximumTest<String> s =
        new MaximumTest<>(
        "Apple",
        "Peach",
        "Banana",
        "Orange");

        s.testMaximum();
    }
}