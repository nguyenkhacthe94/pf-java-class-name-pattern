import java.util.regex.*;

public class ClassNameSample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]";

    public ClassNameSample() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
