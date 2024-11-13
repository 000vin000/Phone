package _241113_object;

public class PhoneTest {

    public static void main(String[] args) {
        // Phone 객체 생성
        Phone phone1 = new Phone("Samsung", "Galaxy S21", "999000", "SKT");
        Phone phone2 = new Phone("Samsung", "Galaxy S21", "999000", "KT");
        Phone phone3 = new Phone("Apple", "iPhone 12", "1099000", "LGU+");
        Phone phone4 = new Phone("Samsung", "Galaxy S21", "999000", "SKT");

        // toString 테스트
        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);
        System.out.println("Phone 3: " + phone3);

        // equals 테스트
        System.out.println("phone1과 phone2는 같은가? " + phone1.equals(phone2)); // false
        System.out.println("phone1과 phone4는 같은가? " + phone1.equals(phone4)); // true
        System.out.println("phone1과 phone3는 같은가? " + phone1.equals(phone3)); // false

        // hashCode 테스트
        System.out.println("phone1의 해시코드: " + phone1.hashCode());
        System.out.println("phone2의 해시코드: " + phone2.hashCode());
        System.out.println("phone4의 해시코드: " + phone4.hashCode());
    }
}
