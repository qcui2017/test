package com.company;

public class Main {

    private static final String Sepertor=",";

    public static void main(String[] args) {
        long begin = System.nanoTime();
        int[] sortedContinualArray=generateSortedAndDiscontinuousArray(1000);
        long end = System.nanoTime();

        System.out.println("生成执行耗时:" + (end - begin) + "ns");
        //printData(sortedContinualArray);
        String result = toString(sortedContinualArray);
        System.out.println(result);

        end = System.nanoTime();

        System.out.println("执行耗时:" + (end - begin) + "ns");
    }


    /**
     * 打印数据及执行耗时
     * @param source
     */
    public static void printData(int[] source) {
        if (null == source){
            System.out.println("无数据");
        }

        for (int index = 0; index < source.length; index++) {
            System.out.println(source[index]);
        }
    }

    /**
     * 生成排序且不连续的整形数组
     * @param generateCount
     * @return
     */
    public static int[] generateSortedAndDiscontinuousArray(int generateCount) {
        if (generateCount <= 0)
            return new int[0];

        int[] targetArray = new int[generateCount];

        for (int index = 0; index < generateCount; index++) {
            targetArray[index] = index * 2 + index % 2;
        }
        return targetArray;
    }

    public static String toString(int[] arrays){
        if (arrays == null)
            return "null";
        int iMax = arrays.length - 1;
        if (iMax == -1)
            return "";

        StringBuffer b = new StringBuffer();
        for (int i = 0; ;i++) {
            b.append(arrays[i]);
            if (i == iMax)
                return b.toString();
            b.append(Sepertor);
        }
    }
}
