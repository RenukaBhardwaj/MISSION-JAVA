public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++) {
            if (i%2 == 0) {
                System.out.print(i + " (Even) ");
            } else {
                System.out.print(i + " (Odd) ");
            }
        }
    }
}
