package partC.day17;

import java.util.Arrays;

public class C05MySort {
	//���� ������ ���� �˰��� ���� �غ���
	public static void main(String[] args) {
		
		//���� �˰���(��������) ���� : �񱳿� ��ȯ
		int[] nums = {34,77,19,56,45,9};
		
		for (int i = 0; i < nums.length-1; i++) { //�������� i = nums.length-2
			for (int k = i+1; k < nums.length; k++) { //k�� i ���� �ڿ� �ִ� �ε���
				if (nums[i] > nums[k]) { //�ε��� i�� k ��ġ�� ���� *��ȯ*�ϱ�
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
					
				}
				
				
			}
			System.out.println("�߰� ����" + (i + 1) + "�ܰ� :" + Arrays.toString(nums));
		}
		//i =0 �� ��, k=1~5 ���� nums[i] > nums[k] ��. ���̸� ��ȯ
		//i =1, k=2~5 ����
		//i =2, k=3~5 ����
		//i =3, k=4~5 ����
		//i =4, k=5~5 ����
		
		System.out.println("���� ��� :" + Arrays.toString(nums));
		
		System.out.println("\n�����ϱ� - String ���ڿ� �� �����ϱ�");
		String[] names = {"momo","nana","zuwi","cat","dog","kiwi"};
		//���� ���� ������ ���� ���� �˰������� names �迭�� �����غ�����.
		//��Ʈ : ���ڿ� �� ���� ������ comparTo�� �ؾ� ��
		
		for (int i = 0; i < names.length-1; i++) {
			for (int j = i+1; j < names.length; j++) {
				//���� if(names[i].compareTo(names[j]) > 0)
				if(names[i].compareTo(names[j]) > names[j].compareTo(names[i])) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
				
			}
			System.out.println("�߰� ����" + (i + 1) + "�ܰ� :" + Arrays.toString(names));
			
		}
		System.out.println("���� ��� :" + Arrays.toString(names));
		
	}

}
