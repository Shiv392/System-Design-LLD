package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class SlackAdapter implements NotificationInterface {

    SlackService slackService;
    SlackAdapter(SlackService slackService){
        this.slackService = slackService;
    }
    
    @Override
    public void notify(String message){
        this.slackService.sendSlackMsg(message);
    }
}
