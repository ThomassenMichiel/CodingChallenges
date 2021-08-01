package codewars.kyu7.growthofapopulation;

/**
 * url: https://www.codewars.com/kata/563b662a59afc2b5120000c6
 */
class Arge {
    
    public static int nbYear(int population, double percent, int aug, int populationToSurpass) {
        int years = 0;
        while (population < populationToSurpass) {
            population += population * (percent / 100) + aug;
            years++;
        }
        return years;
    }
}