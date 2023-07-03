public class Ex1_4 {
    public static void main(String[] args) {
        int year = 5*365*24*60*60;
        int population = 312032486;
        int birth = year/7;
        int death = year/13;
        int immigrant = year/45;
        int fiveYP = population+birth-death+immigrant;

        System.out.println("Next five years the current population is about " +fiveYP);
    }
}
