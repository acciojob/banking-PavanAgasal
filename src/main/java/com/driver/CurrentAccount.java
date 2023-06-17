package com.driver;

public class CurrentAccount extends BankAccount {
    String tradeLicenseId; // consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000.0); // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        char[] licenseChars = tradeLicenseId.toCharArray();
        int length = licenseChars.length;

        for (int i = 0; i < length - 1; i++) {
            if (licenseChars[i] == licenseChars[i + 1]) {
                rearrangeLicenseId(licenseChars, i);
                return;
            }
        }

        throw new Exception("Valid License cannot be generated");
    }

    private void rearrangeLicenseId(char[] licenseChars, int index) {
        int length = licenseChars.length;

        // Swap the current and next character
        char temp = licenseChars[index];
        licenseChars[index] = licenseChars[index + 1];
        licenseChars[index + 1] = temp;

        // Swap the last character with any other character
        temp = licenseChars[length - 1];
        licenseChars[length - 1] = licenseChars[index];
        licenseChars[index] = temp;

        tradeLicenseId = new String(licenseChars);
    }
}
