package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {
		// �迭 arr�� ��� �� �� ���� ū ���� ���
		// ��� : 19
		
//		
//		int [] arr = new int[5]; 
//		
//		arr[0] = 4;
//		arr[1] = 13;
//		arr[2] = 7;
//		arr[3] = 19;
//		arr[4] = 1;
		
		int arr[] = { 4 , 13 , 7 , 19 , 1 , 15}; 
		
		int max = arr[0];   // max = 4
		for (int i = 0; i < arr.length; i++){
			
			if (max < arr[i]) {
				max = arr[i];
			}// for
			
		}System.out.println("��� : " + max);
	
		System.out.println("============================");
		
		// arr�� ���� ���� ������������ ����
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				
				if ( arr[j] < arr[i] ) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}// if
				
			} //inner
			
		}// outer
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " " );
		}
		
		
		
	}//main
}
































