package 기초코딩테스트_트레이닝;

// https://new93helloworld.tistory.com/104

// 시간복잡도 O(nlogn)
public class 합병정렬 {
	
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		mergeSort(input, 0, input.length - 1);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if(left < right) { // 하나로 쪼개질 때까지
			int center = (left + right) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			merge(a, left, center, right);
		}
	}
	
	// 앞과 뒤를 정렬하고 합침
	// 시작인덱스 : p, 중간 : q, 마지막 : r
	// p ~ q, q +1 ~ r까지는 이미 정렬되어 있다고 가정
	// 이 전체를 합쳐서 하나의 배열로 만들어 주는 것.
	private static void merge(int[] data, int p, int q, int r) { 
		int i = p, j = q + 1, k = p; // k 는 temp용 인덱스
		int[] tmp = new int[data.length];
		
		// 데이터 i와 데이터 j를 비교해서 작은 값이 j로 내려오고, i나 j 그리고 k를 증가.
		// 즉, tmp에 작은 값을 내리고 인덱스 증가, (내린 값의 인덱스도 증가)
		while (i <= q && j <= r) { // 왼/오 비교 시작
			if (data[i] <= data[j])
				tmp[k++] = data[i++]; // 병합
			else
				tmp[k++] = data[j++];
		}
		
		// 첫 번째 배열을 나온 후, 앞쪽의 배열에 데이터가 남아있는 경우와
		// 뒤쪽의 배열에 데이터가 남아있는 경우를 각각 처리
		while (i <= q)
			tmp[k++] = data[i++];
		while (j <= r) 
			tmp[k++] = data[j++];
		
		// 추가 배열에 임시로 저장되어 있는 값을 data 배열 안에 넣어주면서 함수는 끝이 난다.
		// 즉, tmp에 복사해서 정렬된 값을, 원래 data 배열에 넣어줌.
		for (i = p; i <= r; i++) {
			data[i] = tmp[i];
		}
	}
}
