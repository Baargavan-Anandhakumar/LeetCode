class TopVotedCandidate {

    int[] times;
    int[] lead;

    public TopVotedCandidate(int[] persons, int[] times) {

        this.times = times;

        lead = new int[persons.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int leader = -1;

        for(int i = 0; i < persons.length; i++) {

            map.put(persons[i], map.getOrDefault(persons[i], 0) + 1);

            if(map.get(persons[i]) >= max) {
                max = map.get(persons[i]);
                leader = persons[i];
            }

            lead[i] = leader;
        }
    }

    public int q(int t) {

        int l = 0;
        int r = times.length - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(times[mid] <= t) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return lead[r];
    }
}