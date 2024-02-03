 class SY2022bit007 {
    private static final int MIN_YEAR = 2000;
    private static final int MAX_YEAR = 2024;
    private static final String[] VALID_DEPARTMENTS = {"bit", "bcs", "bme", "bch"};

    public int getValidRegistrationsCount(String[] enrollments) {
        if (enrollments == null) {
            throw new IllegalArgumentException("Input enrollments cannot be null.");
        }

        int count = 0;

        for (String enrollment : enrollments) {
            if (isValidEnrollment(enrollment)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValidEnrollment(String enrollment) {
        if (enrollment == null || enrollment.length() != 10) {
            return false;
        }

        int year;
        try {
            year = Integer.parseInt(enrollment.substring(0, 4));
        } catch (NumberFormatException e) {
            return false;
        }

        if (year < MIN_YEAR || year >= MAX_YEAR) {
            return false;
        }

        String departmentId = enrollment.substring(4, 7);

        for (String validDepartment : VALID_DEPARTMENTS) {
            if (validDepartment.equalsIgnoreCase(departmentId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] enrollments = {null, "2022Bit007", "2021bme007", "2025bcs007"};
        SY2022bit007data = new SY2022bit007();
        int count = data.getValidRegistrationsCount(enrollments);
        System.out.println(count);
    }
}

