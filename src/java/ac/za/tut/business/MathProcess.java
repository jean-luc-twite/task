/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.business;

import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class MathProcess {
  private MathClass math;
    public MathProcess() {
     }
    public MathProcess(MathClass math) {
        this.math = math;
    }
  
   
    public int generateNumbers(){
        int randNum;
        int max =10;
        int min =1;
        
        //generate
        randNum= (int)Math.floor(Math.random()*(max-min +1))+min;
        
       return randNum;
    }

    public void updateSession(HttpSession session, int num1, int num2) {
       int cnt = (int)session.getAttribute("cnt");
       //increase
       cnt++;
       //attach attribute
       session.setAttribute("cnt", cnt);
       session.setAttribute("num1",num1);
       session.setAttribute("num2",num2);
       
       
    }

    public int determineCorresctAns(int num1, int num2, String op) {
       int correctAnswer ;
       if(op.equals("+")){
           correctAnswer = num1 + num2;
           
       }else{
           correctAnswer = num1 * num2;
       }
       return correctAnswer;
    }

    public String determineOutcome(int correctAnswer, int userAns) {
       String outcome="Wrong Answer";
       if(correctAnswer == userAns){
           outcome ="correct answer";
       }
      return outcome;
    }

    public void updateSessionn(HttpSession session, int correctAnswer, String outcome,int userAns) {
       int numCorrectAnswer ;
       if(outcome == "correct answer"){
           numCorrectAnswer =(Integer)session.getAttribute("numCorrectAns");
           numCorrectAnswer++;
           session.setAttribute("numCorrectAns", numCorrectAnswer);
       }else{
           int numWrongAns =(Integer)session.getAttribute("numWrongAns");
           numWrongAns ++;
           session.setAttribute("numWrongAns", numWrongAns);
       }
       session.setAttribute("correctAnswer",correctAnswer);
       session.setAttribute("outcome", outcome);
       session.setAttribute("answer", userAns);
    }
      public void initialiseSession(HttpSession session, String name, String op) {
       int num1=0,num2=0,cnt=0,numCorrectAns=0,numWrongAns=0,correctAnswer=0;
       String outcome ="";
       name = math.getName();
       op=math.getOp();
       //set attribute
       session.setAttribute("name", name);
       session.setAttribute("op", op);
       session.setAttribute("num1", num1);
       session.setAttribute("num2", num2);
       session.setAttribute("cnt", cnt);
       session.setAttribute("numCorrectAns", numCorrectAns);
       session.setAttribute("numWrongAns", numWrongAns);
       session.setAttribute("correctAnswer", correctAnswer);
       session.setAttribute("outcome",outcome);
    }

}
