package codewars.kyu8;

public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    int price = 0;
    if (n < 5) {
      price = 100;
    } else if (n < 10) {
      price = 95;
    } else {
      price = 90;
    }
    return price * n;
  }
}
