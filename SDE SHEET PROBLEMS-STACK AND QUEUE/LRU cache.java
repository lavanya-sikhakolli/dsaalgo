class Node{
    int key;
    int value;
    Node pre;
    Node next;

public Node(int key, int value) {
	this.key = key;
	this.value = value;
}
}
class LRUCache {
    HashMap<Integer, Node> map;
   int capicity, count;
    Node head, tail;
      
    public LRUCache(int capacity) {
     this.capicity = capacity;
	map = new HashMap<>();
	head = new Node(0, 0);
	tail = new Node(0, 0);
	head.next = tail;
	tail.pre = head;
	head.pre = null;
	tail.next = null;
	count = 0; 
    }
    public void deleteNode(Node temp){
        temp.pre.next=temp.next;
        temp.next.pre=temp.pre;
    }
    public void addToHead(Node temp){
        temp.next=head.next;
        head.next.pre=temp;
        temp.pre=head;
        head.next=temp;
    }
    
    public int get(int key) {
        //if key is found
        if (map.get(key) != null) {
        //we will get the value of that key which is the address of that node
		Node node = map.get(key);
        //to get the value of that node ...accessing with the help of address of that node
		int result = node.value;
        //Now we are deleting that node and adding right next to the head
		deleteNode(node);
		addToHead(node);
		return result;
	}
        //if key is not present
	return -1;
 }
    
    public void put(int key, int value) {
        //if the key is already present in the map....updating the value and deleting the node from that position and adding it to the next of head
        if (map.get(key) != null) {
		Node node = map.get(key);
		node.value = value;
		deleteNode(node);
		addToHead(node);
	} 
        else {
            //if the key is not found in the map
		Node node = new Node(key, value);
		map.put(key, node);
            //if count is less than cap
		if (count < capicity) {
			count++;
			addToHead(node);
		}
            else {
                //if count is greater than or equal to capacity...remove the least recently used from the cache....which present before the tail and add the current node next to the head.
			map.remove(tail.pre.key);
			deleteNode(tail.pre);
			addToHead(node);
		}
	}
}
        
    }

