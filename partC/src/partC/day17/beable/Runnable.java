package partC.day17.beable;

public interface Runnable extends BeAble{

	String run(int speed); //�޸���
	
	//�� �������� ���������� �������̽��� ����Ͽ� Ŭ������ �����߽��ϴ�.
	//�׷��� .... ���ø����̼� ���� �Ŀ� �����ǰ� �ʿ��� �޼ҵ尡 ����� �׸��� �̰��� �߻�޼ҵ�� �����Ѵٸ�
	
	//void temporary();
	//v1�� Dog, Human�� ������ ����. �׷��� �̷� ��쿡��
	//v2���� ���ο� ��� �߰��� �ʿ��� �޼ҵ� default�� �����մϴ�.
	default void Temporary() {
	//������ �Ȼ��⵵�� default �޼ҵ�� �����ϰ� ���� ������ Ŭ�������� ����ϵ��� �մϴ�.
	}
	
	
}
