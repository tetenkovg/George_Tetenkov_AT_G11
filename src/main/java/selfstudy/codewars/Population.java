package selfstudy.codewars;

// In a small town the population is p0 = 1000 at the beginning of a year.
// The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
// How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?
//
// At the end of the first year there will be:
//        1000 + 1000 * 0.02 + 50 => 1070 inhabitants
//
// At the end of the 2nd year there will be:
//        1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)
//
// At the end of the 3rd year there will be:
//        1141 + 1141 * 0.02 + 50 => 1213
//
// It will need 3 entire years.
// More generally given parameters:
//
// p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)
//
//the function nb_year should return n number of entire years needed to get a population greater or equal to p.
//
//aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)

public class Population {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        double helper = 0;

        for (int i = p0; i < p; i = (int)helper){
          helper = i + i * percent / 100 + aug;
            System.out.println(helper);
          counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));

    }
}
