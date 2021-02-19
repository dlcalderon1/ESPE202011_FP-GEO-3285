package universitycarrerfinder;

public class UniversityCarrerFinder {

    public static void main(String[] args) {
        System.out.println("--- THE CARRERS WITH THE MOST FUTURE "
                + "IN 2021 ---");
        String[] universityCareers = {"Software engineering", "Odontology",
            "Nursing", "Medicine", "Math", "Physiotherapy",
            "Occupational therapy", "Engineering in Geospatial Technologies",
            "Marketing", "Optics and Optometry", "Law", "Technical architecture",
        "Informatics Engineering", "Mechanical Engineering", "Psychology", 
        "Civil Engineering", "Pharmacy", "Mechanical Engineering"};

        for (String carrers : universityCareers) {
            System.out.println("Career in " + carrers);
        }

    }

    
//        final float pi = 3.14f; 
//        final float g = 9.8f;
//        System.out.println("pi --> " + pi);
//        System.out.println("g --> " + g);
}

}
