public class Demo3 {
    public static void main(String[] args) {
//    boolean isRainy =true;
//    if(true){
//        System.out.println("下雨收衣服");
//    }
        int score=80;
        degree(score);


        }
        public static void degree(int score ){
        if(score>90){
            System.out.println("优秀");

        }
        else if (score>80&&score<90){
            System.out.println("中等");

            }
        else{
            System.out.println("不及格" );
        }
        }

}