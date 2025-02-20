public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println("After if");
            i++;
        }
    }
}