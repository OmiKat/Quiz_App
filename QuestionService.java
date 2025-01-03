import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){

        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    @SuppressWarnings("resource")
    public void displayQuestions(){
        
        int i = 0;
        for(Question q : questions){

            System.out.println("Q" + q.getId() + ") " + q.getQuestion());
            // System.out.println(q.getQuestion());

            //could hv used an array .... 
            System.out.println("1)  " + q.getOpt1());
            System.out.println("2)  " + q.getOpt2());
            System.out.println("3)  " + q.getOpt3());
            System.out.println("4)  " + q.getOpt4());

            System.out.print("Enter Your Answer");
            Scanner sc = new Scanner(System.in);
            System.out.println();
            selection[i] = sc.nextLine();
            i++;
        }

        // for(String s : selection){
        //     System.out.println(s);
        // }
    }

    public void printScore() {
        int score = 0;

        for(int i = 0 ; i<questions.length ; i++){

            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
       System.out.println("Your Score is : " + score );

       if(score < 2){
        System.out.println("Shame on YOU!!!");
       }
       else if(score > 3 && score < 5){
        System.out.println("Good job!!");
       }
       else if(score == 5){
        System.out.println("Out Standing :3 ");
       }
    }
}