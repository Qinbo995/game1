public class helloworld2 {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder();
        int[] arr = {1,2,3};
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i<arr.length-1){
               sb.append(",");
            }
        }
        sb.append("]");
        String result = sb.toString();
        System.out.println(result);
     }
     
    
}