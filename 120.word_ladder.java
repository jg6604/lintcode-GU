public class Solution {
    /**
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: An integer
     */
     //BFS
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if(dict == null){
            return 0;
        }
        if(start.equals(end)){
            return 1;
        }
        dict.add(start);
        dict.add(end);
        HashSet<String> set = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.offer(start);
        set.add(start);

        int length=1;
        //start bfs
        while(!queue.isEmpty()){
            length++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                for(String nextWord:getNextWords(word,dict)){
                    if(set.contains(nextWord)){
                        continue;
                    }
                    if(nextWord.equals(end)){
                        return length;
                    }

                    set.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }
        return 0;

    }
    //replace char of a string at given index to a given char
    //return a new string
    private String replace(String s, int index, char c){
        char[] chars=s.toCharArray();
        chars[index]=c;
        return new String(chars);
    }

    //get connections with given word
    private ArrayList<String> getNextWords(String word, Set<String> dict){
        ArrayList<String> nextWords=new ArrayList<String>();
        for(char c='a';c<='z';c++){
            for(int i=0;i<word.length();i++){
                if(c==word.charAt(i)){
                    continue;
                }
                String nextWord = replace(word,i,c);
                if(dict.contains(nextWord)){
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }
}