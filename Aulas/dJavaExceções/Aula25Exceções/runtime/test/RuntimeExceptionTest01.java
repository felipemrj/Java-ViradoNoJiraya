package dJavaExceções.Aula25Exceções.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // runtime exception
        Object object = null;
        System.out.println(object.toString());

        // array out of bounds
        int[] nums = {1,2};
        System.out.println(nums[2]);


    }
}
