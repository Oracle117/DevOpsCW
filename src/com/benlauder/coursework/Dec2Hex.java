package src.com.benlauder.coursework;
class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        // Check if no input argument is provided
        if (args.length == 0) {
            System.out.println("Error: No input argument provided.");
            return;
        }

        try {
            // Try to parse the input argument to an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle the case where the input argument is not a valid integer
            System.out.println("Error: Input argument is not a valid integer.");
            return;
        }

        // Array of characters to represent hexadecimal digits
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        // Loop to convert decimal to hexadecimal
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        // Print the hexadecimal representation
        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
