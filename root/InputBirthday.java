package root;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

class InputBirthday{
    public int[] accept(){
        Scanner sc = new Scanner(System.in);
        // 誕生日の入力を受け付ける
        int month = 0; int date = 0;
        do{
            try{
                System.out.println("誕生日の「月」を数字で入力してください");
                month = sc.nextInt();
                System.out.println("誕生日の「日にち」を数字で入力してください");
                date = sc.nextInt();
                // インスタンス化して値が正常か確認
                LocalDate inputDate = LocalDate.of(2020, month, date);
            } catch (DateTimeException e){
                System.out.println("入力された値は不正です");
                month = 0;
                date = 0;

            } catch (InputMismatchException e){
                System.out.println("数字を入力してください！");
                sc.next();
            }
        }while(month == 0 || date == 0);

        
        int[] birthday = {month, date};
        return birthday;

    }
}