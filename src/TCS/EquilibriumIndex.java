package TCS;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3};
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        System.out.println(equilibriumIndex.equilibriumIndex(arr));
    }
    public int equilibriumIndex(int[] arr){
        if(arr.length<3){
            return -1;
        }
        int prefix = arr[0];
        int wholeSum = 0;
        for(int i = 0; i< arr.length;i++){
            wholeSum+=arr[i];
        }
        for(int i =1;i<arr.length;i++){
            if(prefix == wholeSum-arr[i]-prefix){
                return i;
            }
            else{
                prefix += arr[i];
            }
        }

        return -1;
    }
}
