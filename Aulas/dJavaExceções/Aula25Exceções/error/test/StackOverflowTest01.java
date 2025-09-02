package dJavaExceções.Aula25Exceções.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        StackOverflowTest01.recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
