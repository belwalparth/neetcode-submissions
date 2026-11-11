
class MinStack {

    ArrayList<Integer> minstack;
    ArrayList<Integer> minval;

    public MinStack() {
        minstack = new ArrayList<>();
        minval = new ArrayList<>();
    }

    public void push(int val) {

        minstack.add(val);

        if (minval.isEmpty()) {
            minval.add(val);
        }
        else {
            minval.add(Math.min(val, minval.get(minval.size()-1)));
        }
    }

    public void pop() {
        minstack.remove(minstack.size()-1);
        minval.remove(minval.size()-1);
    }

    public int top() {
        return minstack.get(minstack.size()-1);
    }

    public int getMin() {
        return minval.get(minval.size()-1);
    }
}
