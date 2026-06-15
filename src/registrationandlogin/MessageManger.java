/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationandlogin;


public class MessageManger {
  String []MessageIds = new String[5];
  String[]Messagehash = new String[5];
  String[]SentMessages = new String[5];
  String []Disregardedmessages= new String[5];
  String []StoredMessages= new String[5];
  String[] correctRecipient= new String[5];
  String[]  messages= new String[5];
    String[] recipient= new String[5];
  
  
  int messageCount = 0;
  //method creation
  //1stmethod search for message id
   String searchMessageId(String inputMessageIds){
      for(int i=0;i<MessageIds.length;i++ ){
        if(MessageIds[i]!=null && MessageIds[i].equals(inputMessageIds)){
            return correctRecipient[i]+","+messages[i];
            
        }  
         
      }  
      return "Message Id not found";
 }
  
   
   
   public  String displaylongestStoredMessages(){
    String longestMessages ="";
    for(String msg:StoredMessages){
        if( msg != null && msg.length() >  longestMessages .length()){
            longestMessages = msg;
         }
    }
    
      return  longestMessages;
      
}
   public void displaySenderRecipient(){
       
    for(int i=0; i<messageCount; i++){
        System.out.println("ID: " + MessageIds[i] + " | From: Sender To: " + correctRecipient[i]);
    }

    
}
   public void searchRecipient(String searchNumber) {
    boolean found = false;

    for (int i = 0; i < messageCount; i++) {
        
        if (recipient[i].trim().equals(searchNumber.trim())) {
            
            System.out.println("\n--- Message Found ---");
            System.out.println("Message: " + messages[i]);
            System.out.println("----------------------");
            found = true; 
        }
    }

    if (!found) {
        System.out.println("No messages found matching recipient number: " + searchNumber);
    }
}
    public String searchallStoredMessages(String storedMessages){
     String allMesssagesFound="";
    
     for (int j=0; j< correctRecipient.length; j++){
         if( correctRecipient[j] !=null && correctRecipient[j].equals(storedMessages)){
            allMesssagesFound +="Message: " + messages[j]+"\n";
         }
     }
 if(! allMesssagesFound.equals("")){
     return allMesssagesFound;
 }
 else{
    return "No messages found for this recipient";
}
 }
 public String deleteMessagebyHash(String  hash){
     for (int m=0;m<Messagehash.length; m++){
         if(Messagehash[m]!=null&&Messagehash.equals( hash))
             MessageIds[m]="";
         correctRecipient[m]=null; 
          messages[m]=null; 
          Messagehash[m] = null; 
         SentMessages[m] =null;  
         Disregardedmessages[m]=null;  
          StoredMessages [m]=  null;
             return "Message is deleted";
      
     }
     return"";
 }
public void displayReportfulldetail(){
    System.out.println("\n===MessageReport:===");
    for (int a=0;a<messages.length;a++){
        if(MessageIds[a]!=null){
            System.out.println("MessageIds:"+MessageIds[a]);
            System.out.println("correctRecipient:"+ correctRecipient[a]);
            System.out.println("messages:"+messages[a]);
             System.out.println("---");
            
        }
       
    }
} 
 
}
  
    

