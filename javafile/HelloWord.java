public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a= new int[]{1,2,3,4,5,6};
        int[] b = cal(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println("index:"+i+" value:"+b[i]);
        }
    }

    private static int[] cal(int[] arr) {
            int[] result = new int[arr.length];
            result[0] = 1;
            if(arr.length == 0) {
                return result;
            } else if(arr.length!=0){
                for(int i = 1;i<arr.length;++i){
                    result[i] = result[i-1]*arr[i-1];
                }
                int tmp = 1;
                for(int j = arr.length-2;j>=0;j--){
                    tmp = tmp*arr[j+1];
                    result[j] = result[j]*tmp;
                }
            }
            return result;
    }
}

