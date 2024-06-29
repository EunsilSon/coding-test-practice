import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) { // cache size 0
            return cities.length * 5;
        }

        // 소문자 변환
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }

        ArrayList<String> cache =  new ArrayList<>();
        int time = 0;

        for (String city : cities) {

            if (cache.contains(city)) { // hit
                time += 1;

                cache.remove(city);
                cache.add(city);
            }

            if (!cache.contains(city)) { // miss
                time += 5;

                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(city);
            }

        }

        return time;
    }
}
