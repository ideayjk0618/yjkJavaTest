package javaTest_2021;

import java.util.ArrayList;
import java.util.HashMap;

public class day03_27 {

	public static void main(String[] args) {
		int cacheSize = 5;
		String[] cities = {"a", "b", "c", "d", "e", "f", "c", "g", "h", "a", "d", "g"};
//		int cacheSize = 5;
//		String[] cities = {"c", "c", "c"};
		int result = solution(cacheSize, cities);
		System.out.println(result);
	}

	public static int solution(int cacheSize, String[] cities) {
		// cache hit인 경우: 실행시간 1
		final int INT_HIT = 1;
		// cache miss인 경우: 실행시간 5
		final int INT_MISS = 5;
		// 총 실행시간
		int answer = 0;
		// 도시 수
		int cityLen = cities.length;
		// HashMap생성
		HashMap<Integer, String> lruMap = new HashMap<>();

		if (0 > cacheSize || 30 < cacheSize) {
			// 0 <= 캐시사이즈 <= 30
			return answer;
		} else if (0 > cityLen || 100000 < cityLen) {
			// 0 < 도시 수 <= 100000
			return answer;
		} else {
			// 캐시사이즈가 0보다 큰 경우
			if (0 < cacheSize) {
				
				int idx = 1;
				
				for (String city : cities) {
					// 도시이름을 전부 대문자로 변경
					city = city.toUpperCase();
					
					if (lruMap.containsValue(city)) {
						/*
						 * 존재하는 데이터가 들어온 경우
						 * -> 해당 데이터를 꺼낸 뒤, 가장 최근 데이터 위치로 보내준다.
						 */
						answer += INT_HIT;
						
						ArrayList<String> list = new ArrayList<>();
						// 데이터가 존재하는 값외의 모든값을 list에 넣음
						for (int i = 1; i <= lruMap.size(); i++) {
							String value = lruMap.get(i);
							if (!(value.equals(city))) {
								list.add(value);
							}
						}
						// list에 값을 map에 순차적으로 넣고, 마지막에는 존재하는 값을 넣음
						for (int j = 0; j <= list.size(); j++) {
							if (j == list.size()) {
								lruMap.put(j+1, city);
							} else {
								String value2 = list.get(j);
								lruMap.put(j+1, value2);
							}
						}
					} else {
						/*
						 * 새로운 데이터가 들어온 경우
						 *  -> 캐시에 넣어준다.
						 *  -> 캐시가 가득차있다면, 가장 오래된 데이터를 제거하고 넣어준다.
						 */
						answer += INT_MISS;
						// Map에 들어간 사이즈가 캐시사이즈보다 작은경우, 인덱스에 맞춰 map에 값을 추가
						if (lruMap.size() < cacheSize) {
							lruMap.put(idx, city);
							idx++;
						} else {
							// 캐시가 가득찬 경우, 오래된 데이터 제거 후 신규 데이터 추가
							ArrayList<String> list = new ArrayList<>();
							
							// 오래된 데이터는 1이므로 2번부터의 값을 list에 넣음
							for (int i = 2; i <= lruMap.size(); i++) {
								String value = lruMap.get(i);
								list.add(value);
							}
							// 리스트에 들어있는 값을 map에 넣어주고, 마지막에는 신규 데이터를 추가함
							for (int j = 0; j <= list.size(); j++) {
								if (j == list.size()) {
									lruMap.put(j+1, city);
								} else {
									String value2 = list.get(j);
									lruMap.put(j+1, value2);
								}
							}
						}
					}
					// 인덱스값이 캐시사이즈 이상인경우 1로 초기화
					if (idx > cacheSize) {
						idx = 1;
					}
				}
			} else {
				// 캐시사이즈가 0인경우
				answer = cityLen * INT_MISS;
			}
		}
		return answer;
	}
}
