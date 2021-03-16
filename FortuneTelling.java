
public class FortuneTelling{
    public static void main(String[] args){
        // 誕生日の入力を受け付ける
        InputBirthday input = new InputBirthday();
        int[] birthday = input.accept();

        // 星座を取得
        GetSignLogic gsl = new GetSignLogic();
        String sign = gsl.getSign(birthday);

       
        // 受け取った星座で運勢を取得
        FortuneResultDAO fortuneDAO = new FortuneResultDAO();
        String result = fortuneDAO.execute(sign);

        // 受け取った星座でラッキーアイテムを取得
        LuckyItemDAO itemDAO = new LuckyItemDAO();
        String luckyItem = itemDAO.execute(sign);
        System.out.println(luckyItem);
        // 結果をコンソールに出力
        Message.create(birthday, sign, result, luckyItem);
       

    }
}