import java.util.Scanner;
//v0.1
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;
        for(int k=1; k<=number; k++)
        {
            if(number % k ==0)
                cnt++;
        }
        if(cnt==2)
            System.out.println(number+"은(는) 소수!");
        else
            System.out.println(number+"은(는) 소수가 아닙니다!");
    }
}

/*import java.util.Scanner;
// v0.2
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;

        for(int k=2; k<number; k++) //반복 횟수 2회 감소
        {
            if(number % k ==0)
                cnt++;

        }
        if(cnt == 0) //cnt가 0이 유지되면 true
            System.out.println(number+"은(는) 소수!");
        else
            System.out.println(number+"은(는) 소수가 아닙니다!");

    }
}*/

/*import java.util.Scanner;
// v0.3
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //int cnt = 0;
        boolean isPrime = true;  //is가 들어가면 boolean Type (논리형)

        for(int k=2; k<number; k++) //반복 횟수 2회 감소
        {
            if(number % k ==0)  //입력된 수를 k로 나눌때 나머지 0, 즉 약수
                //cnt++; //cnt = cnt +1
                isPrime = false;

        }
        //if(cnt == 0) //cnt가 0이 유지되면 true
        if(isPrime)  // isPrime 값이 true 면 소수  boolean type은 코드 간소화 가능 true 안넣고 isPrime == true
            System.out.println(number+"은(는) 소수!");
        else
            System.out.println(number+"은(는) 소수가 아닙니다!");

    }
}*/

//import java.util.Scanner;
//// v0.5
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        //int cnt = 0;
//        boolean isPrime = true;  //is가 들어가면 boolean Type (논리형)
//
////        for(int k=2; k<number; k++) //반복 횟수 2회 감소
////        {
////            if(number % k ==0)  //입력된 수를 k로 나눌때 나머지 0, 즉 약수
////            {
////                isPrime = false;
////                break;  //반복문 횟수 줄임, 첫번째 약수가 발견되면  for문 탈출
////            }
////            System.out.println(k);
////        }
//        int k=2;
//        while(k<number)
//        {
//            if(number % k ==0)  //입력된 수를 k로 나눌때 나머지 0, 즉 약수
//            {
//                isPrime = false;
//                break;  //반복문 횟수 줄임, 첫번째 약수가 발견되면  for문 탈출
//            }
//            System.out.println(k);
//            k++;
//        }
//
//        if(isPrime)  // isPrime 값이 true 면 소수  boolean type은 코드 간소화 가능 true 안넣고 isPrime == true
//            System.out.println(number+"은(는) 소수!");
//        else
//            System.out.println(number+"은(는) 소수가 아닙니다!");
//
//    }
//}
