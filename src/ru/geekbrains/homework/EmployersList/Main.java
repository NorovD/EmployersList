package ru.geekbrains.homework.EmployersList;

public class Main {

    public static void main(String[] args) {

        //Создать массив из 5 сотрудников.

        Employer[] employersArray = new Employer[5];

        employersArray[0] = new Employer("Жмышенко Валерий Альбертович", "cантехник", "отсутствует", 2547896, 35000, 54);
        employersArray[1] = new Employer("Сидоренко Ольга Викторовна", "Шпалоукладчица", "konya_na_skoku@gmail.com", 2547896, 48000, 43);
        employersArray[2] = new Employer("Борис Винеаминович Щец", "Маг 5ого уровня", "avada_kidavara@yandex.ru", 2666999, 100000, 374);
        employersArray[3] = new Employer("Ксенофонтова Ольга Романовна", "Корабельный Кок", "againberry@gmail.com", 5784592, 39000, 35);
        employersArray[4] = new Employer("Клаус Вацлав Вацловович", "Бывший президент Чехии", "exglavchekh@usa.gov", 24588656, 60000, 78);

        for (int i=0;i<employersArray.length; i++) {

            employersArray[i].printEmployerOlderThen40();
        }
    }


}
