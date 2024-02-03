
 public class SY2022bit007{
public int getValidRegistrationsCount(String[] RegStr) {
        int c = 0;

        for (String registration : RegStr) {
            if (isValidRegistration(registration)) {
                c++;
            }
        }

        return c;
    }

    boolean isValidRegistration(String registration) {
        if (registration.length() != 10) {
            return false;
        }

       

        
      

        if (!branch.equals("bit") && !branch.equals("bcs") && !branch.equals("bme") && !branch.equals("bch")) {
            return false;
        }

        for (char c : rollNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

}
