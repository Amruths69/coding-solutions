class MySortedMap {
    public void insert(TreeMap<Integer, Integer> mp, int x, int y) {
        // code here
        mp.put(x,y);
    }

    public int get(TreeMap<Integer, Integer> mp, int x) {
        // code here
        return mp.getOrDefault(x, -1);
    }
        
    public int size(TreeMap<Integer, Integer> mp) {
        // code here
        return mp.size();
    }

    public void remove(TreeMap<Integer, Integer> mp, int x) {
        // code here
        mp.remove(x);
    }

    public int getMinKey(TreeMap<Integer, Integer> mp) {
        // code here
        if(mp.isEmpty())return-1;
        return mp.firstKey();
    }

    public int getMaxKey(TreeMap<Integer, Integer> mp) {
        // code here
        if(mp.isEmpty())return-1;
        return mp.lastKey();
    }
}