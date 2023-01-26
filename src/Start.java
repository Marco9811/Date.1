import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.lengthOfMonth()-today.getDayOfMonth());
        System.out.println(java.time.Year.of(today.getYear()).length()-today.getDayOfYear());
    }
}
