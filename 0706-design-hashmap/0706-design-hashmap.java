class MyHashMap {
    List<Integer> keys;
    List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            for (int i = 0; i < keys.size(); i++) {
                if (keys.get(i) == key) {
                    values.set(i, value);
                }
            }
        }
    }

    public int get(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key)
                return values.get(i);
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key == keys.get(i)) {
                keys.remove(i);
                values.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */