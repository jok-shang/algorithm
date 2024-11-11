/**
 * @author: 船长
 * @create: 2024-11-11 22:42
 **/


import java.util.Arrays;

/**
    冒泡排序
    思路：
        1. 比较相邻的元素，如果第一个比第二个大，就交换它们两个；
        2. 对每一对相邻元素作同样的比价，从开始第一对到结尾的最后一对，这样在最后的元素就是最大的数；
        3. 针对所有的元素重复以上的步骤，除了数组最后已经排好序的数组；
        4. 重复步骤1~3，直到排序完成。
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1, 34, 25, 90, 67};
        int[] ints = bubbleSort(array);
        Arrays.stream(ints).forEach(System.out::println);
    }

    private static int[] bubbleSort(int[] array) {
        // 外层循环控制遍历的次数
        for (int i = 0; i < array.length - 1; i++) {
            // 内层循环负责相邻元素之间的比较和交换
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换元素
                    int temp = array[j];      // 暂存当前元素
                    array[j] = array[j + 1];  // 将后一个元素的值赋给前一个元素
                    array[j + 1] = temp;      // 将暂存的值（原前一个元素的值）赋给后一个元素
                }
            }
        }
        return array;
    }
}
