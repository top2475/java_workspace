package partC.day18;

import java.util.Comparator;

//���ڸ� ������ Ŭ������ ����
//�͸�Ŭ������ ���ϸ� �ҽ� ���ϰ� �̸��� �̸��� �ֽ��ϴ�.
public class AscendingPointComparator 
	implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return (int)(o1.getPoint()-o2.getPoint());
	}
}
