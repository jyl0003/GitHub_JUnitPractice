public class Finder {
    //Basic constructor that signals that Finder class has been initialized.
    public Finder() {
        System.out.println(">>>Initializing the Finder Class...");
    }
    //Function that finds the max int value in an array
    public Integer findMax(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int max = array[0];
        for (int temp : array) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
    //Function that returns the minimum value in an array
    public Integer findMin(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int min = array[0];
        for (int temp : array) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
