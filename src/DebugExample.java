
        public class DebugExample {

            public static void main(String[] args) {
                int sum = 0;
                for (int i = 1; i <= 5; i++) {
                    sum += calculateSquare(i);
                    System.out.println("Sum after adding square of " + i + " is: " + sum);
                }
                System.out.println("Final Sum: " + sum);
            }
            public static int calculateSquare(int num) {
                return num * num;
            }
        }



