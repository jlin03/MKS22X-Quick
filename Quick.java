public class Quick {


  public static int quickselect(int[] data, int k) {
    int l = 0;
    int u = data.length-1;
    int i = partition(data,l,u);
    while(i != k) {
      if(k < i) {
        u = i-1;
        partition(data,l,u);
      }
      else {
        l = i+1;
        partition(data,l,u);
      }
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
		int centerD = center;
		int centerU = center;
		while(centerU > data.length && data[centerD] == data[center]) {
			centerD--;
		}
		while(centerU < data.length && data[centerU] == data[center]) {
			centerU++;
		}

		for(int i = start; i <= end; i++) {
			if(data[i] == data[center]) {
				if(i < centerD) {
					temp = data[centerD];
					data[centerD] = data[i];
					data[i] = temp;
					centerD--;
				}
				if(i > centerU) {
					temp = data[centerU];
					data[centerU] = data[i];
					data[i] = temp;
					centerU++;
				}
			}
		}
		}
		return center;



	}







}
