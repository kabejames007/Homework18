package edu.dmacc.codedsm.hw18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzBuzzFileRepository implements MapRepository {
    private PrintWriter out = null;
    @Override
    public void save(Result result) {
        try {
            out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("‘fizzbuzz_result.txt", true)));
            out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}