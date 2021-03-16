public class TestFortuneResultDAO {
    public static void main(String[] args) {
        // インスタンス生成
        FortuneResultDAO dao = new FortuneResultDAO();
        String sign;
        String result;

        // 正常系
        // 存在する星座を渡すと正常に占い結果が返ってくる
        sign = "やぎ座";
        result = dao.execute(sign);
        if(result != null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        // 異常系
        // 存在しない星座を渡すとnullが返ってくる
        sign = "test";
        result = dao.execute(sign);
        if(result == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        // nullを渡すとnullが返ってくる
        sign = null;
        result = dao.execute(sign);
        if(result == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
