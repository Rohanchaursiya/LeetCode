class Solution {
    public void mergeSort(int a[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    public void merge(int a[],int l,int mid,int r){
        int left[]=new int[mid-l+1];
        int right[]=new int[r-mid];
        for(int i=0;i<mid-l+1;i++){
            left[i]=a[l+i];
        }
        for(int i=0;i<r-mid;i++){
            right[i]=a[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<mid-l+1&&j<r-mid){
            if(left[i]<right[j]){
                a[k]=left[i];
                i++;
            }else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<mid-l+1){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<r-mid){
            a[k]=right[j];
            j++;
            k++;
        }
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        
    }
}