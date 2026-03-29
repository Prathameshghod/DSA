class EventManager {
    public Map<Integer,Integer> m;
    public PriorityQueue<int[]> pq;
    
    public EventManager(int[][] events) {
        m=new HashMap<>();
        pq=new PriorityQueue<>((a,b) -> {
            if(a[1]!=b[1]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        for(int[] i:events){
            m.put(i[0],i[1]);
            pq.add(new int[]{i[0],i[1]});
        }
        
    }
    
    public void updatePriority(int eventId, int newPriority) {
        m.put(eventId,  newPriority);
        pq.add(new int[]{eventId,  newPriority});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] a=pq.poll();
            int x=a[0];
            int y=a[1];
            if(m.containsKey(x) && m.get(x)==y){
                m.remove(x);
                return x;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */