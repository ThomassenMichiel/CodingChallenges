package codewars.kyu8;

import java.util.Arrays;

public class SubstractTheSum {
  public static String subtractSum (int n) {
    String result = "apple";
    if (n <= 10 || n > 10000) {
      return result;
    }
    int sum = Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    n -= sum;
    switch (n) {
      case 1: result = "kiwi"; break;
      case 2: result = "pear"; break;
      case 3: result = "kiwi"; break;
      case 4: result = "banana"; break;
      case 5: result = "melon"; break;
      case 6: result = "banana"; break;
      case 7: result = "melon"; break;
      case 8: result = "pineapple"; break;
      case 9: result = "apple"; break;
      case 10: result = "pineapple"; break;
      case 11: result = "cucumber"; break;
      case 12: result = "pineapple"; break;
      case 13: result = "cucumber"; break;
      case 14: result = "orange"; break;
      case 15: result = "grape"; break;
      case 16: result = "orange"; break;
      case 17: result = "grape"; break;
      case 18: result = "apple"; break;
      case 19: result = "grape"; break;
      case 20: result = "cherry"; break;
      case 21: result = "pear"; break;
      case 22: result = "cherry"; break;
      case 23: result = "pear"; break;
      case 24: result = "kiwi"; break;
      case 25: result = "banana"; break;
      case 26: result = "kiwi"; break;
      case 27: result = "apple"; break;
      case 28: result = "melon"; break;
      case 29: result = "banana"; break;
      case 30: result = "melon"; break;
      case 31: result = "pineapple"; break;
      case 32: result = "melon"; break;
      case 33: result = "pineapple"; break;
      case 34: result = "cucumber"; break;
      case 35: result = "orange"; break;
      case 36: result = "apple"; break;
      case 37: result = "orange"; break;
      case 38: result = "grape"; break;
      case 39: result = "orange"; break;
      case 40: result = "grape"; break;
      case 41: result = "cherry"; break;
      case 42: result = "pear"; break;
      case 43: result = "cherry"; break;
      case 44: result = "pear"; break;
      case 45: result = "apple"; break;
      case 46: result = "pear"; break;
      case 47: result = "kiwi"; break;
      case 48: result = "banana"; break;
      case 49: result = "kiwi"; break;
      case 50: result = "banana"; break;
      case 51: result = "melon"; break;
      case 52: result = "pineapple"; break;
      case 53: result = "melon"; break;
      case 54: result = "apple"; break;
      case 55: result = "cucumber"; break;
      case 56: result = "pineapple"; break;
      case 57: result = "cucumber"; break;
      case 58: result = "orange"; break;
      case 59: result = "cucumber"; break;
      case 60: result = "orange"; break;
      case 61: result = "grape"; break;
      case 62: result = "cherry"; break;
      case 63: result = "apple"; break;
      case 64: result = "cherry"; break;
      case 65: result = "pear"; break;
      case 66: result = "cherry"; break;
      case 67: result = "pear"; break;
      case 68: result = "kiwi"; break;
      case 69: result = "pear"; break;
      case 70: result = "kiwi"; break;
      case 71: result = "banana"; break;
      case 72: result = "apple"; break;
      case 73: result = "banana"; break;
      case 74: result = "melon"; break;
      case 75: result = "pineapple"; break;
      case 76: result = "melon"; break;
      case 77: result = "pineapple"; break;
      case 78: result = "cucumber"; break;
      case 79: result = "pineapple"; break;
      case 80: result = "cucumber"; break;
      case 81: result = "apple"; break;
      case 82: result = "grape"; break;
      case 83: result = "orange"; break;
      case 84: result = "grape"; break;
      case 85: result = "cherry"; break;
      case 86: result = "grape"; break;
      case 87: result = "cherry"; break;
      case 88: result = "pear"; break;
      case 89: result = "cherry"; break;
      case 90: result = "apple"; break;
      case 91: result = "kiwi"; break;
      case 92: result = "banana"; break;
      case 93: result = "kiwi"; break;
      case 94: result = "banana"; break;
      case 95: result = "melon"; break;
      case 96: result = "banana"; break;
      case 97: result = "melon"; break;
      case 98: result = "pineapple"; break;
      case 99: result = "apple"; break;
      case 100: result = "pineapple"; break;
      default: subtractSum(n); break;
    }
    return result;
  }
}
