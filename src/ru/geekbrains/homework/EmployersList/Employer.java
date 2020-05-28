package ru.geekbrains.homework.EmployersList;

public class Employer {
    //	* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    public String fio;
    public String position;
    public String email;
    public int phonenumber;
    public int salary;
    public int age;
    // Конструктор класса должен заполнять эти поля при создании объекта;

    Employer(String fio, String position, String email, int phonenumber, int salary, int age){
      this.fio = fio;
      this.position = position;
      this.email=email;
      this.phonenumber=phonenumber;
      this.salary = salary;
      this.age=age;



    }
    //    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    public void printEmployerOlderThen40(){

        if(age<40){
            return;
        }
        System.out.println("ФИО: " +fio+ "; Должность: "+ position +"; Еmail: " + email+ "; Телефон: " + phonenumber+"; Зарплата: "+salary+ "; Возраст: "+age);
    }

}
