package partB.day15;

public abstract class AShape{
//abstract Ű���� : �θ� Ŭ������ �߻�ȭ(��üȭ���� ���� ����). ��ü�� �������� �ʴ� �߻�Ŭ����
//                �ڽ�Ŭ�����鿡�� �ʿ��� �޼ҵ� ���� ({���} �ȿ� �ڵ尡 ����.)
//                 => �ڽĵ��� ��üȭ�ؾ��� �߻�޼ҵ带 ����.


    //�ڽ� Ŭ������ getter,setter ���� �ʵ� ���
    protected String shapeName;
    protected int width;
    protected int height;
    
    public AShape() {System.out.println("�߻�Ŭ���� AShape�� �⺻ ������ ���� �Ϸ�!");}
    
    public AShape(String shapeName) {this.shapeName = shapeName;}
    
    //�߻�޼ҵ� : �ڽ�Ŭ������ �����Ǹ� �� �ϰ� ������ ����.
    public abstract int area();             //���� ���� ���
    public abstract void resize(int size);  //���� ũ�� ���� �޼ҵ�
    
    //�ν��Ͻ� �޼ҵ� ���� ����
    public void aShape() {System.out.println("�߻�Ŭ���� AShape�� �ν��Ͻ� �޼ҵ� ����!");}

	@Override
	public String toString() {
		return "AShape [���� �̸�=" + shapeName + ", �ʺ�=" + width + ", ����=" + height + "]";
	}
    
    

	
}
