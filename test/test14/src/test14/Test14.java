//下方有老師寫法
package test14;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int sum = 0;
        String plates[] = new String[times];
        String first;
        String last;
        for (int i = 0; i < plates.length; i++) {
            plates[i] = sc.next();
        }        
            for (int i = 0; i < plates.length; i++) {
                first = plates[i].substring(0, 3);  //此段可用spilt "-"來寫
                last = plates[i].substring(4, 8);                
                sum = (((first.charAt(0)-'A') * 26 *26) + (first.charAt(1)-'A') * 26) + ((first.charAt(2)-'A') * 1) ;
//                System.out.println(sum);  檢查用
                if((sum - (Integer.parseInt(last))) >= -100 && (sum - (Integer.parseInt(last))) <= 100){
                    System.out.println("nice");
                }
                else{
                    System.out.println("not nice");
                }                
            }
        }
    }

//=======================================================================================
//        int round = sc.nextInt();
//        while (round-- != 0) {
//            String plate = sc.next();
//            String[] data = plate.split("-");
//            int n1 = 0, n2 = 0, n3 = 0;
//            for (int i = 0; i < 3; i++) {
//                n1 = n1 + (data[0].charAt(i) - 'A') * (int) Math.pow(26, 2 - i);
//            }
//            n2 = Integer.parseInt(data[1]);
//            n3 = Math.abs(n1 - n2);
//            if (n3 <= 100) {
//                System.out.println("nice");
//            } else {
//                System.out.println("not nice");
//            }
//        }
//    }
//}