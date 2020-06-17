
    public class Demo4 {
        public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                //2.第n行打印n个算式
                for (int j = 1; j <= i; j++) {
                    //3.第n行的第m个算式为 m*n=mn
                    System.out.print(j + "*" + i + "=" + (i * j) + "\t");
                }
                //换行
                System.out.println();
            }

        }
    }


