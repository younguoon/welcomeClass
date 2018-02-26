package class_0205;

import java.util.Arrays;

//정수 배열을 정렬하는 코드
public class IntArraySorter {
	private final int[] datas;
	private int iData;
	
	public IntArraySorter(int[] data, int i) {
//		this.datas = data; //레퍼런스 타입을 할당하면 주소가 할당됨
		this.datas = new int[data.length];
		this.iData = i;
		System.arraycopy(data, 0, datas, 0, data.length);
	}
	
	public void sort(){
		for(int x = 0; x<datas.length -1; x ++){
			int m = x;
			for(int y = x+1; y<datas.length; y++){
				if(datas[m] > datas[y]){
					m=y;
				}
			}
		// 여기서 datas[m]는 datas[x] ~ datas[datsd.lenth -1]의 최소값이어야 한다.
		assert isMin(m, x, datas.length -1) : this+", x= "+x;
		int v = datas[m];
		datas[m] = datas[x];
		datas[x] = v;
		// 여기에서 datas[0] ~ datas[x+1]은 이미 정렬되어 있어야 한다.
		assert isSorted(0,x+1);
	}
}

	// 여기서 datas[m]는 datas[x] ~ datas[datsd.lenth -1]의 최소값이어야 한다.
	private boolean isMin(int DOS, int start, int end){
		for(int i = start; i<end; i++){
			if(this.datas[DOS] > this.datas[i]);
			return false;
		}
		return true;
	}
	
	// 여기서 datas[m]는 datas[x] ~ datas[datsd.lenth -1]의 최소값이어야 한다.
	private boolean isSorted(int start, int end){
		for(int i = start; i < end; i++ ){
			if(this.datas[i] > this.datas[i+1]);
				return false;
		}return true;
	}

	
	public String toString(){
		return Arrays.toString(this.datas) + ", i = "+ this.iData;
	}
}