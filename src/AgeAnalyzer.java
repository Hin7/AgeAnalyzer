/**
 * Решение задачи 2011 СГУ (анализ возраста) на языке Java
 *
 * @author Hin7
 * @version 1.0 30.10.2019
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;


public class AgeAnalyzer {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(Paths.get("input.txt"), "UTF-8");
            PrintWriter out = new PrintWriter("output.txt", "UTF-8");
            int Age = in.nextInt();
            if (Age < 7)
                out.println("preschool child");
            else if (Age < 18)
                out.println("schoolchild " + (Age - 6));
            else if (Age < 23)
                out.println("student " + (Age - 17));
            else
                out.println("specialist");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
