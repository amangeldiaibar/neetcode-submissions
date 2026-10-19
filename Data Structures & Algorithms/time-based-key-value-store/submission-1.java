class Tuple{
    String val;
    int timestamp;
    Tuple(String val,int timestamp){
        this.val = val;
        this.timestamp = timestamp;
    }
    public int getStamp(){
        return timestamp;
    }
    public String getVal(){
        return val;
    }
}
class TimeMap {
    Map<String,List<Tuple>> keyToIndex;
    public TimeMap() {
        keyToIndex = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp){
        List<Tuple> list = keyToIndex.getOrDefault(key,new ArrayList<>());
        list.add(new Tuple(value,timestamp));
        keyToIndex.put(key,list);
    }
    
    public String get(String key, int timestamp) {
        if(!keyToIndex.containsKey(key)){
            return "";
        }
        int l = -1;
        int r = keyToIndex.get(key).size();
        while(l+1<r){
            int m = l + (r-l)/2;
            if(keyToIndex.get(key).get(m).getStamp() <= timestamp){
                l = m;
            }else{
                r = m;
            }
        }
        if(l == -1){
            return "";
        }
        return keyToIndex.get(key).get(l).getVal();
    }
}
