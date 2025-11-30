import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Task4
    {
        private final LocalDate date;

        public Task4(LocalDate date)
            {
                this.date = date;
            }

        public Task4()
            {
                this.date = LocalDate.now();
            }

        private String findFullMonthName()
            {
                Map<Integer, String> monthNames = new HashMap<>();
                monthNames.put(1, "январь");
                monthNames.put(2, "февраль");
                monthNames.put(3, "март");
                monthNames.put(4, "апрель");
                monthNames.put(5, "май");
                monthNames.put(6, "июнь");
                monthNames.put(7, "июль");
                monthNames.put(8, "август");
                monthNames.put(9, "сентябрь");
                monthNames.put(10, "октябрь");
                monthNames.put(11, "ноябрь");
                monthNames.put(12, "декабрь");

                return monthNames.get(date.getMonthValue());
            }

        private int findMonthNumber()
            {
                return date.getMonthValue();
            }

        private String findFirstDayOfMonthWeekday()
            {
                LocalDate firstDay = date.withDayOfMonth(1);
                DayOfWeek dayOfWeek = firstDay.getDayOfWeek();

                Map<DayOfWeek, String> weekdayNames = new HashMap<>();
                weekdayNames.put(DayOfWeek.MONDAY, "пн");
                weekdayNames.put(DayOfWeek.TUESDAY, "вт");
                weekdayNames.put(DayOfWeek.WEDNESDAY, "ср");
                weekdayNames.put(DayOfWeek.THURSDAY, "чт");
                weekdayNames.put(DayOfWeek.FRIDAY, "пт");
                weekdayNames.put(DayOfWeek.SATURDAY, "сб");
                weekdayNames.put(DayOfWeek.SUNDAY, "вс");

                return weekdayNames.get(dayOfWeek);
            }

        private String findLastDayOfMonth()
            {
                YearMonth yearMonth = YearMonth.from(date);
                return yearMonth.atEndOfMonth().format(DateTimeFormatter.ISO_LOCAL_DATE);
            }

        private int findDaysInMonth()
            {
                return date.lengthOfMonth();
            }

        private String findQuarterWithYear()
            {
                int year = date.getYear();
                int month = date.getMonthValue();
                int quarter = (month - 1) / 3 + 1;

                return year + " Q" + quarter;
            }

        public void printAllInfo()
            {
                System.out.println("Дата: " + date);
                System.out.println("Месяц: " + findFullMonthName());
                System.out.println("Номер месяца: " + findMonthNumber());
                System.out.println("Первый день месяца: " + findFirstDayOfMonthWeekday());
                System.out.println("Последний день месяца: " + findLastDayOfMonth());
                System.out.println("Дней в месяце: " + findDaysInMonth());
                System.out.println("Квартал: " + findQuarterWithYear());
            }

    }
