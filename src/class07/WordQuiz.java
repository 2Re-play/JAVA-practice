package class07;

import java.util.Scanner;
import java.util.Vector;

class Word {

    private String eng;
    private String kor;

    public Word (String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }
    public String getKor() {
        return kor;
    }

}

public class WordQuiz {
    Scanner sc = new Scanner(System.in);
    Vector<Word> vector;

    public WordQuiz () {
        vector = new Vector<Word>();
        vector.add(new Word("dog","강아지"));
        vector.add(new Word("tiger","호랑이"));
        vector.add(new Word("lion","사자"));
        vector.add(new Word("monky","원숭이"));
        vector.add(new Word("cat","고양이"));
    }
    public void gameStart() {
        System.out.println("영어단어 텍스트 게임");
        while (true){
            System.out.print("1.게임시작, 2.단어추가, 3.프로그램 종료");
            int input = sc.nextInt();
            switch (input) {
                case 1 : startQuiz();
                    break;
                case 2 : insertWord(); // TODO : vector에 단어 추가
                    break;
                case 3 : // TODO : 단어 추가 후 3번을 누르게 되면 txt 파일로 생성, 8장 참고 *처음부터 텍스트파일을 읽어온 후 하는것도 해보시길..
                    break;
                case 4 : finishQuiz();
                    break;
                default : System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
    public boolean exits (int [] n, int index){
        for(int i=0; i<n.length; i++) {
            if(n[i] == index) {
                return true;
            }
        }
        return false;
    }

    public int makeEx (int[] ex, int ans) {
        int [] n = { -1, -1, -1, -1};
        int index;
        for (int i=0; i<n.length; i++) {
            do {
                 index = (int)Math.floor(Math.random()*vector.size());
            } while (index == ans || exits(n, index));
            n[i] = index;
        }
        for(int i=0; i<n.length; i++){
            ex[i] = n[i];
        }
        return (int)Math.floor(Math.random()*n.length);
    }

    public void startQuiz () {
        while (true) {
            int ans = (int) Math.floor(Math.random()*vector.size());
            String eng = vector.get(ans).getEng();
            int [] ex = new int[4]; //보기 4개 선택
            int res = makeEx(ex, ans); // 정답 보기
            ex[res] = ans; // 보기에 정답 저장

            System.out.println("질문 : "+eng);

            for(int i = 0; i<ex.length; i++) {
                System.out.println((i+1) + "> " + vector.get(ex[i]).getKor() + "  ");
            }
            System.out.print("정답 : ");
            int answer = sc.nextInt();
            if (answer == -1) break;
            answer --;
            if(answer == res)
                System.out.println("정답입니다!");
            else
                System.out.println("오답입니다.");
        }
    }

    public void insertWord () {

    }

    public void finishQuiz () {
        System.out.println("퀴즈를 종료합니다.");
        sc.close();
    }

    public static void main(String [] args){
        WordQuiz wq = new WordQuiz();
        wq.startQuiz();
    }
}
