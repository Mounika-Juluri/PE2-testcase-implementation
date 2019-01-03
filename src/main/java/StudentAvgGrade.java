public class StudentAvgGrade {
    public int StudentMin(int n,int[] arr){
        int min=arr[0];
        for(int i=0;i<n;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public int StudentMax(int n,int[] arr){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public Double StudentAvg(int n,int[] arr){

        Double sum=0.0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum/n;

    }
}
