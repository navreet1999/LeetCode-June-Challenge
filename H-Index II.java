class Solution {
  
  public int hIndex(int[] citations) {
     /*   int hIndex=0;
        int start=0;
        int end=citations.length-1;    
        int len=citations.length;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(citations[mid]<=len-mid) {
                hIndex=hIndex<citations[mid]?citations[mid]:hIndex;
                start=mid+1;
            } else {
                hIndex=hIndex<len-mid?len-mid:hIndex;
                end=mid-1;
            }
        }
        return hIndex;
    }*/
      
      int n = citations.length;
     for(int i=0;i<n;i++){
            if(citations[i]>=n-i)return n-i;
        }
        return 0;
}
}
