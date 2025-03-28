package Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] data = new int[]{1,14,33,15,66,44,66,15};
        int largestNo = data[0];
        int secondLargestNo = -1;

        for(int i : data) {
            if(i > largestNo) {
                secondLargestNo = largestNo;
                largestNo = i;
            } else if(i < largestNo && i > secondLargestNo) {
                secondLargestNo = i;
            }
        }

        System.out.println(secondLargestNo);



    }
}
