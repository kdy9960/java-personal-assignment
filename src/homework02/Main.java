package homework02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Menu menu = new Menu();

       Burger[] burgers = new Burger[] {
               new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
               new Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
               new Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
       };

       IceCream[] iceCreams = new IceCream[] {
               new IceCream("VanillaIceCream", 2.1, "바닐라맛 아이스크림"),
               new IceCream("StrawberryIceCream", 2.2, "딸기맛 아이스크림"),
               new IceCream("MangoIceCream", 2.3, "망고맛 아이스크림")
       };

       Drink[] drinks = new Drink[] {
               new Drink("Cola", 1.5, "탄산의 대표, 코카콜라"),
               new Drink("Cider", 1.5, "청량함의 끝판왕, 사이다"),
               new Drink("Fanta", 1.5, "과일맛 탄산, 환타"),
       };


       int menu = 0;
       int num = 0;

       Scanner scanner = new Scanner(System.in);

       outer:
       while(true) {
           System.out.println("원하는 메뉴(1~5)를 선택하세요 (종료:0)>");
           System.out.println("(1) Burger");
           System.out.println("(2) ForzenCustard");
           System.out.println("(3) Drinks");
           System.out.println("(4) Order 주문합니다.");
           System.out.println("(5) Cancel 주문을 취소합니다.");



           String tmp = scanner.nextLine();
           menu = Integer.parseInt(tmp);

           if(menu==5) {
               System.out.println("진행중인 주문을 종료합니다");
               break;
           } else if (!(0 <= menu && menu <= 4)) {
               System.out.println("메뉴를 잘못 선택하셨습니다.");
               continue;

           }
           for (;;) {
               System.out.println("계산할 값을 입력하세요");
               System.out.println("이전으로 돌아가려면 0 을 입력해주세요");
               tmp = scanner.nextLine();
               num = Integer.parseInt(tmp);

               if (num == 0)
                   break;

               if (num == 99)
                   break outer;

               switch (menu) {
                   case 1:
                       System.out.println("result=" + num * num);
                       break;
                   case 2:
                       System.out.println("result=" + Math.sqrt(num));
                       break;
                   case 3:
                       System.out.println("result=" + Math.log(num));
                       break;
               }
           }
       }

    }
}

class Burger {
    String burgername;
    double price;
    String point;
    public Burger (String burgername, double price, String point) {
        this.burgername = burgername;
        this.price = price;
        this.point = point;
    }
}

class IceCream {
    String iceCreamname;
    double price;
    String point;
    public IceCream (String iceCreamname, double price, String point) {
        this.iceCreamname = iceCreamname;
        this.price = price;
        this.point = point;
    }
}

class Drink {
    String drinkname;
    double price;
    String point;
    public Drink (String drinkname, double price, String point) {
        this.drinkname = drinkname;
        this.price = price;
        this.point = point;
    }
}

