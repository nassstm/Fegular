import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Found {

     public static void Find(String wrd){
        int count = 0;
        /
        Pattern pattern = Pattern.compile("nn");
        Matcher matcher = pattern.matcher(wrd);

        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
