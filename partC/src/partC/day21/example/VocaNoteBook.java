package partC.day21.example;

import java.util.List;
import java.util.Map;

//�ܾ��忡�� ���ϴ� ����� �߻�޼ҵ�� ����
public interface VocaNoteBook {
	
	Map<String, JavaVoca> getVoca(); //�ܾ��� ���� Map ��ü ��������
	void add(JavaVoca person); //�ܾ��� �׸� �����͸� Map�� �߰�
	public void print(); //�ܾ��� Map ��ü ������ ���
	List<JavaVoca> group(String group); //�ܾ��� Map���� ���ϴ� �׷�(����)�� ã�Ƽ� List�� ����
	void load(String path); //path�� ������ ��� ���Ͽ��� ������ ������ �ܾ��� Map�� �����ϱ�
	void save(String path); //path�� ������ ��� ���Ͽ� �ܾ��� Map ������ �����ϱ�
	

}
