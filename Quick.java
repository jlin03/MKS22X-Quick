import java.util.*;

public class Quick {





  public static int quickselect(int[] data, int k) {
    int l = 0;
    int u = data.length-1;
    int i = partition(data,l,u);
    int n = 5;
    while(k != i) {
      if(k < i) {
        u = i-1;
        i = partition(data,l,u);
      }
      else {
        l = i+1;
        i = partition(data,l,u);
      }
      n--;
    }
    return data[i];
  }


  public static int partition (int[] data, int start, int end){
		Random r = new Random(System.currentTimeMillis());
		int pivot = Math.abs((r.nextInt() % (end - start + 1)) + start);
		int temp = data[pivot];
		data[pivot] = data[end];
		data[end] = temp;
		pivot = end;
		int s = start;
		int e = end;
		int center = start;
		if(end - start != 0) {
		e--;
		while(s != e) {
			if(data[s] <= data[pivot]) {
				s++;
			}
			else {
				if(data[s] > data[pivot]) {
					temp = data[s];
					data[s] = data[e];
					data[e] = temp;
					e--;
				}
			}
		}
		center = s;
		if(data[center] < data[pivot]) {
			center++;
			temp = data[center];
			data[center] = data[pivot];
			data[pivot] = temp;
		}
		if(data[center] >= data[pivot]) {
			temp = data[center];
			data[center] = data[pivot];
			data[pivot] = temp;
		}
	}
  return center;
}

  public static void main(String[] args) {
    int[] ary = {2,10,15,23,0,5};
    System.out.println(quickselect(ary,4));


  }







}
