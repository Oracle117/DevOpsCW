package src.com.benlauder.coursework;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Before
    public void setUp() {
        // No setup required for this test class
    }

    @Test
    public void testDecimalToHexadecimal() {
        assertEquals("Hexadecimal conversion failed", "A", convertDecimalToHex(10));
        final String HEX_CONVERSION_FAILED = "Hexadecimal conversion failed";
        assertEquals(HEX_CONVERSION_FAILED, "1E", convertDecimalToHex(30));
        assertEquals(HEX_CONVERSION_FAILED, "FF", convertDecimalToHex(255));
        assertEquals(HEX_CONVERSION_FAILED, "0", convertDecimalToHex(0));
        }

    @Test
    public void testNegativeDecimalToHexadecimal() {
        assertEquals("Hexadecimal conversion failed for negative number", "-A", convertDecimalToHex(-10));
    }

     private String convertDecimalToHex(int decimal) {
        // Array of characters to represent hexadecimal digits
        int rem;
        int num;
        num = decimal;
        String hexadecimal = "";
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num;
        }
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};



        // Loop to convert decimal to hexadecimal
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            rem = num % 16;
            sb.insert(0, ch[rem]);
            num = num / 16;
        }

        if (sb.length() == 0) {
            sb.append("0");
        }

        hexadecimal = sb.toString();

        if (isNegative) {
            hexadecimal = "-" + hexadecimal;
        }

        return hexadecimal;
    }
}
