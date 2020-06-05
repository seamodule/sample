//CSV読み込み用クラス
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//リスト用クラス
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main{
	public static void main(String[] args){
		List<String> list_shido = new ArrayList<>(); //リスト宣言

	    try {
	      File csv = new File("路線表.csv"); // CSVデータファイル
	 
	      BufferedReader br = new BufferedReader(new FileReader(csv));
	 
	      // 最終行まで読み込む
	      String line = "";
	      while ((line = br.readLine()) != null) {
	 
	        // 1行をデータの要素に分割
	        StringTokenizer st = new StringTokenizer(line, ",");
			list_shido.add(line);
	 /*
	        while (st.hasMoreTokens()) {
	          // 1行の各要素をタブ区切りで表示
	          System.out.print(st.nextToken() + "\t");
	        } */
	        //System.out.println();
	      }
	      br.close();
	 
	    } catch (FileNotFoundException e) {
	      // Fileオブジェクト生成時の例外捕捉
	      e.printStackTrace();
	    } catch (IOException e) {
	      // BufferedReaderオブジェクトのクローズ時の例外捕捉
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