package classwork;

import java.util.Arrays;

public class Genome {

    /*
    * A C G T
    *
    * N = 100000
    *
    *
    * ACGTTTTGGACCCTAAAGTCGAAATCGCTAGXCTCCCTTTAGAGAGATCTCTCTGATATTATGGGCGCTTTCAAAA
    *
    *
     */
    public static void main(String[] args) {
        byte[] data = GenomGenerator.generate(30);

        for (byte symbol: data) {
            System.out.print((char)symbol);
        }
        findDuplicates(data, 3);
    }

    private static void findDuplicates(byte[] data, int w) {
        for (int i = 0; i < data.length - w; i++) {
            for (int j = i + 1; j < data.length - w + 1; j++) {
                boolean found = true;
                for (int k = 0; k < w; k++) {
                    if (data[i + k] != data[j]) {
                        found = false;
                    }
                }
                if (found) {
                    System.out.print("\nFind! ");
                }
            }
        }
    }
}

