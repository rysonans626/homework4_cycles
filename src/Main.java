public class Main {
    public static void main(String[] args) {
//задание 1
        int begin = 1;
        while (begin<=10){
            System.out.println(begin + " ");
            begin = begin + 1;
        }
        System.out.println("\n");
        for (int i =10; i<=10 && i>=1; i--) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
//задание 2
         int friday = 5;
        for (; friday<=30; friday=friday + 7){
            System.out.println("Сегодня пятница " + friday + " - число. Необходимо подготовить отчет.");
}
//задание 3
        int horribleyear = 2022;
        int start = horribleyear - 200;
        int end = horribleyear + 100;
        for (int n = 0; n<= end;n=n+79) {
            if (n > start ) {
                System.out.println(n + " год падения кометы");
            }
        }
    }
}