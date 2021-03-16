
public class FortuneTelling{
    public static void main(String[] args){
        // 誕生日の入力を受け付ける
        InputBirthday input = new InputBirthday();
        int[] birthday = input.accept();

        // 星座を取得
        GetSignLogic gsl = new GetSignLogic();
        String sign = gsl.getSign(birthday);

       
        // 受け取った星座で運勢を取得
        FortuneResultDAO dao = new FortuneResultDAO();
        String result = dao.execute(sign);

        // 結果をコンソールに出力
        Message.create(birthday, sign, result);
       

    }
}