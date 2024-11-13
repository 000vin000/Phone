package _241113_object;

import java.util.Objects;

// 스마트폰 클래스 작성 연습
// 필드
// 제조사, 모델, 구매가격, 통신사명

//  C 모든 필드를 초기화 하는 생성자
// getter/setter
// toString 모든 필드 문자열화

// equals 재정의
// => 스마트폰은 제조사와 모델명이 같으면 동등한 스마트폰입니다.
public class Phone {

    private String make;    // 제조사
    private String model;   // 모델
    private String price;   // 구매가격
    private String company; // 통신사명

    
    public Phone(String make, String model, String price, String company) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.company = company;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Phone)) return false;
        Phone phone = (Phone) obj;
        return Objects.equals(make, phone.make) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "Galaxy S21", "999000", "SKT");
        Phone phone2 = new Phone("Samsung", "Galaxy S21", "999000", "KT");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone1.equals(phone2));
    }
}