import java.util.*;

public class Quick {


  public static void quickSort(int[] data) {
    quickSH(data,0,data.length-1);
  }

  private static void quickSH(int[] data, int l, int h) {
    if(l >= h) {
      return;
    }
    int k = partition(data,l,h);
    quickSH(data,l,k-1);
    quickSH(data,k+1,l);
  }

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


  public static int partition(int[] data, int start, int end){
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
    Random r = new Random((int)System.currentTimeMillis());
    for(int)


  }







}
