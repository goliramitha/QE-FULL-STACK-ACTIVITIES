public class activity3 {
    

    public static void main(String[] args) {

        double seconds = 1000000000;

        double earthYearSeconds = 31557600;

        double mercuryYear = 0.2408467;
        double venusYear   = 0.61519726;
        double marsYear    = 1.8808158;
        double jupiterYear = 11.862615;
        double saturnYear  = 29.447498;
        double uranusYear  = 84.016846;
        double neptuneYear = 164.79132;

        double earthAge   = seconds / earthYearSeconds;
        double mercuryAge = earthAge / mercuryYear;
        double venusAge   = earthAge / venusYear;
        double marsAge    = earthAge / marsYear;
        double jupiterAge = earthAge / jupiterYear;
        double saturnAge  = earthAge / saturnYear;
        double uranusAge  = earthAge / uranusYear;
        double neptuneAge = earthAge / neptuneYear;

        System.out.println("Age on Earth: " + earthAge);
        System.out.println("Age on Mercury: " + mercuryAge);
        System.out.println("Age on Venus: " + venusAge);
        System.out.println("Age on Mars: " + marsAge);
        System.out.println("Age on Jupiter: " + jupiterAge);
        System.out.println("Age on Saturn: " + saturnAge);
        System.out.println("Age on Uranus: " + uranusAge);
        System.out.println("Age on Neptune: " + neptuneAge);
    }
}