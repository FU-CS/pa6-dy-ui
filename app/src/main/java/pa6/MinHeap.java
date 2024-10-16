package pa6;

// Uncomment the following class to get started

 public class MinHeap implements Heap {
	
	 private int[] arr;
	 int size;

	public MinHeap(int size) {
		 this.arr = new int[size];
		 this.size = 0;
	 }

	@Override
	public void insert(int element) {
		arr[size] = element;
		size ++;
		int idx = size - 1;
		while (arr[(idx-1)/2] > element) { //change
			swap(idx, (idx-1) /2);
			idx = (idx-1)/2;
		}
		
	}
	
	private void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	@Override
	public int delete() {
		if (size == 0)
			return -1;
		
		int i = 0;	
		int tmp = arr[0];
		arr[i] = arr[size-1];
		size --;
		move_down(0);
		return tmp;
	}
	
	private void move_down(int idx) {
		if (2*idx+1 >= size)
			return;
		
		int left = 2*idx+1;
		if (size-1 == left) {
			if (arr[left] < arr[idx]) { //change
				swap(left, idx);
			}
			return;
		}
		
		int right = 2*idx + 2;
		if ((arr[left] <= arr[right]) && (arr[left] < arr[idx])) { //change
			swap(idx, left);
			move_down(left);
			return;
		}
		else if (arr[right] < arr[idx]) { //change
			swap(idx, right);
			move_down(right);
		}
	}

	@Override
	public int peek() {
		if (size == 0)
			return -1;
		return arr[0];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void print() {
		for (int x: arr)
			System.out.print(x + ' ');
		System.out.println();
		
	}
	
	static int[] heapSort(int[] array){
		MinHeap heap = new MinHeap(array.length); //change
		for (int x: array)
			heap.insert(x);
		int [] res = new int[array.length];
		for (int i=0; i<array.length; i++) {
			res[i] = heap.delete();
		}
        return res;
    }
    

 }
