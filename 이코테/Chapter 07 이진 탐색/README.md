# Chapter 07 이진 탐색
- 정렬되어 있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방법
- 이진 탐색은 시작점, 끝점, 중간점을 이용하여 탐색 범위를 설정
- 리스트 내 특정 데이터를 탐색할 때, 반드시 정렬되어 있어야 함

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 10, 18, 24};

        int result = binarySearch(arr, 10);
        if (result == -1) {
            System.out.println("찾는 데이터가 없습니다.");
        } else {
            System.out.printf("%d 번에 있습니다.", result+1);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
```