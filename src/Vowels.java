public class Vowels {
    public static boolean isVowels(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'а':
            case 'и':
            case 'е':
            case 'ё':
            case 'о':
            case 'у':
            case 'ы':
            case 'э':
            case 'ю':
            case 'я':
            case 'і':
            case 'ї':
                return true;
            default:
                return false;
        }
    }
}
