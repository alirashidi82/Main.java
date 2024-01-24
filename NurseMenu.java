public class NurseMenu {
    private String[] nurseCodes = new String[5];
    private String[] passwords = new String[5];
    private String[] patientcodes=new String[5];
    int attempts = 0;
    public NurseMenu() {
        nurseCodes[0] = "n1";
        nurseCodes[1] = "n2";
        nurseCodes[2] = "n3";
        nurseCodes[3] = "n4";
        nurseCodes[4] = "n5";

        passwords[0] = "p1";
        passwords[1] = "p2";
        passwords[2] = "p3";
        passwords[3] = "p4";
        passwords[4] = "p5";

        patientcodes[0]="c1";
        patientcodes[1]="c2";
        patientcodes[2]="c3";
        patientcodes[3]="c4";
        patientcodes[4]="c5";

    }

    public boolean Checkingnurse(String nurseCode, String password) {
        for (int i = 0; i < nurseCodes.length; i++) {
            if (nurseCode.equals(nurseCodes[i]) && password.equals(passwords[i])) {
                return true;
            }
        }
        return false;
    }
    public boolean CheckingPatient(String patientCode) {
        for (int i = 0; i < patientcodes.length; i++) {
            if (patientCode.equals(patientcodes[i])) {
                return true;
            }
        }
        return false;
    }
}
