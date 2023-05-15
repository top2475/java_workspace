package partB.day15;

import java.util.ArrayList; //�ڹٿ��� �����ϴ� �ڷᱸ�� Ŭ����

//���ο� �ڷᱸ�� ArrayList ����. �迭�� ���۹���� ������ List �ڷ� ���� �� �ϳ��Դϴ�.
//�ڷᱸ��? �����͸� �����ϰ� �ٷ�� ���.(list,Set,Map)
//ArrayList<E> : <E> ���ʸ� Ÿ��. ����Ʈ���� �ٷ� �������� Ŭ���� Ÿ���� ����.
//               �⺻�� Ÿ�� int, long, char,...�� Wrapper Ŭ���� ���
//               Integer.valueOf(19)�� Integer ��ü(�ʵ尪�� 19)�� ��ȯ
//               remove �ܿ� �Ϲ����� ��쿡�� Integer�� int�� �ڵ� ĳ����
public class B17ArrayListTest {
	
	public static void main(String[] args) {
		int[] numbers = {45,23,7,21,19,11,44};
		
		//ArrayList �� �̿��Ͽ� numbers �迭�� ���� ������� ������ ����
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("1.�迭ó�� �ε����� ���� ��ġ�� �����մϴ�.");
		System.out.println("===�׽�Ʈ ������ ���� : add(������ ��) �޼ҵ�===");
		list.add(45);list.add(23);list.add(7);list.add(21);list.add(19);
		list.add(11);list.add(44);
		System.out.println("===������ ������ �������� : get(�ε���) �޼ҵ�===");
		System.out.println(list.get(3));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		//System.out.println(list.get(7));  ���� : �ε��� ������ out of bounds(������ �Ѿ)
		
		System.out.println("2. ����Ʈ�� ũ�⸦ ���ϴ� �޼ҵ�");
		System.out.println("list�� ũ�� = " + list.size());
		list.add(999);
		System.out.println("list�� ũ�� = " + list.size());
		System.out.println("=== �迭�� �ʱ⿡ ����� ũ�Ⱑ ����� �� ������ list�� ���� ���� ===");
		System.out.println();
		
		System.out.println("3. for������ list�� ���� ����ϱ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list.get(i) = " + list.get(i));
		}
		System.out.println("=== ���� for�� (for each) ===");
		for (int num : list) {
			System.out.println("Array num = " + num);
			System.out.println("===ArrayList�� toString Ȯ��");
			System.out.println(list.toString());
			System.out.println(list); //toString() �����ϰ� �ۼ�
			
		System.out.println("\n4. Ư�� ��ġ ������ ���� / Ư�� ��ġ�� ������ �߰�");
		list.add(3,999);
		System.out.println("list.add(3,999) ���� �� ====");
		System.out.println(list + ", ����Ʈ�� ũ�� = " + list.size());
		list.remove(4);
		System.out.println("list.remove(4) ���� �� ====");
		System.out.println(list + ", ����Ʈ�� ũ�� = " + list.size());
		//remove(Object o) �� ���ڷ� ������ �����͸� ����. ������ boolean
		boolean result = list.remove(Integer.valueOf(11));
		System.out.println("list.remove(Integer.valueOf(11) ���� �� ====");
		System.out.println("remove result = " + result);
		System.out.println(list + ", ����Ʈ�� ũ�� = " + list.size());
		
		result = list.remove(Integer.valueOf(77));
		System.out.println("list.remove(Integer.valueOf(11) ���� �� ====");
		System.out.println("remove result = " + result);
		System.out.println(list + ", ����Ʈ�� ũ�� = " + list.size());
		System.out.println("2���ִ� 999 ��� �����ϱ� ====");
		while(list.remove(Integer.valueOf(999))) {};
		System.out.println(list + ", ����Ʈ�� ũ�� = " + list.size());
		
		System.out.println("\n5. List�� ����� ������ ã��");
		System.out.println("1) ã�� �����Ͱ� �����ϴ°�? - boolean");
		System.out.println("999�� ����Ʈ�� �����ϴ°�?" + list.contains(999));
		System.out.println("19�� ����Ʈ�� �����ϴ°�?" + list.contains(19));
		
		System.out.println("2) ã�� �����Ͱ� ��� �ִ°�? - index");
		System.out.println("999�� ����� index��?" + list.indexOf(999));
		System.out.println("19�� ����� index��?" + list.indexOf(19));
			
		}
	
	}

}
