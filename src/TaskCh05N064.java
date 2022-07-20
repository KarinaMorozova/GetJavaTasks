import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * В области 12 районов. Известны количество жителей (в тысячах человек)
 * и площадь (в км2) каждого района. Определить среднюю плотность населения
 * по области в целом.
 */

public class TaskCh05N064 {

    static double averageDensity(List<Double> people, List<Double> areas){
        double sum = 0;
        for (int i = 0; i < people.size(); i++) {
            sum = sum + people.get(i) / areas.get(i);
        }
        sum = sum / people.size();

        return sum;
    }

    public static void main(String[] args) throws IOException {
        List<Double> populations = new ArrayList<>();
        List<Double> squares = new ArrayList<>();

        BufferedReader reader =
                new BufferedReader(new FileReader(System.getProperty( "user.dir" )
                        + File.separator + "src" + File.separator + "564.txt"));

        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            populations.add(Double.parseDouble(str[0]));
            squares.add(Double.parseDouble(str[1]));
        }
        reader.close();

        System.out.println(averageDensity(populations, squares));
    }
}
