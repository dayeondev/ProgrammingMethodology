import java.time.*;
import java.util.*;

class Main {
  public static void main(String[] args) {

    // GregorianCalendar calendar = new GregorianCalendar();
    // System.out.println(calendar.getTime());
    System.out.println("************");
    System.out.println("Example01");
    System.out.println("************");
    System.out.println();
    System.out.print("100 days ago: ");
    System.out.println(LocalDate.now().plusDays(-100));
    System.out.print("Today: ");
    System.out.println(LocalDate.now());
    System.out.print("100 days later: ");
    System.out.println(LocalDate.now().plusDays(100));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("************");
    System.out.println("Example02");
    System.out.println("************");
    System.out.println();
    
    Period period = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25));
    System.out.print(period.getMonths());
    System.out.print(" Months ");
    System.out.print(period.getDays());
    System.out.print(" Days to Cristmas!");
  }
}