public class Demo1 {
    public static void main(String[] args) {
    divsion(3,1);
    }
    public static void  divsion(int a,int b) {

        try {
            int i = a / b;
            System.out.println(i);

        } catch (Exception e) {
            System.out.println("出错信息" + e.getMessage());
        }


    }
}
