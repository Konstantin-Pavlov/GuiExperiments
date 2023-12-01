package useful_methods;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LocalDateGetFridays13 {
    public static void main(String[] args) {
        // сколько пятниц 13 в промежутке от 1900 до 2020, вывести года с макс количеством
        LocalDate startDate = LocalDate.of(1900, 1, 1); // Начальная дата
        LocalDate endDate = LocalDate.of(2020, 1, 1); // Конечная дата

        Map<Year, Integer> fridays13 = new LinkedHashMap<>();

        LocalDate currentDate = startDate;
        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            int year = currentDate.getYear();
            int month = currentDate.getMonthValue();
            int day = currentDate.getDayOfMonth();

            if (currentDate.getDayOfWeek().equals(DayOfWeek.FRIDAY) && currentDate.getDayOfMonth() == 13) {
                // System.out.println(currentDate.getDayOfWeek() +
                // " " + currentDate.getDayOfMonth() +
                // " " + currentDate.getMonth() +
                // " " + currentDate.getYear()
                // );
                
                // key, (k, v) -> (v == null) ? value : v + value
                LocalDate finalCurrentDate = currentDate;
                fridays13.compute(Year.of(currentDate.getYear()), (k, v) -> (v == null) ? 1 : v + 1);
            }

            // Ваш код для обработки года, месяца и дня
            // System.out.println(currentDate.getDayOfWeek() + " " +
            // currentDate.getDayOfMonth());

            currentDate = currentDate.plusDays(1); // Переход к следующей дате
        }

        System.out.println(fridays13);
        Optional<Map.Entry<Year, Integer>> maxEntry = fridays13.entrySet().stream().max(Map.Entry.comparingByValue());
        if (maxEntry.isPresent()) {
            int maxValue = maxEntry.get().getValue();
            Map<Year, Integer> fridays13Filtered = fridays13.entrySet().stream()
                    .filter(v -> v.getValue().equals(maxValue))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                            LinkedHashMap::new));
            fridays13Filtered.forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }

}
