//CSV�ǂݍ��ݗp�N���X
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//���X�g�p�N���X
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main{
	public static void main(String[] args){
		List<String> list_shido = new ArrayList<>(); //���X�g�錾

	    try {
	      File csv = new File("�H���\.csv"); // CSV�f�[�^�t�@�C��
	 
	      BufferedReader br = new BufferedReader(new FileReader(csv));
	 
	      // �ŏI�s�܂œǂݍ���
	      String line = "";
	      while ((line = br.readLine()) != null) {
	 
	        // 1�s���f�[�^�̗v�f�ɕ���
	        StringTokenizer st = new StringTokenizer(line, ",");
			list_shido.add(line);
	 /*
	        while (st.hasMoreTokens()) {
	          // 1�s�̊e�v�f���^�u��؂�ŕ\��
	          System.out.print(st.nextToken() + "\t");
	        } */
	        //System.out.println();
	      }
	      br.close();
	 
	    } catch (FileNotFoundException e) {
	      // File�I�u�W�F�N�g�������̗�O�ߑ�
	      e.printStackTrace();
	    } catch (IOException e) {
	      // BufferedReader�I�u�W�F�N�g�̃N���[�Y���̗�O�ߑ�
	      e.printStackTrace();
	    }
/*
		for(Iterator it = list_shido.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
*/

		System.out.println(list_shido);
		Menu menu = new Menu();
		menu.displayMenu();
	}
}