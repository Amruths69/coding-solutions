# Top K Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `k`  *most frequent elements*. You may return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  nums = [1,1,1,2,2,3], k = 2

 **Output:**  [1,2]

 **Example 2:** 

 **Input:**  nums = [1], k = 1

 **Output:**  [1]

 **Example 3:** 

 **Input:**  nums = [1,2,1,2,1,2,3,1,3,2], k = 2

 **Output:**  [1,2]

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

 

 **Follow up:**  Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

## Solution

**Language:** Java  
**Runtime:** 2348 ms (beats 5.01%)  
**Memory:** 47.8 MB (beats 20.52%)  
**Submitted:** 2026-09-30T12:07:28.462Z  

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++){
                
                if(n==nums[j]){
                    c++;
                }
            }
            hm.put(n,c);
        }
        
        int g=0;
        int[] ans=new int[k];
        
        for(int i=0;i<k;i++){
            int m=0;
            int e=0;
            for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
                if(entry.getValue()>m){
                    m=entry.getValue();
                    e=entry.getKey();

                }
            }
            ans[i]=e;
            hm.remove(e);
        }
        return ans;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-elements/)