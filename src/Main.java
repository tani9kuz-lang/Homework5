//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        int firstFriday = 3;
        for (; firstFriday < 31; ) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }

        //Task 2.1
        int distanceCovered = 0;
        int distance = 42_195;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров");
            distanceCovered = distanceCovered + 500;
            distance = distance - 500;
        } while (distance > 0 && distanceCovered < 42_195);


        //Task 2.2
        System.out.println("Task 2.1");
        int pathTraveled = 0;
        for (int d = 42_195; d > 0; d = d - 500) {
            System.out.println("Держитесь! Осталось " + d + " метров");
            pathTraveled = pathTraveled + 500;
        }

        //Task 3.1
        System.out.println("task 3");
        int sum = 700;
        int parkingDay = 1;
        while (sum >= 100) {
            parkingDay++;
            sum = sum - 100;
            if (parkingDay % 5 == 0) {
                continue;
            }
            if (sum == 0) {
                System.out.println("Вам хватит на " + parkingDay + " дней парковки");
            }
        }

        //Task 3.2
        int budget = 700;
        int parkingDays = 1;
        for (; budget >= 100; parkingDays++) {
            budget = budget - 100;
            if (parkingDays % 5 == 0) {
                parkingDays++;
            }
            if (budget == 0) {
                System.out.println("Вам хватит на " + parkingDays + " дней парковки");
            }
        }

        //Task 4
        System.out.println("Task 4");
        int month = 0;
        double total = 0;
        while (total < 12_000_000) {
            month++;
            total = total + 15_000;
            if (month % 6 == 0) {
                total = Math.round(total * 1.07 * 100.0) / 100.0;
                {
                    System.out.println(String.format("%.2f", total) + " Накоплено за " + month);
                }
                if (total >= 12_000_000) {
                    System.out.println(String.format("%.2f", total) + " Цель достигнута. Накоплено за " + month);

                    break;
                }
            }
        }

        //Task 5
        System.out.println("Task 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                System.out.println("Случился перегрев " + overheats + " , зарядка остановлена. Текущий уровень заряда " + charge + "%");
                if (overheats == 3) {
                    break;
                }
                continue;
            } System.out.println(" Текущий заряд " + charge + " % ");
        }
    }
}