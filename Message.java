public class Message {
    
    public static void create(int[] birthday, String sign, String result, String luckyItem){
        if(birthday != null && sign != null && result != null && luckyItem != null){
            System.out.println(birthday[0] + "月" + birthday[1] + "日生まれの" + sign + "のあなたの今日は...「" + result + "」\nラッキーアイテムは" + luckyItem + "です" );
        }    
    }
}
