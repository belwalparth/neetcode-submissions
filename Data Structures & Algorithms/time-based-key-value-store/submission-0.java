
class TimeMap {

    HashMap<String, ArrayList<Integer>> timestamps;
    HashMap<String, ArrayList<String>> values;

    public TimeMap() {
        timestamps = new HashMap<>();
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        timestamps.putIfAbsent(key, new ArrayList<>());
        values.putIfAbsent(key, new ArrayList<>());

        timestamps.get(key).add(timestamp);
        values.get(key).add(value);
    }

    public String get(String key, int timestamp) {

        if (!timestamps.containsKey(key)) {
            return "";
        }

        ArrayList<Integer> t = timestamps.get(key);
        ArrayList<String> v = values.get(key);

        int l = 0;
        int r = t.size() - 1;
        int ans = -1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (t.get(m) <= timestamp) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (ans == -1) {
            return "";
        }

        return v.get(ans);
    }
}