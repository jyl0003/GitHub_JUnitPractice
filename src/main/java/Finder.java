public class Finder {
    public Finder() {
        System.out.println(">>>Initializing the Finder Class...");
    }
    public Integer findMax(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0){
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

    public Integer findMin(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
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
