public class LiteralTypingLab {
    static void main() {
        long a = 2147483648L;
        float b = 3.14F;
        byte c = (byte)128;
        char d = (char) 65536;
        int e = 1_00_0_0;

        // int e = 1_3433_454_; here the underscore is in the end thats why it is not valid
    }
}
