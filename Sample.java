package javatips;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
class Sample{
 
  public static void main(String[] args) {
    try {
      File csv = new File("�����\.csv"); // CSV�f�[�^�t�@�C��
 
      BufferedReader br = new BufferedReader(new FileReader(csv));
 
      // �ŏI�s�܂œǂݍ���
      String line = "";
      while ((line = br.readLine()) != null) {
 
        // 1�s���f�[�^�̗v�f�ɕ���
        StringTokenizer st = new StringTokenizer(line, ",");
 
        while (st.hasMoreTokens()) {
          // 1�s�̊e�v�f���^�u��؂�ŕ\��
          System.out.print(st.nextToken() + "\t");
        }
        System.out.println();
      }
      br.close();
 
    } catch (FileNotFoundException e) {
      // File�I�u�W�F�N�g�������̗�O�ߑ�
      e.printStackTrace();
    } catch (IOException e) {
      // BufferedReader�I�u�W�F�N�g�̃N���[�Y���̗�O�ߑ�
      e.printStackTrace();
    }
  }
}