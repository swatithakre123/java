package A;

class LambdaMathExample {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation add = (a, b) -> a + b;
        
        // Lambda expression for subtraction
        MathOperation subtract = (a, b) -> a - b;

        // Perform addition
        System.out.println("5 + 3 = " + operate(5, 3, add));

        // Perform subtraction
        System.out.println("5 - 3 = " + operate(5, 3, subtract));
    }

    // Functional interface for math operations
    interface MathOperation {
        int operate(int a, int b);
    }
        // Method to perform operation using lambda expression
        private static int operate(int a, int b, MathOperation operation) {
            return operation.operate(a, b);
        }
    }
    
    

