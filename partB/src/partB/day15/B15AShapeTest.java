package partB.day15;

import partB.day14.LadderShape;
import partB.day14.Shape;

public class B15AShapeTest {
	
	public static void main(String[] args) {
		//AShape aShape = new AShape();  *����: �߻�Ŭ������ ��ü ���� ����
		
		AShape otri = new OTriangle();
		System.out.println("=================================");
		AShape ocir = new OCircle(16.5);
		System.out.println("=================================");
		AShape oladder = new OLadderShape("��� ��ٸ���",11,13,23);
		System.out.println("=================================");
		
		AShape[] shapes = new AShape[5]; //AShape ���� ��ü�� ������ �迭
		
		//�� ��ü �������� �迭 ��ҿ� �����ϱ�
		shapes[0] = otri;
		shapes[1] = ocir;
		shapes[2] = oladder;
		shapes[3] = new OCircle(22);
		System.out.println("=================================");
		shapes[4] = new OLadderShape("�糪 ��ٸ���",15,22,25);
		System.out.println("=================================");
		
		otri.shapeName = "�ﰢ��";  shapes[0].width =20; shapes[0].height=16;
		
		System.out.println("AShape �迭�� ����� ���� ��ü ���1======");
		for(int i=0;i<shapes.length;i++)
			System.out.println(shapes[i].toString());
		
		System.out.println("AShape �迭�� ����� ���� ��ü ���2======");
		for(AShape s : shapes) {//shapes �ڷ� �������� ������� 1���� ������ ���� s�� ����. ���� for��
			//System.out.println(s.toString());
			System.out.println("���� = " + s.area());}
		
		
		System.out.println("instenceof ����");
		//1)OLadder ��ü�� ��� iamLadder()�޼ҵ带 ���� .index�� ����ϴ� for�� ���
		for(int i=0; i<shapes.length;i++) {
			if(shapes[i] instanceof OLadderShape) {
				OLadderShape temp = (OLadderShape)shapes[i];
				temp.iamLadder();
				
			}
		}
		//2)OCircle ��ü�� ��� iamCircle()�޼ҵ带 ���� .���� for�� ���
		System.out.println("========0�� �ε��� ��ü �ٲٱ�========");
		shapes[0] = new OCircle();
			System.out.println("================================");
			for(AShape s : shapes) {
				if(s instanceof OCircle) {
					OCircle temp = (OCircle) s;
					temp.iamCircle();
				}
		
			
		}
	}

}
