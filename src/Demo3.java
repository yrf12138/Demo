public class Demo3 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 6;
        int day = 16;
        int sum = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum += 30;
                    break;
                case 2:
                    if (((year % 4 == 0) & (year % 100 != 0)) | (year %

                            400 == 0)) sum += 29;
                    else sum += 28;
            }
        }
        System.out.println(sum = sum + day);
    }
}