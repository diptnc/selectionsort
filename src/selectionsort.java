public class selectionsort {


    //function for processing the input

    public void sortingAlgo(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minimum_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum_index]) {
                    minimum_index = j;

                }
            }
            //swapping the minimal value
            double temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }

    }
    //print all the sorted values

    public void display(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        double arr[] = {23, 11, 2, 4, 5, 77, 43, 50.8};
        selectionsort ob = new selectionsort();
        ob.sortingAlgo(arr);
        ob.display(arr);
    }


}
