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

    public Messageclass1(String MessageId, String Messagehash, String Message, String recepient,int NummessagesSent) {
        this.MessageId = MessageId;
        this.Messagehash = Messagehash;
        this.Message = Message;
        this.recepient = recepient;
        this.NummessagesSent = NummessagesSent;
        
    }
    public boolean checkMessageId(){
        return this.MessageId != null && this.MessageId.length()<=10;
    }
     public boolean checkReceipent(){
         return this.recepient !=  null &&  this.recepient.length() <=10;
     }       
}
