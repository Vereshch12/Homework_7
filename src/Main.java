public class Main {
    public static void main(String[] args) {

        //Задание №1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание №2
        System.out.println();
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);

        //Задание №3
        System.out.println();
        if (fullName.contains("ё") == false && fullName.contains("Ё") == false){
            System.out.println(fullName);
        } else{
            String fullNameWithYo = fullName.replace("Ё", "Е");
            fullNameWithYo = fullNameWithYo.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + fullNameWithYo);
        }

        //Задание №4
        String[] fullNameArray = fullName.split(" ");
        lastName = fullNameArray[0];
        firstName = fullNameArray[1];
        middleName = fullNameArray[2];
        System.out.println("\nИмя сотрудника — " + lastName + "\nФамилия сотрудника — " + firstName + "\nОтчество сотрудника — " + middleName);
    }
}