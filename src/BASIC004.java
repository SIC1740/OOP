import  java.util.Scanner;
// Nhớ đổi tên class thành Main
public class BASIC004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        PartitionSolver solver = new PartitionSolver();

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");

            String[] numsStr = parts[0].split(",");
            int [] nums = new int[numsStr.length];
            for (int j = 0; j < numsStr.length; j++) {
                nums[j] = Integer.parseInt(numsStr[j]);
            }
            int k = Integer.parseInt(parts[1].trim());

            int result = solver.splitArray(nums,k);
            System.out.println(result);
        }
        sc.close();
    }
}
    class PartitionSolver{
        public int splitArray(int [] nums, int k) {

            int left = 0, right = 0;
            for(int num : nums){
                left = Math.max(left,num);
                right += num;
            }
            while(left < right){
                int mid = left + (right - left)/2;

                if(canSplit(nums,k,mid)){
                    right = mid;
                }
                else{
                    left = mid + 1;
                }
            }
            return left;
        }
        private boolean canSplit(int [] nums, int k, int maxSum) {
            int count = 1;
            int currentSum = 0;
            for(int num : nums){
                if(currentSum + num > maxSum){
                    count++;
                    currentSum = num;
                    if(count > k){
                        return false;
                    }
                }
                else{
                    currentSum += num;
                }
            }
            return true;
        }
    }
