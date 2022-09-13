class Moore's Voting Algorithm {
    public static void main(String[] args) {
        int[]arr={0,1,2,2,4,4,1};
        int result=majorityElement(arr);
        System.out.println(result);
    }
    static int majorityElement(int[] a) {
        int n=a.length;
        int count=1,major=a[0];
        for(int i=1;i<n;i++){
            if(a[i]==major){
                ++count;
            }
            else{
                if(count==0){
                    major=a[i];
                    ++count;
                }
                else{
                   -- count;
                }
            }
        }
        return major;
    }}


