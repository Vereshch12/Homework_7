public class Main {
    public static void main(String[] args) {

        //Задание №1
        String firstName = "семён";
        String middleName = "семёнович";
        String lastName = "иванов";
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

        //Задание №4 методом substring (первый раз не увидел, что нужно с ним именно делать..)
        lastName = fullName.substring(0, fullName.indexOf(" "));
        firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());
        System.out.println("\nИмя сотрудника — " + lastName + "\nФамилия сотрудника — " + firstName + "\nОтчество сотрудника — " + middleName);


        //Задание №5
        System.out.println();
        char[] fullNameChar = fullName.toCharArray();
        fullNameChar[0] = Character.toUpperCase(fullNameChar[0]);
        for (int i = 1; i < fullNameChar.length; i++){
            if (fullNameChar[i] == ' '){
                fullNameChar[i + 1] = Character.toUpperCase(fullNameChar[i + 1]);
            }
        }
        String fullNameWithCapitalLetters = String.valueOf(fullNameChar);
        System.out.println("Верное написание Ф.И.О. сотрудника с заглавных букв — " + fullNameWithCapitalLetters);

        //Задание №6
        System.out.println();
        String firstStr = "13579";
        String secondStr = "24680";
        char[] firstStrChar = firstStr.toCharArray();
        char[] secondStrChar = secondStr.toCharArray();
        char[] str = new char[secondStrChar.length + firstStrChar.length];
        for (int i = 0; i < firstStrChar.length + secondStrChar.length; i++){
            if (i % 2 == 0){
                str[i] = firstStrChar[i / 2];
            }else{
                str[i] = secondStrChar[i / 2];
            }
        }
        String strFinal = String.valueOf(str);
        System.out.println("Данные строки — " + strFinal);

        //НЕ ТО Задание №7 (простоизбавился от дублей)
        System.out.println();
        String str1 = "aabccddefgghiijjkk";
        char[] str1Char = str1.toCharArray();
        String str1Final = String.valueOf(str1Char[0]);
        for (int i = 1; i < str1Char.length; i++){
            if (str1Char[i] != str1Char[i-1]){
                str1Final += String.valueOf(str1Char[i]);
            }
        }
        System.out.println(str1Final);
    }
}