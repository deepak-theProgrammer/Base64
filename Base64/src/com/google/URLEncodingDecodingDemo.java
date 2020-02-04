package com.google;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class URLEncodingDecodingDemo {

	public static void main(String[] args) {
//		Creating encoder and decoder
		Encoder encoder = Base64.getUrlEncoder();
		Decoder decoder = Base64.getUrlDecoder();
		
//		Encoding URL
		String eStr = encoder.encodeToString("https://github.com/deepak-theProgrammer/Base64".getBytes());
		System.out.println("Encoded url: "+eStr);
		
//		Decoding URL
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded url: "+dStr);
	}
}