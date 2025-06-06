/*Explaination:This program performs 3 string manipulation tasks:

Hides the last 4 digits of a phone number.

Masks the middle part of an email address.

Replaces all characters of a string except the first and last with *.*/

package String_Operations;

public class StringOperations {

    static String hideLast4Digits(String phone) {
        return phone.substring(0, phone.length() - 4) + "****";
    }

    static String hideEmailMiddle(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex <= 2) return email; // too short to hide
        return email.charAt(0) + "****" + email.charAt(atIndex - 1) + email.substring(atIndex);
    }

    static String maskExceptFirstLast(String str) {
        if (str.length() <= 2) return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) sb.append('*');
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Masked Phone: " + hideLast4Digits("9876543210"));
        System.out.println("Masked Email: " + hideEmailMiddle("john.doe@example.com"));
        System.out.println("Masked Word: " + maskExceptFirstLast("chandan"));
    }
}

