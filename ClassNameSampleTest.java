public class ClassNameSampleTest {
    private static ClassNameSample className;
    public static final String[] validClassName = new String[] { "C0318G"};
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassNameSample();

        for (String email : validClassName) {
            boolean isvalid = className.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidClassName) {
            boolean isvalid = className.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
