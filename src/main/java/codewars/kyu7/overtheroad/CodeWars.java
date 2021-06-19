package codewars.kyu7.overtheroad;

/**
 * url: https://www.codewars.com/kata/5f0ed36164f2bc00283aed07
 */
public class CodeWars {
    public static long overTheRoad(long address, long n) {
        /**
         * To be honest, I got waaaaay too fucking lucky for this one. It still did take some thinking.
         * There's N addresses on one side. Therefore the total amount needs to be doubled.
         *
         * Now here's where I started to guess. We should subtract the current address to get the opposite side, right?
         * Oh... it's off by one. Let's add 1 but that's wrong. We're not off by 2. So let's subtract by one.
         */
        return n * 2 - (address - 1);
    }
}