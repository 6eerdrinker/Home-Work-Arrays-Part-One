public class HWArraysPartOne {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 1. Массив 1.");
        int[] nums = new int[]{1, 2, 3};
        nums[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 1. Массив 2.");
        double[] nums1 = {1.57, 7.654, 9.986};
        nums1[0] = 1.57;
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 1. Массив 3.");
        // Динамика уменьшения продолжительности дня в часах за неделю.
        double[] longDay = {12.48, 12.45, 12.41, 12.37, 12.33, 12.30, 12.26};
        longDay[0] = 12.48;
        for (int i = 0; i < 7; i++) {
            System.out.println(longDay[i]);
        }
        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 2.");
        // массив 1
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }
        // массив 2
        for (int i = 0; i < nums1.length; i++) {
            if (i == nums1.length - 1) {
                System.out.println(nums1
                        [i]);
                break;
            }
            System.out.print(nums1[i] + ", ");
        }
        // массив 3
        for (int i = 0; i < 7; i++) {
            if (i == longDay.length - 1) {
                System.out.println(longDay[i]);
                break;
            } System.out.print(longDay[i] + ", ");}

        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 3.");

// массив 1
        for (int i = 2; i < nums.length; i--) {
            if (i == nums.length - 3) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }
        // массив 2
        for (int i = 2; i < nums1.length; i--) {
            if (i == nums1.length - 3) {
                System.out.println(nums1[i]);
                break;
            }
            System.out.print(nums1[i] + ", ");
        }
        // массив 3
        for (int i = 6; i < longDay.length; i--) {
            if (i == longDay.length - 7) {
                System.out.println(longDay[i]);
                break;
            }
            System.out.print(longDay[i] + ", ");
        }
        System.out.println();
        System.out.println("Массивы. Часть 1. Задача 4.");
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 != 0){
                nums[i] = nums[i]+ 1;
                if (i == nums.length - 1) {
                    System.out.println(nums[i]);
                    break;
                }
                System.out.print(nums[i] + ", ");
            }

    }
}
