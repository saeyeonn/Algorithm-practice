import java.util.*;

public class HuffmanTest {
    public static void main(String[] args)
    { 
         // number of characters.
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 45, 13, 12, 16, 9, 5 };
 
        Huffman h = new Huffman(charArray, charfreq);
        h.printCode();
    }

}
