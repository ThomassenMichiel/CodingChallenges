package codingbat.array2;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int countOfThrees = 0;
        boolean isPreviousThree = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && isPreviousThree){
                return false;
            } else if (nums[i] == 3){
                isPreviousThree = true;
                countOfThrees++;
            } else {
                isPreviousThree = false;
            }
        }
        return countOfThrees == 3;
    }
}
