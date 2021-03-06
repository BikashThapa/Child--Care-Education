package com.NCIT.CCE.Util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.NCIT.CCE.Dao.UserDaoImpl;

public class EmailUtility {

	public static void sendNewPassword(String userName, String email) {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("bthapa489@gmail.com", "DroaD12345");// change
				// accordingly
			}
		});
		try {
			String rand = GenerateRandomNumber
					.generateRandomChars("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 9);
			com.NCIT.CCE.Dao.UserDao udao = new UserDaoImpl();

			udao.updateUserPassword(rand, userName);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("bthapa489@gmail.com"));// change
			// accordingly
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("Password Recovery ");
			message.setText(userName + " Your new password is......." + rand);

			// send message
			Transport.send(message);
			System.out.printf(email);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
