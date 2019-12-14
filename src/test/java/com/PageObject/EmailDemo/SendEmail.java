package com.PageObject.EmailDemo;


import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail {
    public  void MailText() {
        String to = "ssinha@newamps.co.in";
        String from = "ssinha@newamps.co.in";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "newamps.co.in");
        properties.put("mail.smtp.port", 587);


        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ssinha@newamps.co.in", "sus@2019");
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is message body");
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is message body");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            String filename = "Output/emailable-report.html";
            FileDataSource source =  new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler((source)));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Send mail successfully");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();

        }
    }
}
