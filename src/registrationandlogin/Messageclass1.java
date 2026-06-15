/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationandlogin;


public class Messageclass1 {
    private String MessageId;
    private String Messagehash;
    private String Message;
    private String RecipientCell;
    private int NummessagesSent = 0;
    private int totalMessage;

    public Messageclass1() {
        this.MessageId = MessageId;
        this.Messagehash = Messagehash;
        this.Message = Message;
        this.RecipientCell = RecipientCell;
        this.NummessagesSent = NummessagesSent;
        
        
   
      }
    public void setMessageId(String MessageId) {
    this.MessageId = MessageId;
}

public void setMessage(String Message) {
    this.Message = Message;
}

public void setRecipientCell(String RecipientCell) {
    this.RecipientCell = RecipientCell;
}
public String getMessageId() {
    return MessageId;
}

public String getMessage() {
    return Message;
}

public String getRecipientCell() {
    return RecipientCell;
}
     public boolean checkRecipientCell(){
         boolean correctRecipientCell = false;
         if(this.RecipientCell.length()==10) {
             return true;
         }else if(this.RecipientCell.length()==12 &&this.RecipientCell.startsWith("+")){
             
         }return  true;
      
     }
     
      public boolean checkMessageId() {
    if (MessageId == null) {
        return false;
    }

    return MessageId.length() <= 10;
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
          
    if (this.Message == null) {
        return false;
    }

    boolean correctmessage = this.Message.length() <= 250;

    if (correctmessage) {
        return true;
    } else {
        return false;
    }
      
        
          
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
       public void addMesages(){
           NummessagesSent++;
       }   
     public int totalMessage(){
         return NummessagesSent;
         
         
     }

   public  String SentMessage() {
       if (Message.length()> 250){
           return "Message exceed 250 characters";  
       }else{
           
         
   } return "Message successfully sent";
   
}

       
   public  String createMessageHash() {
        String firstword ="hi"  ;
        String lastword = "thanks";
       String hash = MessageId.substring(0, 2) +":"+NummessagesSent+":"+ firstword + lastword;
       return hash.toUpperCase();
                   
                      
                          
       
       
       

    }

    
}
    
    

   
     

