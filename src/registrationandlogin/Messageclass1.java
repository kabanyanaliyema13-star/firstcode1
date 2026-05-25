/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationandlogin;


public class Messageclass1 {
    private String MessageId;
    private String Messagehash;
    private String Message;
    private String recepient;
    private int NummessagesSent;
    private int totalMessage;

    public Messageclass1() {
        this.MessageId = MessageId;
        this.Messagehash = Messagehash;
        this.Message = Message;
        this.recepient = recepient;
        this.NummessagesSent = NummessagesSent;
        
   
      }
     public boolean checkReceipent(){
         boolean correctrecepeint =    this.recepient.length() <=10 && this.recepient.contains("+");
         if(correctrecepeint) {
             return true;
         }else{
             
         }return  false;
     }
    
     
       public boolean checkNummessageSent(){
           boolean correctnumber = this.NummessagesSent >= 0 ;
            if (correctnumber){
                return true;
            }  else{
                return false;
            }
       }
      public boolean checkMessage(){
          boolean correctmessage = this.Message.length() >= 250;
          if(correctmessage){
              return true;
          }  else{
                  
           } return false;
        
          
      }
      public boolean checkMessagehash(){
        String firstTwoDigits = this.MessageId.substring(0, 2);
        int firstSpace = this.Message.indexOf(" ");
        String firstword = this.Message.substring(0, firstSpace);

        int lastSpace = this.Message.lastIndexOf(" ");
        String lastword = this.Message.substring(lastSpace + 1);

        
        String numberText = String.valueOf(this.NummessagesSent);

        String hash = firstTwoDigits + ":" + numberText + ":" + firstword + lastword;
        hash = hash.toUpperCase();

        boolean correcthash = this.Messagehash != null && this.Messagehash.equals(hash);
        
        if (correcthash) {
            return true;
        } else {
            return false;
        }
    }
          
     public int totalMessage(){
         return NummessagesSent;
         
         
     }

    String SentMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String createMessageHash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean checkRecipientCell() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
