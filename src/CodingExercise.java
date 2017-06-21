import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by naofumiezaki on 6/20/17.
 */
public class CodingExercise {
    public static void main (String[] args){
        String fileName = "src/input.txt";

        String s = String.join("\n"
                , "Lead Chef, Chipotle, Denver, CO, 10, 15"
                , "Stunt Double, Equity, Los Angeles, CA, 15, 25"
                , "Manager of Fun, IBM, Albany, NY, 30, 40"
                , "Associate Tattoo Artist, Tit 4 Tat, Brooklyn, NY, 250, 275"
                , "Assistant to the Regional Manager, IBM, Scranton, PA, 10, 15"
                , "Lead Guitarist, Philharmonic, Woodstock, NY, 100, 200"
        );

        System.out.println("All Opportunities");
        Arrays.stream(s.split(System.getProperty("line.separator"))).map(x -> x.split(","))
                .map(array -> new Opportunity(array[0].trim(), array[1].trim(), array[2].trim(), array[3].trim(), array[4].trim(), array[5].trim()))
                .sorted( (Opportunity o1, Opportunity o2 ) -> o1.getTitle().compareTo(o2.getTitle()))
                .collect(Collectors.toList())
                .forEach(o -> System.out.println(o));
    }
}