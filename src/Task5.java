import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task5
    {

        public static String calculateTimeLeft(String eventDateTimeStr)
            {
                try
                    {
                        LocalDateTime eventDateTime = parseDate(eventDateTimeStr);
                        LocalDateTime now = LocalDateTime.now();

                        long days = calculateDays(now, eventDateTime);
                        long hours = calculateHours(now, eventDateTime, days);
                        long minutes = calculateMinutes(now, eventDateTime, days, hours);

                        return formatResult(days, hours, minutes);

                    } catch (Exception e)
                    {
                        return "неверный формат даты. Используйте формат: dd.MM.yyyy HH:mm";
                    }
            }

        private static LocalDateTime parseDate(String date)
            {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                return LocalDateTime.parse(date, formatter);
            }

        private static long calculateDays(LocalDateTime now, LocalDateTime event)
            {
                return ChronoUnit.DAYS.between(now, event);
            }

        private static long calculateHours(LocalDateTime now, LocalDateTime event, long days)
            {
                LocalDateTime tmp = now.plusDays(days);
                return ChronoUnit.HOURS.between(tmp, event);
            }

        private static long calculateMinutes(LocalDateTime now, LocalDateTime event, long days, long hours)
            {
                LocalDateTime tmp = now.plusDays(days).plusHours(hours);
                return ChronoUnit.MINUTES.between(tmp, event);
            }

        private static String formatResult(long days, long hours, long minutes)
            {
                StringBuilder result = new StringBuilder();

                if (days > 0) result.append(days).append(" ").append(calculateTimeForm(days, "день", "дня", "дней"));

                if (hours > 0)
                    {
                        if (result.length() > 0) result.append(" ");
                        result.append(hours).append(" ").append(calculateTimeForm(hours, "час", "часа", "часов"));
                    }

                if (minutes > 0)
                    {
                        if (result.length() > 0) result.append(" ");
                        result.append(minutes).append(" ").append(calculateTimeForm(minutes, "минута", "минуты", "минут"));
                    }

                return result.length() == 0 ? "Уже наступило!" : result.toString();
            }

        private static String calculateTimeForm(long number, String form1, String form2, String form5)
            {
                long n = Math.abs(number) % 100;
                long n1 = n % 10;

                if (n > 10 && n < 20) return form5;
                if (n1 > 1 && n1 < 5) return form2;
                if (n1 == 1) return form1;
                return form5;
            }
    }
