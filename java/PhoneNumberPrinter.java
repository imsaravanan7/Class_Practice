public class PhoneNumberPrinter {

    public static void main(String[] args) {
        String phoneNumber = "80565964129"; // Replace this with your phone number
        String maskedPhoneNumber = maskPhoneNumber(phoneNumber);

        System.out.println("Original phone number: " + phoneNumber);
        System.out.println("Masked phone number: " + maskedPhoneNumber);
    }

    public static String maskPhoneNumber(String phoneNumber) {
        int visibleDigits = 3; // Number of digits to keep visible
        int maskedLength = phoneNumber.length() - visibleDigits;

        if (maskedLength <= 0) {
            // If the phone number has 3 or fewer digits, return as it is
            return phoneNumber;
        }

        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < maskedLength; i++) {
            masked.append('*');
        }

        return masked + phoneNumber.substring(maskedLength);
    }
}
