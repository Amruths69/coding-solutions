class Solution:
    def sumDecoded(self, nums: list[int]) -> int:
        v=nums
        MOD=1_000_000_007
        t=0
        for num in v:
            w=num%10
            d=num//10
            s=str(d)
            x=int(s[:w])
            y=int(s[w:])
            t=(t+pow(x,y,MOD))%MOD
        return t
        