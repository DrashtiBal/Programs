package factoryDesignPattern;

import java.util.Scanner;

public class FactoryPlan {

	public static void main(String[] args)
    {
		
		Scanner s = new Scanner(System.in);
		String string = s.next();
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(string);
        notification.notifyUser();
    }
	
}
