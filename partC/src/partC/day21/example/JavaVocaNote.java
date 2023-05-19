package partC.day21.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

//�ܾ����� ����� ������ �������̽� ����ϱ� - �ڹ� �ܾ��� Ŭ������ ����.
public class JavaVocaNote implements VocaNoteBook{
//���Ͽ��� �о�� �����͸� ������ �ڷ� ���� �ʿ��մϴ�.
	private Map<String,JavaVoca> voca; //String�� ����ܾ�, JavaVoca ��ü (����ܾ�,�ѱ۶�,����)
	
	public JavaVocaNote() {
		voca = new TreeMap<>(); //�����͸� ������ map��ü ����
	}
	
	@Override
	public Map<String, JavaVoca> getVoca() { 
		return voca;
	}

	@Override
	public void add(JavaVoca voca) {
		//�����غ�����
		this.voca.put(voca.getEnglish(),voca);
	}

	@Override
	public void print() {
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "�ڹ� �ܾ�","��","����"));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(String key : voca.keySet()) {
			//iterator ��ſ� ��� for�� ��� ����. map�� key�� ������ set�� ������ �մϴ�.
			JavaVoca vo = voca.get(key); //key������ value�� ��������
			System.out.println(String.format("%-20s\t%-20s\t%-20s",
					vo.getEnglish(),vo.getKorean(),vo.getLevel()));
		}
		
	}

	@Override
	public List<JavaVoca> group(String level) { //�׷� �˻� �޼ҵ�
		List<JavaVoca> result = new ArrayList<>();
		//�׷� �˻��� key �������� �ȵǰ� �ϳ��� �˻������ �ʿ���.
		level = switch(level){         //�ڹ� 12���� ����
	    case "1" -> "Beginner";
	    case "2" -> "Intermediate";
	    case "3" -> "Advanced";
	    default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : "+level);
	    };
		for(String key : voca.keySet()) {
			JavaVoca vo = voca.get(key);
			if(vo.getLevel().equals(level))
				result.add(vo);
			
		}
		return result;
	}

	@Override
	public void load(String path) {//���Ͽ��� �ܾ�� �ҷ�����
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();
				System.out.println(temp);
				//public		������,������,����			Beginner
				//�о�� ���ڿ��� JavaVoca ��ü�� ���� map�� �����մϴ�.
				StringTokenizer stk = new StringTokenizer(temp,"\t_");
				String name = stk.nextToken();
				voca.put(name, new JavaVoca(name,stk.nextToken(),stk.nextToken()));
			}
			System.out.println("���������� �ܾ��� ���� �о���� ��!!");
		}catch(FileNotFoundException e) {
			System.out.println("���Ϸκ��� �о���� - �Է� ���� : "+ e.getMessage());
		}finally {
			if(fsc != null) fsc.close();
		}
		
		
	}

	@Override
	public void save(String path) {
		
	}
	

}
