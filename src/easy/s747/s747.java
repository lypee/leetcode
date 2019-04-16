package easy.s747;

import java.util.ArrayList;
import java.util.Collections;

public class s747 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0};
        System.out.println(dominanIndex_Two(nums));
    }

    public static int dominanIndex_Two(int[] nums) {
        if (nums.length == 1) return -1;
        else if (nums.length == 2) {
            int secondLarget = 0;
            int mostLarget = 1;
            if (nums[0] > nums[1]) {
                mostLarget = 0;
                secondLarget = 1;
            } else {
                mostLarget = 1;
                secondLarget = 0;
            }
            if (nums[mostLarget] >= 2 * nums[secondLarget]) {
                return mostLarget;
            } else {
                return -1;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        int sec = (int) arrayList.get(1);
        int larg = (int) arrayList.get(0);
        System.out.println(sec + " , " + larg);
        if (larg > 2 * sec) {
            System.out.println("存在");
            //如果存在最大数大于次大数的两倍 找出下标
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == larg) return i;
            }
        }
        return -1;
    }


    public static int dominanIndex(int[] nums) {
        int secondLarget = 0;
        int mostLarget = 1;
        if (nums.length == 1) return -1;
        else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                mostLarget = 0;
                secondLarget = 1;
            } else {
                mostLarget = 1;
                secondLarget = 0;
            }
            if (nums[mostLarget] >= 2 * nums[secondLarget]) {
                return mostLarget;
            } else {
                return -1;
            }
        } else {
            System.out.println("数组长度大于3");
            //先判断nums[0] 和nums[1]的大小
            mostLarget = 0;
            secondLarget = 0;
            //判断完毕后再从整个数组中进行比较
            for (int i = 0; i < nums.length; i++) {
                //先判断是否大于次大的数 &&小于最大的数
                if (nums[i] > nums[mostLarget]) {
                    //最大的数
                    secondLarget = mostLarget;
                    mostLarget = i;
                } else if (nums[i] >= nums[secondLarget] && nums[i] <= nums[mostLarget]) {
                    secondLarget = i;
                }
            }


            //最后的判断 是否返回-1 还是返回MostLarget
            if (nums[mostLarget] >= 2 * nums[secondLarget]) {
                System.out.println(mostLarget + " , " + secondLarget);
                return mostLarget;
            } else {
                System.out.println("返回-1 " + mostLarget + " , " + secondLarget);

                return -1;
            }
        }


    }
}
