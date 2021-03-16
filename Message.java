public class Message {
    
    public static void create(int[] birthday, String sign, String result){
        if(birthday != null && sign != null && result != null){
            System.out.println(birthday[0] + "月" + birthday[1] + "日生まれの" + sign + "のあなたの今日は「" + result + "」");
        }    
    }
}
