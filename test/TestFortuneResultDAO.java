package test;

import root.FortuneResultDAO;

public class TestFortuneResultDAO {
    public static void main(String[] args) {
        // インスタンス生成
        FortuneResultDAO dao = new FortuneResultDAO();
        String sign;
        String result;

        System.out.println("正常系");
        System.out.println("存在する星座を渡すと正常に占い結果が返ってくる");
        sign = "やぎ座";
        result = dao.execute(sign);
        if(result != null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        System.out.println("異常系");
        System.out.println("存在しない星座を渡すとnullが返ってくる");
        sign = "test";
        result = dao.execute(sign);
        if(result == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        System.out.println("nullを渡すとnullが返ってくる");
        sign = null;
        result = dao.execute(sign);
        if(result == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
