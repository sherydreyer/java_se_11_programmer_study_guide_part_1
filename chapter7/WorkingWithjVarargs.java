package chapter7;

public class WorkingWithjVarargs {
    public static void main(String[] args) {
//        A varargs parameter must be the last
//        element in a method’s parameter list.
//        It is treated as an array
        walk5(1); // 0
        walk5(1, 2); // 1
        walk5(1, 2, 3); // 2
        walk5(1, new int[]{4, 5}); // 2

        //paasing null to the varargs
        // walk5(1, null); // throws a NullPointerException

        //acces a varargs like an array
      run(11, 22); // 22

    }

    public void walk1(int... nums) {
    }

    public void walk2(int start, int... nums) {
    }

    ////        public void walk3(int... nums, int start) {} // DOES NOT COMPILE, it must be the last param
//        public void walk4(int... start, int... nums) {} // DOES NOT COMPILE, only one varargs allowed at the end
    public static void walk5(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void run(int... nums) {
        System.out.println(nums[1]);
    }


}

