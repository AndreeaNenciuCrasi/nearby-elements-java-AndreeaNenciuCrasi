import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    class NearbyElements {

        static int[][] multi = new int[][] { { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 }, { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 } };

        public static int[] nearby(int x, int y, int range) {
            int before=Math.min(range,y);
            int after=Math.min(range,multi[x].length-1-y);
            int[] results = new int[before+after];
            int count=0;
            for (int i=y-before;i<y;i++)
                results[count++]=multi[x][i];

            for (int i=y+1;i<=y+after;i++)
                results[count++]=multi[x][i];

            return results;
        }
    }
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int x = Integer.parseInt(bufferedReader.readLine().trim());

            int y = Integer.parseInt(bufferedReader.readLine().trim());

            int range = Integer.parseInt(bufferedReader.readLine().trim());

            int[] result = Result.nearby(x, y, range);

            // convert int[] to List<Integer>
            List<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < result.length; ++i) {
                resultList.add(result[i]);
            }

            bufferedWriter.write(
                    resultList.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
