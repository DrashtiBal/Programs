package factoryDesignPattern;

public class NotificationFactory {

		public Notification createNotification(String string)
	    {
			
			if(string.equalsIgnoreCase("sms")) {
				 return new SMSNotification();
			}
			else if (string.equalsIgnoreCase("Email")) {
				return new InstaNotification();
			}
			
			else if (string.equalsIgnoreCase("Insta")) {
				return new InstaNotification();
			}
			
			else if (string.equalsIgnoreCase("push")) {
				return new PushNotification();
			}
				 
//	        if (channel == null)
//	            return null;
//	        switch (channel) {
//	        case "SMS":
//	            return new SMSNotification();
//	        case "EMAIL":
//	            return new EmailNotification();
//	        case "PUSH":
//	            return new PushNotification();
//	        case "INSTA":
//	            return new InstaNotification();
//	        default:
//	            throw new IllegalArgumentException("Unknown channel "+channel);
//	        }
			return null;
	    }

}
