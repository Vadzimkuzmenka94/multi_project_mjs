import java.util.Arrays;

public class Utils {

    StringUtiils stringUtiils = new StringUtiils();
    boolean isAllPositiveNumbers (String... str) {
      boolean result =  Arrays.stream(str).noneMatch(el -> stringUtiils.isPositiveNumber(el) == false);
      return result;


       /* boolean result = true; // it's no streams option
        for (String s : str) {
            if (stringUtiils.isPositiveNumber(s) == false) {
                result = false;
                break;
            }
        } return result;*/
    }
}
