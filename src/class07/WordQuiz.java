package class07;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileWriter;

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
        try{
            //파일 객체 생성
            File file = new File("/Users/jaehyun/Desktop/word.txt");
            if(file.exists() == true) { //기존 파일이 존재할 시 파일을 그대로 읽어서 vectore에 추가
                Scanner scan = new Scanner(file);
                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    String[] array = line.split(" ");
                    vector.add(new Word(array[0],array[1]));
                }
            } else { // 파일이 존재하지 않을 시 default data 추가
                vector.add(new Word("dog","강아지"));
                vector.add(new Word("tiger","호랑이"));
                vector.add(new Word("lion","사자"));
                vector.add(new Word("monky","원숭이"));
                vector.add(new Word("cat","고양이"));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void gameStart() {
        System.out.println("영어단어 텍스트 게임");
        while (true){
            System.out.print("1.게임시작, 2.단어추가, 3.텍스트 파일 생성, 4.프로그램 종료");
            int input = sc.nextInt();
            switch (input) {
                case 1 : startQuiz();
                    break;
                case 2 : insertWord(); // TODO : vector에 단어 추가
                    break;
                case 3 : createFile();// TODO : 단어 추가 후 3번을 누르게 되면 txt 파일로 생성, 8장 참고 *처음부터 텍스트파일을 읽어온 후 하는것도 해보시길..
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
        System.out.println("한글 단어를 입력해주세요.");
        String input = sc.next();
        if(input.equals("그만")){
            return;
        } else {
            System.out.println("영문 단어를 입력해주세요.");
            String eng = sc.next();
            vector.add(new Word(eng, input));
            System.out.println("완료");
        }
    }

    public void finishQuiz () {
        System.out.println("퀴즈를 종료합니다.");
        System.exit(0);
    }

    public void createFile () {
        String txt = "" ;

        String fileName = "/Users/jaehyun/Desktop/word.txt";

        try {
            // 파일 객체 생성
            File file = new File(fileName) ;
            // true 지정시 파일의 기존 내용에 이어서 작성
            FileWriter fw = new FileWriter(file, true) ;
            for (int i=0; i<vector.size(); i++) {
                txt += vector.get(i).getEng()+ " " + vector.get(i).getKor() +"\n";
            }
            // 파일안에 문자열 쓰기
            fw.write(txt);
            fw.flush();

            // 객체 닫기
            fw.close();
            System.out.println("텍스트 파일 생성 완료!");
            return;
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        WordQuiz wq = new WordQuiz();
        wq.gameStart();
    }
}
