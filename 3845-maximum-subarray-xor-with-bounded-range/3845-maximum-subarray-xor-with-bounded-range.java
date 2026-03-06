import java.util.*;

class Solution {

    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count = 0;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        void insert(int num) {
            TrieNode node = root;
            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.child[bit] == null) {
                    node.child[bit] = new TrieNode();
                }
                node = node.child[bit];
                node.count++;
            }
        }

        void remove(int num) {
            TrieNode node = root;
            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                TrieNode next = node.child[bit];
                next.count--;
                if (next.count == 0) {
                    node.child[bit] = null;
                    return;
                }
                node = next;
            }
        }

        int queryMaxXor(int num) {
            TrieNode node = root;
            int res = 0;
            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int want = 1 - bit;
                if (node.child[want] != null) {
                    res |= (1 << i);
                    node = node.child[want];
                } else {
                    node = node.child[bit];
                }
            }
            return res;
        }
    }

    public int maxXor(int[] nums, int k) {
        int n = nums.length;

        int[] meloraxuni = nums;

        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        Trie trie = new Trie();
        int left = 0;
        int px = 0;
        int ans = 0;

        trie.insert(0); 

        for (int right = 0; right < n; right++) {
            px ^= nums[right];

            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right])
                maxDeque.pollLast();
            maxDeque.addLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right])
                minDeque.pollLast();
            minDeque.addLast(right);
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                int removePx = 0;
                for (int i = 0; i < left; i++) removePx ^= nums[i]; 
                break;
            }
        }
        Trie fullTrie = new Trie();
        fullTrie.insert(0);
        int[] prefix = new int[n + 1];
        left = 0;
        ans = 0;

        maxDeque.clear();
        minDeque.clear();

        for (int right = 0; right < n; right++) {
            prefix[right + 1] = prefix[right] ^ nums[right];

            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right])
                maxDeque.pollLast();
            maxDeque.addLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right])
                minDeque.pollLast();
            minDeque.addLast(right);

            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                fullTrie.remove(prefix[left]);
                if (maxDeque.peekFirst() == left) maxDeque.pollFirst();
                if (minDeque.peekFirst() == left) minDeque.pollFirst();
                left++;
            }

            ans = Math.max(ans, fullTrie.queryMaxXor(prefix[right + 1]));
            fullTrie.insert(prefix[right + 1]);
        }

        return ans;
    }
}