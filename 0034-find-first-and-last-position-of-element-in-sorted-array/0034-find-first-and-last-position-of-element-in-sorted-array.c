/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 int findFirst(int a[], int n, int target){
    int low=0,high=n-1,result=-1;

    while(low<=high){
       int mid =(low+high)/2;
        if(a[mid]==target){
            result=mid;
            high=mid-1;
        }else if(a[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return result;
 }

 int findLast(int a[],int n, int target){
    int low=0,high=n-1,result=-1;
    
    while(low<=high){
       int mid=(low+high)/2;
        if(a[mid]==target){
            result=mid;
            low=mid+1;
        }else if(a[mid]<target){
           low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return result;

 }
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int*ans = (int*)malloc(2*sizeof(int));
    *returnSize=2;

    ans[0]=findFirst(nums,numsSize,target);
    ans[1]=findLast(nums,numsSize,target);

    return ans;
}
    
