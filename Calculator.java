public class Calculator { 
    public static void main(String[] args) { 
    int a = 15; 
    int b = 2;
 
    System.out.println("Addition: " + add(a, b)); 
    System.out.println("Subtraction: " + subtract(a, b)); 


    }
        public static int add(int a, int b) { 
        return a + b; 
    }
        public static int subtract(int a, int b) { 
        return a - b; 
    } 


}
